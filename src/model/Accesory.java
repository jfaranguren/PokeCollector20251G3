package model;

public abstract class Accesory implements CalculatePrice{
    
    private String name;

    public Accesory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
