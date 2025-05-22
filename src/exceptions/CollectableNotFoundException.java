package exceptions;

public class CollectableNotFoundException extends Exception{

    public CollectableNotFoundException(){
        super("No se encuentra el elemento en la coleccion");
    }
    
}
