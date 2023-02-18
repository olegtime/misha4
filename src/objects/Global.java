package objects;

public abstract class Global {
    private String name;

    public Global(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public boolean equals(Global global){
        if (global == null) return false;
        if (this.getClass() != global.getClass()) return false;
        if (name.equals(global.getName())) return true;
        return false;
    }

    public int hashCode(){
        return name.hashCode();
    }

    public String toString(){
        return getClass().getName() + '@' + Integer.toHexString(hashCode());
    }
}
