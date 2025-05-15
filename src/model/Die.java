package model;

public class Die extends Accesory{

    private String color;
    private int sides;
    
    public Die(String name, String color, int sides) {
        super(name);
        this.color = color;
        this.sides = sides;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    @Override
    public String toString() {
        return "Die [color=" + color + ", sides=" + sides + ", getName()=" + getName() + "]";
    }

    @Override
    public double calculatePrice() {
        
        return 50*sides;
    }

    

    
    
}
