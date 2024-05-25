
import java.util.ArrayList;
import java.util.List;

// Interfejs bazowy dla produktow
interface Produkt {
    String pobierzOpis();
    double pobierzCene();
}

// Konkretny produkt
class KupionyProdukt implements Produkt {
    private String opis;
    private double cena;

    public KupionyProdukt(String opis, double cena) {
        this.opis = opis;
        this.cena = cena;
    }

    @Override
    public String pobierzOpis() {
        return opis;
    }

    @Override
    public double pobierzCene() {
        return cena;
    }
}

// Klasa dekoratora
abstract class ProduktDekorator implements Produkt {
    protected Produkt produkt;

    public ProduktDekorator(Produkt produkt) {
        this.produkt = produkt;
    }

    @Override
    public String pobierzOpis() {
        return produkt.pobierzOpis();
    }

    @Override
    public double pobierzCene() {
        return produkt.pobierzCene();
    }
}

// Konkretny dekorator - Maskotka
class Maskotka extends ProduktDekorator {
    public Maskotka(Produkt produkt) {
        super(produkt);
    }

    @Override
    public String pobierzOpis() {
        return produkt.pobierzOpis() + ", Maskotka sklepu";
    }

    @Override
    public double pobierzCene() {
        return produkt.pobierzCene();
    }
}

// Konkretny dekorator - Smycz
class Smycz extends ProduktDekorator {
    public Smycz(Produkt produkt) {
        super(produkt);
    }

    @Override
    public String pobierzOpis() {
        return produkt.pobierzOpis() + ", Smycz do pendrive";
    }

    @Override
    public double pobierzCene() {
        return produkt.pobierzCene() + 1.0;
    }
}

// Konkretny dekorator - Rabat
class Rabat extends ProduktDekorator {
    public Rabat(Produkt produkt) {
        super(produkt);
    }

    @Override
    public String pobierzOpis() {
        return produkt.pobierzOpis() + ", Rabat 10 PLN";
    }

    @Override
    public double pobierzCene() {
        double nowaCena = produkt.pobierzCene() - 10.0;
        return nowaCena < 0 ? 0 : nowaCena;
    }
}

// Konkretny dekorator - Koszt transportu
class KosztTransportu extends ProduktDekorator {
    public KosztTransportu(Produkt produkt) {
        super(produkt);
    }

    @Override
    public String pobierzOpis() {
        return produkt.pobierzOpis() + ", Dodatkowy koszt transportu";
    }

    @Override
    public double pobierzCene() {
        return produkt.pobierzCene() + 13.0;
    }
}

// Klasa obslugujaca zakupy
public class Sklep {
    public static void main(String[] args) {
        Produkt produkt = new KupionyProdukt("Produkt podstawowy", 50.0);

        // Dodanie dodatkow
        produkt = new Maskotka(produkt);
        produkt = new Smycz(produkt);
        produkt = new Rabat(produkt);
        produkt = new KosztTransportu(produkt);

        // Wyswietlenie opisu i ceny
        System.out.println("Zakupione produkty: " + produkt.pobierzOpis());
        System.out.println("Laczna cena: " + produkt.pobierzCene() + " PLN");
    }
}
