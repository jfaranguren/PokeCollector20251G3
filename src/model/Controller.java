package model;

import java.util.ArrayList;

public class Controller {

    private ArrayList<Card> collection;

    public Controller(){
        collection = new ArrayList<Card>();
        testInfo();
    }

    public void testInfo(){
        Pokemon nuevaCarta = new Pokemon("Pikachu", 100, 60, Type.ELECTRICO);
        collection.add(nuevaCarta); //Guardar carta
    }

    public Type calculateType(int selection){

        //return Type.values()[selection-1];

        Type temp = Type.AGUA;

        switch (selection) {
            case 1:
                temp = Type.ELECTRICO;
                break;
            case 2:
                temp = Type.PLANTA;
                break;
            case 3:
                temp = Type.AGUA;
                break;
            case 4:
                temp = Type.FUEGO;
                break;
            default:
                temp = Type.AGUA;
                break;
        }

        return temp;


    }

    public String getTypeList(){

        String list = "Los tipos registrados son:\n";

        for(int i=0; i<Type.values().length;i++){

            list+=""+(i+1)+". "+Type.values()[i]+"\n";

        }

        return list;


    }
    
    //Pokemon
    public boolean saveCard(String name, int hP, int aP, int type){
        //Type t = calculateType(type);
        Card newCard = new Pokemon(name, hP, aP, calculateType(type));
        return collection.add(newCard);
    }

    //Trainer
    public boolean saveCard(String name, String description, String restriction){
        Card newCard = new Trainer(name, description, restriction);
        return collection.add(newCard);
    }

    //Energy
    public boolean saveCard(String name, int type){
        Card newCard = new Energy(name, calculateType(type));
        return collection.add(newCard);
    }
    
    public String getAllCardsInfo(){

        String list = "Las cartas registradas son: \n";

        for (Card c: collection) {
            list+=c.toString()+"\n";
        }

        return list;

    }


    
}
