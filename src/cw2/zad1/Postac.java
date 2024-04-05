package cw2.zad1;

public class Postac {
    private String nazwa;
    private bron _bron;

    public Postac(String nazwa, bron bron) {
        this.nazwa = nazwa;
        this._bron = bron;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void atak(Postac cel) {
        System.out.println(this.nazwa + " ATAKUJE!");
        _bron.atak(cel);
    }
    public void otrzymajObrazenia(int damage){
        System.out.println(this.nazwa + " Otrzymał " + damage + " obrażeń");
    }
}
