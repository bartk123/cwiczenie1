public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Mission mission1 = new Mission("Gold Coin", 10, inventory);
        Mission mission2 = new Mission("Silver Coin", 5, inventory);

        System.out.println("Adding items to inventory...");
        for (int i = 0; i < 12; i++) {
            inventory.addItem("Gold Coin");
        }

        for (int i = 0; i < 3; i++) {
            inventory.addItem("Silver Coin");
        }

        System.out.println("Removing items from inventory...");
        inventory.removeItem("Gold Coin");
        inventory.removeItem("Silver Coin");

        System.out.println("Adding more items to inventory...");
        for (int i = 0; i < 3; i++) {
            inventory.addItem("Silver Coin");
        }
    }
}
