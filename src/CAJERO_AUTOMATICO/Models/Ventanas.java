package CAJERO_AUTOMATICO.Models;
import java.util.ArrayList;
import  java.util.Scanner;
import CAJERO_AUTOMATICO.Models.*;

public class Ventanas {

    static ArrayList<Objetos> objetos = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    static double saldo = 0;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";


    public static int menu () {
        System.out.println("Ingrese una opcion:");
        System.out.println(ANSI_YELLOW + "(1) Crear cuenta................" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "(2) Ingresar a su cuenta................" + ANSI_RESET);
        System.out.println("(3) Salir................");
        return input.nextInt();
    }

    public static void opciones() {
        int opcion = menu();
        switch (opcion) {
            case 1:
                crearCuenta();
                break;
            case 2:
                iniciarSesion();
                break;
            case 3:
                System.out.println("Adiossss....");
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }
    }

    public static void crearCuenta() {
        System.out.println("\n \n");
        System.out.println(ANSI_YELLOW + "Ingrese su id:");
        int id = input.nextInt();
        System.out.println(ANSI_YELLOW + "Ingrese su usuario:");
        String usuario = input.next();
        System.out.println(ANSI_YELLOW + "Cree su pin");
        int pin = input.nextInt();

        objetos.add(new Objetos(id, usuario, pin));
        System.out.println(objetos.toString());
        opciones();
    }

    public static void iniciarSesion() {
        System.out.println("\n \n");
        System.out.println("Ingrese su id:");
        int id = input.nextInt();
        System.out.println("Ingrese su usuario:");
        String usuario = input.next();
        boolean encontrado = false;
        for (Objetos objeto : objetos) {
            if (id == objeto.getId() && usuario.equals(objeto.getUsuario())) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            pantallaPrincipal();
        } else {
            System.out.println(ANSI_RED + "Usuario o ID incorrecto" + ANSI_RESET);
            iniciarSesion();
        }

    }

    public static void pantallaPrincipal() {
        System.out.println("\n \n");
        System.out.println("|| Saldo: $" + ANSI_GREEN + saldo + ANSI_RESET +  "||");
        System.out.println("\n");
        System.out.println("Opciones: ");
        System.out.println("(1) Ingresar saldo: ");
        System.out.println("(2) Retirar saldo: ");
        System.out.println("(3) Salir");
        int opcion = input.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Saldo a ingresar:");
                int ingresar = input.nextInt();
                saldo += ingresar;
                pantallaPrincipal();
                break;
            case 2:
                if (saldo > 0) {
                    System.out.println("Ingrese monto a retirar");
                    int retiro = input.nextInt();
                    System.out.println("Ingrese su pin para hacer el retiro:");
                    int pin = input.nextInt();
                    for (Objetos objeto : objetos) {
                        if (objeto.getPin() == pin) {
                            saldo -= retiro;
                        }
                    }
                    pantallaPrincipal();
                } else {
                    System.out.println("No cuenta con saldo, ingrese saldo");
                    pantallaPrincipal();
                }  break;
            case 3:
                opciones();
                break;
            default:
                System.out.println("Opcion incorrecta:");
                pantallaPrincipal();
                break;
        }

        }
}