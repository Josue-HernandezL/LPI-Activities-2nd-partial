package MUNICIPIOS.models;
import static MUNICIPIOS.models.Alumnos.*;

public class MetodosSolicitados {

    public static void metodos() {
        dividirApellidos();
        metodo_2Ymetodo_3();

    }

    //Subir la actividad de crear un nuevo arreglo de Alumnos del 2B, que contenga solo los apellidos.
    public static void dividirApellidos() {
        String[] apellidos = new String[alumnos.length];
        for (int i = 0; i < alumnos.length; i++) {
            String alumno = alumnos[i];
            int position = alumno.indexOf(",", 0);
            String subCadena = alumno.substring(0, position);
            apellidos[i] = subCadena;
            System.out.println((i + 1) + "-. " + subCadena);
        }
    }

    public static void metodo_1() {
        for (int i = 0; i < codigo.length; i++) {
            String[] codigo_name = codigo[i];
            for (int j = 0; j < codigo_name.length; j++) {
                String code = codigo_name[j];
                System.out.println(code);
            }
        }
    }

    /*Leer un número del 1 al 12, validar que se cumpla la condición de este rango, e imprimir nombre del municipio,
    el nombre de la cabecera municipal y su población total.*/
    /*Del número leído, desplegar el municipio anterior y el municipio posterior, si es 1 solo imprimir el posterior,
    si es 12 imprimir solo el anterior, utilizar los operadores de incremento y decremento.*/
    public static void metodo_2Ymetodo_3() {
        System.out.println("Ingrese un numero del 1 al 11:");
        int numero = input.nextInt();
        if (numero >= 1 && numero <= 11) {
            metodo_1();

            int posicion = numero - 1;
            String municipioActual = cabeceraMunicipal[posicion];

            // Imprimir municipio anterior
            if (numero > 1) {
                String municipioAnterior = cabeceraMunicipal[posicion - 1];
                System.out.println("Municipio anterior: " + municipioAnterior);
            } else if (numero == 1) {
                String municipioPosterior = cabeceraMunicipal[posicion + 1];
                System.out.println("Municipio posterior: " + municipioPosterior);
            }

            // Imprimir municipio posterior
            if (numero < 11) {
                String municipioPosterior = cabeceraMunicipal[posicion + 1];
                System.out.println("Municipio posterior: " + municipioPosterior);
            } else if (numero == 11) {
                String municipioAnterior = cabeceraMunicipal[posicion - 1];
                System.out.println("Municipio anterior: " + municipioAnterior);
            }

            // Imprimir información de todos los municipios
            for (int i = 0; i < cabeceraMunicipal.length; i++) {
                System.out.println(cabeceraMunicipal[i]);
                System.out.println(numeroDeHabitantes[i]);
            }
        } else {
            System.out.println("Error de numero, no es valido");
        }
    }

}
