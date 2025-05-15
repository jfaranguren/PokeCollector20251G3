package model;

public class Coin extends Accesory{

    private String heads;
    private String tails;
    
    public Coin(String name, String heads, String tails) {
        super(name);
        this.heads = heads;
        this.tails = tails;
    }

    public String getHeads() {
        return heads;
    }

    public void setHeads(String heads) {
        this.heads = heads;
    }

    public String getTails() {
        return tails;
    }

    public void setTails(String tails) {
        this.tails = tails;
    }

    @Override
    public String toString() {
        return "Coin [heads=" + heads + ", tails=" + tails + ", getName()=" + getName() + "]";
    }

    @Override
    public double calculatePrice() {
        
        return tails.length()*heads.length();
    }

    
    
}
