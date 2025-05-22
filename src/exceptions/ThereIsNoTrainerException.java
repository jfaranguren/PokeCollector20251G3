package exceptions;

public class ThereIsNoTrainerException extends Exception{

    public ThereIsNoTrainerException(){
        super("No hay Trainers registrados");
    }
    
}
