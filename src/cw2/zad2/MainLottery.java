package cw2.zad2;
import java.util.ArrayList;
import java.util.Random;

public class MainLottery {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<Person>();
        ArrayList<Advertisement> advertisementList = new ArrayList<Advertisement>();
        personList.add(new Person("Maty",new German(),new SMS()));
        personList.add(new Person("Stefan",new German(),new Synthesizer()));
        personList.add(new Person("Mario",new Polish(), new Email()));
        advertisementList.add(new Advertisement("W MediaMarkt Taniej!",new Polish()));
        advertisementList.add(new Advertisement("W MediaExpert Najtaniej!",new Polish()));
        advertisementList.add(new Advertisement("Noch günstiger in EuroRTVAGD!",new German()));

        Random rand = new Random();
        int people = rand.nextInt(personList.size());
        rand = new Random();
        int advertisment = rand.nextInt(advertisementList.size());
        Person luckyguy = personList.get(people);
        Advertisement happyadd = advertisementList.get(advertisment);
        System.out.println("Drawn: " + luckyguy.getName() +" - " + happyadd.getText());
        if(luckyguy.getLanguage() == happyadd.getLanguage()) {
            System.out.println("Add is in the prefered language for WINNER!");
        }
        else {
            System.out.println("Add translanting into: " + luckyguy.getLanguage());
        }

        System.out.println("Message send by "+ luckyguy.getMessage() + ": " + happyadd.getText());
    }
}
