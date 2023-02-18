package enums;

public enum Duration {
    ALWAYS("всегда"),
    LONG("долгое время"),
    SHORT("недолгое время"),
    NEVER("никогда не");


    private final String TRANSLATE;

    Duration(String translate){
        this.TRANSLATE = translate;
    }

    public String getTranslate(){
        return this.TRANSLATE;
    }
}
