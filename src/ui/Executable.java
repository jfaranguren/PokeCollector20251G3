package ui;

import java.util.Scanner;
import model.Controller;

public class Executable {

    private static Scanner input;
    private static Controller control;

    public static void main(String[] args) {
        initializer();
        menu();
    }

    public static void menu(){

        int opt = 0;
        do {

            System.out.println("Bienvenido a PokeCollector");
            System.out.println("Digite una opcion");
            System.out.println("1. Registrar carta");
            System.out.println("2. Mostrar listado de cartas");
            System.out.println("3. Modificar carta");
            System.out.println("0. Salir");
            opt = input.nextInt();

            switch (opt) {
                case 1:
                    askCardInformation();
                    break;
                case 2:
                    System.out.println();
                    break;
                case 3:
                    
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        } while (opt != 0);



    }

    public static void initializer(){
        input = new Scanner(System.in);
        control = new Controller();
    }

    public static void askCardInformation(){

        System.out.println("Digite el nombre de la carta");
        String name = input.nextLine();

        System.out.println("Digite los puntos de vida");
        int hP = input.nextInt();

        System.out.println("Digite los puntos de ataque");
        int aP = input.nextInt();

        input.nextLine(); //Limpieza del Buffer

        System.out.println("Digite el tipo");
        String type = input.nextLine();

        boolean result = control.saveCard(name, hP, aP, type);

        if(result){
            System.out.println("Tu carta ha sido guardada");
        }else{
            System.out.println("Error, tu carta no ha sido guardada");
        }

    }


    
}