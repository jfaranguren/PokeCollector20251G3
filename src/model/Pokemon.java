package model;

public class Pokemon extends Card {

    private int healthPoints;
    private int attackPower;
    private Type type;

    public Pokemon(String name, int healthPoints, int attackPower, Type type) {
        super(name);
        this.healthPoints = healthPoints;
        this.attackPower = attackPower;
        this.type = type;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pokemon [healthPoints=" + healthPoints + ", attackPower=" + attackPower + ", type=" + type
                + ", getName()=" + getName() + "]";
    }

    @Override
    public double calculatePrice() {
        
        return 1000*attackPower;
    }


   

    



    
    
}
