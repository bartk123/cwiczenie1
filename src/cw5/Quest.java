public class Quest implements Observer {
    private String itemName;
    private int requiredCount;
    private int currentCount;

    public Quest(String itemName, int requiredCount) {
        this.itemName = itemName;
        this.requiredCount = requiredCount;
        this.currentCount = 0;
    }

    @Override
    public void update(String item, int count) {
        if (item.equals(itemName)) {
            currentCount = count;
            checkCompletion();
        }
    }

    private void checkCompletion() {
        if (currentCount >= requiredCount) {
            System.out.println("Zadanie ukończone: Zbierz " + requiredCount + " " + itemName + "(y)");
            // Here you would remove this quest from the observer list in Inventory
        } else {
            System.out.println("Postęp zadania: " + currentCount + "/" + requiredCount + " " + itemName + "(y)");
        }
    }

    public String getItemName() {
        return itemName;
    }

    public int getRequiredCount() {
        return requiredCount;
    }
}
