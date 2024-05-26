import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
    private Map<String, Integer> items;
    private List<Mission> observers;

    public Inventory() {
        items = new HashMap<>();
        observers = new ArrayList<>();
    }

    public void addItem(String item) {
        items.put(item, items.getOrDefault(item, 0) + 1);
        notifyObservers(item);
    }

    public void removeItem(String item) {
        if (items.containsKey(item) && items.get(item) > 0) {
            items.put(item, items.get(item) - 1);
            notifyObservers(item);
        }
    }

    public void addObserver(Mission mission) {
        observers.add(mission);
    }

    public void removeObserver(Mission mission) {
        observers.remove(mission);
    }

    private void notifyObservers(String item) {
        for (Mission mission : new ArrayList<>(observers)) {
            mission.update(item, items.get(item));
        }
    }
}
