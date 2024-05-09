package cw2.zad2;

public class Person {
    private language lang;

    private Message message;
    private String name;

    public Person(String name, language lang, Message message){
        this.name = name;
        this.lang = lang;
        this.message = message;
    }
    public String getLanguage(){
        return lang.typeLanguage();
    }
    public String getName() {
        return this.name;
    }
    public String getMessage() {
        return message.TypeMessage();
    }
}
