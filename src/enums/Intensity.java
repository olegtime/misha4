package enums;

public enum Intensity {
    QUICKLY("торопливо"),
    CALMLY("спокойно"),
    SLOWLY("неторопливо");

    private final String TRANSLATE;

    Intensity(String translate){
        this.TRANSLATE = translate;
    }

    public String getTranslate(){
        return this.TRANSLATE;
    }
}
