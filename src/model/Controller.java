package model;

import java.util.ArrayList;

public class Controller {

    private ArrayList<Card> collection;

    public Controller(){
        collection = new ArrayList<Card>();
        testInfo();
    }

    public void testInfo(){
        Card nuevaCarta = new Card("Pikachu", 100, 60, "Electrico");
        collection.add(nuevaCarta); //Guardar carta
    }
    
    public boolean saveCard(String name, int hP, int aP, String type){

        Card newCard = new Card(name, hP, aP, type);

        return collection.add(newCard);
    }

    public String getAllCardsInfo(){

        String list = "Las cartas registradas son: \n";

        for (Card c: collection) {
            list+=c.toString();
        }

        return list;

    }


    
}
