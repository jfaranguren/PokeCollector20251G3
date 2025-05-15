package model;

import java.util.ArrayList;

public class Controller {

    private ArrayList<Card> collection;

    public Controller() {
        collection = new ArrayList<Card>();
        testInfo();

        
    }

    public void testInfo() {
        Pokemon nuevaCarta = new Pokemon("Pikachu", 100, 60, Type.ELECTRICO);
        collection.add(nuevaCarta); // Guardar carta
    }

    public Type calculateType(int selection) {

        // return Type.values()[selection-1];

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

    public String getTypeList() {

        String list = "Los tipos registrados son:\n";

        for (int i = 0; i < Type.values().length; i++) {

            list += "" + (i + 1) + ". " + Type.values()[i] + "\n";

        }

        return list;

    }

    // Pokemon
    public boolean saveCard(String name, int hP, int aP, int type) {
        // Type t = calculateType(type);
        Card newCard = new Pokemon(name, hP, aP, calculateType(type));
        return collection.add(newCard);
    }

    // Trainer
    public boolean saveCard(String name, String description, String restriction) {
        Card newCard = new Trainer(name, description, restriction);
        return collection.add(newCard);
    }

    // Energy
    public boolean saveCard(String name, int type) {
        Card newCard = new Energy(name, calculateType(type));
        return collection.add(newCard);
    }

    public String getAllCardsName() {

        String list = "Las cartas registradas son: \n";

        for (Card c : collection) {
            list += c.getName() + "\n";
        }

        return list;

    }

    public String getCardInfo(String name) {

        String info = "";

        for (Card card : collection) {

            if (card.getName().equals(name)) {

                info = card.toString();
            }

        }

        return info;

    }

    public String showCollectionStatistics() {

        String result = "";

        int pkmnCount = 0, energyCount = 0, trainerCount = 0;

        for (Card card : collection) {

            if (card instanceof Pokemon) {
                pkmnCount++;
                // Pokemon temp = (Pokemon)card;
            }

            if (card instanceof Energy) {
                energyCount++;
            }

            if (card instanceof Trainer) {
                trainerCount++;
            }

        }

        result += "Hay " + pkmnCount + " cartas tipo Pokemon\n";
        result += "Hay " + energyCount + " cartas tipo Energy\n";
        result += "Hay " + trainerCount + " cartas tipo Trainer\n";

        return result;

    }

    public String getLongestDescriptionTrainer() {

        String info = "El Trainer con la descripcion mas larga es:\n";
        Trainer longestDescriptionTrainer = null;
        int longestDescription = 0;

        for (Card card : collection) {
            if (card instanceof Trainer) {

                Trainer temp = (Trainer) card; // Transformacion = Casting = Downcasting
                String descTemp = temp.getDescription();

                if (descTemp.length() > longestDescription) {
                    longestDescriptionTrainer = (Trainer) card;
                }

            }
        }

        return info + longestDescriptionTrainer.toString();

    }

}
