package model;

public abstract class Accesory implements Collectable{
    
    private String name;

    public Accesory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
