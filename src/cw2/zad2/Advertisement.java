package cw2.zad2;

public class Advertisement {
    private language lang;

    private String text;

    public Advertisement(String text, language lang){
        this.text = text;
        this.lang = lang;
    }
    public String getLanguage(){
        return lang.typeLanguage();
    }
    public String getText() {
        return this.text;
    }
}
