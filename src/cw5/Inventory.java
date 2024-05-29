import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

interface Observer {
    void update(String item, int count);
}

public class Inventory implements Subject {
    private List<Observer> observers;
    private Map<String, Integer> items;

    public Inventory() {
        observers = new ArrayList<>();
        items = new HashMap<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            for (Map.Entry<String, Integer> entry : items.entrySet()) {
                observer.update(entry.getKey(), entry.getValue());
            }
        }
    }

    public void addItem(String item) {
        items.put(item, items.getOrDefault(item, 0) + 1);
        notifyObservers();
    }

    public void removeItem(String item) {
        if (items.containsKey(item)) {
            if (items.get(item) > 1) {
                items.put(item, items.get(item) - 1);
            } else {
                items.remove(item);
            }
            notifyObservers();
        }
    }

    public int getItemCount(String item) {
        return items.getOrDefault(item, 0);
    }
}
