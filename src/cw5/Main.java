public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Quest quest1 = new Quest("Jabłko", 5);
        Quest quest2 = new Quest("Banan", 3);

        inventory.registerObserver(quest1);
        inventory.registerObserver(quest2);

        System.out.println("Dodawanie przedmiotów do ekwipunku:");
        inventory.addItem("Jabłko");
        inventory.addItem("Jabłko");
        inventory.addItem("Banan");
        inventory.addItem("Jabłko");
        inventory.addItem("Banan");
        inventory.addItem("Jabłko");
        inventory.addItem("Jabłko");
        inventory.addItem("Banan");
        inventory.addItem("Jabłko");
        inventory.addItem("Jabłko");
    }
}
