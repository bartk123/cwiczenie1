package cw1.zad6;

public class mainPracownik {
    public static void main(String[] args) {
        Pracownik mechanik = new Pracownik("Listonosz", new RoznoszenieListow(), new LiteraturaPopularnoNaukowa(), new Samochod());

        mechanik.dojezdaj();
        mechanik.pracuj();
        mechanik.spedzajWolnyCzas();

    }
}
