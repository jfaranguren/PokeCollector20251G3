package model;

import java.util.ArrayList;

public class Controller {

    private ArrayList<Collectable> collection;

    public Controller() {
        collection = new ArrayList<Collectable>();
        testInfo();        
    }

    public void testInfo() {
        Pokemon nuevaCarta = new Pokemon("Pikachu", 100, 60, Type.ELECTRICO);
        collection.add(nuevaCarta); // Guardar carta
    }

    //¿Que pasa si el usuario selecciona un valor invalido?
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

    public String getAllCollectablesName() {

        String list = "Las cartas registradas son: \n";

        for (Collectable c : collection) {
            list += c.getName() + "\n";
        }

        return list;

    }

    //¿Que pasa si no la encuentra?
    public String getCollectableInfo(String name) {

        String info = "";

        for (Collectable c : collection) {

            if (c.getName().equals(name)) {

                info = c.toString();
            }

        }

        return info;

    }

    public String getCollectablePrice(String name) {

        String info = "";

        for (Collectable c : collection) {

            if (c.getName().equals(name)) {

                info = "El precio es: "+c.calculatePrice();
            }

        }

        return info;

    }

    public String showCollectionStatistics() {

        String result = "";

        int pkmnCount = 0, energyCount = 0, trainerCount = 0;

        for (Collectable c : collection) {

            if (c instanceof Pokemon) {
                pkmnCount++;
            }

            if (c instanceof Energy) {
                energyCount++;
            }

            if (c instanceof Trainer) {
                trainerCount++;
            }

        }

        result += "Hay " + pkmnCount + " cartas tipo Pokemon\n";
        result += "Hay " + energyCount + " cartas tipo Energy\n";
        result += "Hay " + trainerCount + " cartas tipo Trainer\n";

        return result;

    }

    //¿Que pasa si no hay entrenadores?
    public String getLongestDescriptionTrainer() {

        String info = "El Trainer con la descripcion mas larga es:\n";
        Trainer longestDescriptionTrainer = null;
        int longestDescription = 0;

        for (Collectable c : collection) {
            if (c instanceof Trainer) {

                Trainer temp = (Trainer) c; // Transformacion = Casting = Downcasting
                String descTemp = temp.getDescription();

                if (descTemp.length() > longestDescription) {
                    longestDescriptionTrainer = (Trainer) c;
                }

            }
        }

        return info + longestDescriptionTrainer.toString();

    }

}
