public class Mission {
    private String itemName;
    private int requiredAmount;
    private Inventory inventory;

    public Mission(String itemName, int requiredAmount, Inventory inventory) {
        this.itemName = itemName;
        this.requiredAmount = requiredAmount;
        this.inventory = inventory;
        this.inventory.addObserver(this);
    }

    public void update(String item, int currentAmount) {
        if (item.equals(itemName) && currentAmount >= requiredAmount) {
            System.out.println("Mission accomplished! Collected enough " + itemName + ".");
            inventory.removeObserver(this);
        }
    }

    public String getItemName() {
        return itemName;
    }

    public int getRequiredAmount() {
        return requiredAmount;
    }
}
