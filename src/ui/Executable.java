package ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import exceptions.CollectableNotFoundException;
import exceptions.ThereIsNoTrainerException;
import model.Controller;

public class Executable {

    private Scanner input;
    private Controller control;

    public static void main(String[] args) {
        Executable exe = new Executable();
        exe.menu();
    }

    public Executable() {
        input = new Scanner(System.in);
        control = new Controller();
    }

    public void menu() {

        int opt = -1;
        do {

            System.out.println("Bienvenido a PokeCollector");
            System.out.println("1. Registrar carta");
            System.out.println("2. Mostrar listado de objetos de la coleccion");
            System.out.println("3. Consultar informacion de un objeto de la coleccion");
            System.out.println("4. Mostrar Trainer con mayor descripcion");
            System.out.println("0. Salir");

            boolean flag = false;

            while (!flag) {
                try {
                    System.out.println("Digite una opcion");
                    opt = input.nextInt(); // ¿Que pasa si el usuario digita algo diferente a un numero?
                } catch (InputMismatchException e) {
                    input.nextLine();
                    opt = -1;
                    flag = false;
                }
                flag = true;
            }

            switch (opt) {
                case 1:
                    System.out.println("1. Registrar Pokemon");
                    System.out.println("2. Registrar Entrenador");
                    System.out.println("3. Registrar Energia");
                    int registerOption = input.nextInt();
                    switch (registerOption) {
                        case 1:
                            askPokemonInformation();
                            break;
                        case 2:
                            askTrainerInformation();
                            break;
                        case 3:
                            askEnergyInformation();
                            break;
                        default:
                            System.out.println("Opcion invalida, volviendo al menu principal");
                            break;
                    }

                    break;
                case 2:
                    System.out.println(control.getAllCollectablesName());
                    break;
                case 3:
                    showCardInfo();
                    break;
                case 4:
                    try {
                        System.out.println(control.getLongestDescriptionTrainer());
                    } catch (ThereIsNoTrainerException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 0:
                    System.out.println("Adios");
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        } while (opt != 0);

    }

    public void showCardInfo() {

        input.nextLine();

        System.out.println("Digite el nombre de la carta");
        String name = input.nextLine();

        try {
            System.out.println(control.getCollectableInfo(name));
            System.out.println(control.getCollectablePrice(name));
        } catch (CollectableNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    public void askPokemonInformation() {

        input.nextLine();

        System.out.println("Digite el nombre de la carta");
        String name = input.nextLine();

        System.out.println("Digite los puntos de vida");
        int hP = input.nextInt();

        System.out.println("Digite los puntos de ataque");
        int aP = input.nextInt();

        System.out.println(control.getTypeList());
        System.out.println("Digite el tipo");
        int type = input.nextInt();

        boolean result = control.saveCard(name, hP, aP, type);

        if (result) {
            System.out.println("Tu carta ha sido guardada");
        } else {
            System.out.println("Error, tu carta no ha sido guardada");
        }

    }

    public void askTrainerInformation() {

        input.nextLine();

        System.out.println("Digite el nombre de la carta");
        String name = input.nextLine();

        System.out.println("Digite la descripcion de la carta");
        String description = input.nextLine();

        System.out.println("Digite la restriccion de la carta");
        String restriction = input.nextLine();

        boolean result = control.saveCard(name, description, restriction);

        if (result) {
            System.out.println("Tu carta ha sido guardada");
        } else {
            System.out.println("Error, tu carta no ha sido guardada");
        }

    }

    public void askEnergyInformation() {

        input.nextLine();

        System.out.println("Digite el nombre de la carta");
        String name = input.nextLine();

        System.out.println(control.getTypeList());
        System.out.println("Digite el tipo");
        int type = input.nextInt();

        boolean result = control.saveCard(name, type);

        if (result) {
            System.out.println("Tu carta ha sido guardada");
        } else {
            System.out.println("Error, tu carta no ha sido guardada");
        }

    }

}