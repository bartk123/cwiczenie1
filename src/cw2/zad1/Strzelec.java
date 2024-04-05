package cw2.zad1;

public class Strzelec implements bron{
    @Override
    public void atak(Postac cel) {
        cel.otrzymajObrazenia(25);
    }
}