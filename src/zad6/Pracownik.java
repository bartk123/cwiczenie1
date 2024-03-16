package zad6;

public class Pracownik {
    String zawod;
    Pracowac pracowac;
    SpedzanieWolnegoCzasu spedzanieWolnegoCzasu;
    Dojezdzac dojezdzac;


    public Pracownik(String zawod, Pracowac pracowac, SpedzanieWolnegoCzasu spedzanieWolnegoCzasu, Dojezdzac dojezdzac)
    {
        this.zawod = zawod;
        this.pracowac = pracowac;
        this.spedzanieWolnegoCzasu = spedzanieWolnegoCzasu;
        this.dojezdzac = dojezdzac;
    }

}
