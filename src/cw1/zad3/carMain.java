package cw1.zad3;

public class carMain {
    public static void main(String[] args) {
        car maluch = new car(new badEngine(), "Opel Astra 1.4");
        car audi = new car(new BestEngine(), "BMW M4 2.0");

        System.out.println("SALON SAMOCHODOWY POSIADANE AUTA:");

        System.out.println("Samochód: " + maluch.GetCarName() + ", Osiągi: " + maluch.GetSpeed());
        System.out.println("Samochód: " + audi.GetCarName() + ", Osiągi: " + audi.GetSpeed());


    }
}