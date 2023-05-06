package METODOS_SOLICITADOS.models;
import static METODOS_SOLICITADOS.models.Alumnos.*;

public class MetodosSolicitados {

    public static void factorial (){
        System.out.println("Ingrese un numero");
        int numeroUsuario = input.nextInt();
        int factorial = 1;
        for (int i = 1; i <= numeroUsuario; i++) {
            factorial *= i;
        }
        System.out.println("Factorial de: " + numeroUsuario + " es igual : " + factorial);
        menu();
    }
    public static void sumaDeLaMedia () {
        double numeroUsuario = input.nextInt();
        double suma = 0;
        for (int i = 0; i <= numeroUsuario; i++) {
            suma += i;
        }
        System.out.println("La suma de cero hasta " + numeroUsuario + " es igual a: " + suma);
        System.out.println("La media de la suma es: " + suma/numeroUsuario);
        menu();
    }
    public static void leerNumeroNveces () {
        System.out.print("Ingrese un numero:");
        int numero = input.nextInt();
        double suma = 0;
        double promedio;
        int numeroMayor = 0;
        int numeroMenor = 0;
        int distanciaNumerica;
        for (int i = 0; i <= numero ; i++) {
            suma += i;
            if (i > numeroMayor) {
                numeroMayor = i;
            } else if (i > numeroMenor) {
                numeroMenor = i;
            }
        }
        promedio = suma/numero;
        distanciaNumerica = numeroMenor-2;
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
        System.out.println("Numero menor: " + numeroMenor);
        System.out.println("Numero mayor: " + numeroMayor);
        System.out.println("Distancia numerica: " + distanciaNumerica);
        menu();
    }
    public static void alturaDeCompanneros () {
        System.out.println("Ingrese el numero de alumnos:");
        int nAlumnos = input.nextInt();
        double[] alturasA = new double[nAlumnos];
        double alturaMayor = alturasA[0], alturaMenor = Double.MAX_VALUE;
        String alumnoMayor = "";
        String alumnoMenor = "";
        for (int i = 0; i < nAlumnos; i++) {
            System.out.println("Ingrese la altura de su compañero " + alumnos[i]);
            alturasA[i] = input.nextDouble();
            if (alturasA[i] > alturaMayor) {
                alturaMayor = alturasA[i];
                alumnoMayor = alumnos[i];
            }
            if (alturasA[i] < alturaMenor) {
                alturaMenor = alturasA[i];
                alumnoMenor = alumnos[i];
            }
        }
        System.out.println("La altura mayor de " + alumnoMayor + " es: " + alturaMayor);
        System.out.println("La altura menor de " + alumnoMenor + " es: " + alturaMenor);
        menu();
    }
    public static void listaAlumnos (){
        System.out.println("Esta es la lista de los alumnos del 2B:");
        for (int i = 0; i <= alumnos.length; i++) {
            System.out.println(i + 1 + ".-" + alumnos[i]);
        }
        menu();
    }
    public static void alumnoPosition () {
        System.out.println("Ingrese la posición del alumno que desea buscar:");
        int position = input.nextInt();
        System.out.println(alumnos[position-1]);
        menu();
    }
    public static void menu () {
        System.out.print("Ingrese el numero de su elección del menu:");
        System.out.println("""
                (1)factorial
                (2)sumaDeLaMedia
                (3)leerNumeroNveces
                (4)alturaDeCompañeros
                (5)listaAlumnos
                (6)alumnoPosition
                (7)Salir""");
        int opcion = input.nextInt();
        switch (opcion) {
            case 1:
                factorial();
                break;
            case 2:
                sumaDeLaMedia();
                break;
            case 3:
                leerNumeroNveces();
                break;
            case 4:
                alturaDeCompanneros();
                break;
            case 5:
                listaAlumnos();
                break;
            case 6:
                alumnoPosition();
                break;
            case 7:
                System.out.println("Adios...");
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
    }


}
