package model;

public class Energy extends Card{

    private Type type;

    public Energy(String name, Type type) {
        super(name);
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Energy [type=" + type + ", getName()=" + getName() + "]";
    }

    @Override
    public double calculatePrice() {
        
        return 500;
    }

    
    
}
