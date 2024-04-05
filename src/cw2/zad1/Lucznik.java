package cw2.zad1;

public class Lucznik implements bron{
    @Override
    public void atak(Postac cel) {
        cel.otrzymajObrazenia(15);
    }
}