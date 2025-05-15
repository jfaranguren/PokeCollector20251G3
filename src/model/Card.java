package model;

public abstract class Card implements CalculatePrice{

    //Atributos
    private String name;
   
    public Card(String name){
        this.name = name;
    }
    
    public void setName(String newName){ //Modificador
        name = newName;
    }

    public String getName(){ //Analizador
        return name;
    }

    
}
