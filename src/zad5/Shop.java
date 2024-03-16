package zad5;

import java.lang.ref.Cleaner;

public class Shop {
    public static void BuyProduct(Client client, Product product)
    {
        System.out.println("Produkt: " + product.productName +  "| CENA: "+ (product.price_nt + (product.price_nt * client.country.tax()))+"zł | ZAKUPIŁ: " + client.firstName + " KRAJ: " + client.country.getName());
    }
    public static void main(String[] args) {
        Client gregory = new Client(new Poland(), "Grzegorz", "Brzęczyszczykiewicz");
        Client xavie = new Client(new GreatBritain(), "Xavier", "Molata");
        Client lukas = new Client(new Germany(), "Lukas", "Nani");

        Product calculator = new Product("Kalkulator",300.0f);

        BuyProduct(gregory, calculator);
        BuyProduct(xavie, calculator);
        BuyProduct(lukas, calculator);
    }

}
