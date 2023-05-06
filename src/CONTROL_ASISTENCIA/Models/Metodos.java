package CONTROL_ASISTENCIA.Models;
import static CONTROL_ASISTENCIA.Models.Alumnos.*;

public class Metodos {

    public static void asignarAsistencia() {
        System.out.println("Ingrese las asistencias de los alumnos (0 falta, 1 asistencia):");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.print(alumnos[i] + ": ");
            asistencia[i] = scanner.nextInt();
        }
        mostrarMenu();
    }
    public static void mostrarFaltas() {
        System.out.println("Alumnos con faltas:");
        for (int i = 0; i < alumnos.length; i++) {
            if (asistencia[i] == 0) {
                System.out.println(alumnos[i]);
            }
        }
        mostrarMenu();
    }
    public static void mostrarAsistencias() {
        System.out.println("Alumnos con asistencia:");
        for (int i = 0; i < alumnos.length; i++) {
            if (asistencia[i] == 1) {
                System.out.println(alumnos[i]);
            }
        }
        mostrarMenu();
    }
    public static void mostrarMenu() {
        int opcion = 0;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Asignar asistencia");
            System.out.println("2. Mostrar alumnos con faltas");
            System.out.println("3. Mostrar alumnos con asistencia");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    asignarAsistencia();
                    break;
                case 2:
                    mostrarFaltas();

                    break;
                case 3:
                    mostrarAsistencias();

                    break;
                case 4:
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 4);
    }

}
