package cw1.zad6;

public class Pracownik {
    private String zawod;
    private Pracowac pracowac;
    private SpedzanieWolnegoCzasu spedzanieWolnegoCzasu;
    private Dojezdzac dojezdzac;


    public Pracownik(String zawod, Pracowac pracowac, SpedzanieWolnegoCzasu spedzanieWolnegoCzasu, Dojezdzac dojezdzac)
    {
        this.zawod = zawod;
        this.pracowac = pracowac;
        this.spedzanieWolnegoCzasu = spedzanieWolnegoCzasu;
        this.dojezdzac = dojezdzac;
    }
    public void dojezdaj (){
        System.out.println("Mój dojazd to: " + dojezdzac.dojezdzaj());
    }
    public void pracuj () {
        System.out.println("Pracuje: " + pracowac.pracuj());
    }

    public void spedzajWolnyCzas (){
        System.out.println("Wolny czas spedzam: " + spedzanieWolnegoCzasu.spedzajWolnyCzas());

    }

}
