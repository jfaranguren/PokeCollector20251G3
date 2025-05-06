package model;

public class Card {

    //Atributos
    private String name;
    private int healthPoints;
    private int attackPower;
    private String type;

    public Card(String name, int healthPoints, int attackPower, String type){
        this.name = name;
        this.healthPoints = healthPoints;
        this.attackPower = attackPower;
        this.type = type;
    }
    
    public void setName(String newName){ //Modificador
        name = newName;
    }

    public String getName(){ //Analizador
        return name;
    }

    public void setHealthPoints(int newHealthPoints){
        healthPoints = newHealthPoints;
    }

    public int getHealthPoints(){
        return healthPoints;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", healthPoints=" + healthPoints + ", attackPower=" + attackPower + ", type="
                + type + "]";
    }
       

    
}
