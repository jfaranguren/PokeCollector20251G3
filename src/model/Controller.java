package model;

public class Controller {

    private Card[] collection;

    public Controller(){
        collection = new Card[1000];

        Card nuevaCarta = new Card("Pikachu", 100, 60, "Electrico");
        collection[0]=nuevaCarta; //Guardar carta

    }

    
    public boolean saveCard(String name, int hP, int aP, String type){

        Card newCard = new Card(name, hP, aP, type);

        for (int index = 0; index < collection.length; index++) {

            if(collection[index]==null){
            collection[index] = newCard;
            return true;
            }
            
        }

        return false;
    }
    
}
