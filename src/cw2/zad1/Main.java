package cw2.zad1;

public class Main {
    public static void main(String[] args) {

        System.out.println("Twoja drużyna zdecydowała zaatakować smoka!");
        
        Postac strzelec = new Postac("Strzelec", new Strzelec());
        Postac lucznik = new Postac("Łucznik", new Kanonier());
        Postac rycerz = new Postac("Rycerz", new Rycerz());
        Postac kanonier = new Postac("Kanonier", new Lucznik());

        strzelec.atak(new Postac("Smok", null));
        lucznik.atak(new Postac("Smok", null));
        rycerz.atak(new Postac("Smok", null));
        kanonier.atak(new Postac("Smok", null));

        System.out.println("Twoja drużyna pokonała SMOKA!");
    }

}
