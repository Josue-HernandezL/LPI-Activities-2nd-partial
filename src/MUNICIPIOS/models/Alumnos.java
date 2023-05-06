package MUNICIPIOS.models;
import java.util.Scanner;
public class Alumnos {

    public static Scanner input = new Scanner(System.in);

    public static String[] alumnos = {"CANUL PECH, JOSUE DANIEL",
            "CHAN PACHECO, BRAYAN NATHANAEL",
            "CHAN ZEPEDA, ALAN SAURIEL",
            "COHUO CAAMAL, DIEGO JESUS",
            "DE LA CRUZ MENDEZ, JORGE NEFTALI",
            "FRANCISCO CAAMAL, LIZANDRO ADOLFO",
            "GOMEZ GUILLEN, JESHUA ADAHID",
            "GONZALEZ VELAZQUEZ, DAVID ANTONIO",
            "HERNANDEZ ARIAS, DANYAEL RAYMUNDO",
            "HERNANDEZ LOPEZ, JOSUE",
            "HERNANDEZ US, HECTOR LEONARDO",
            "HILERA PACHECO, CARLOS GAEL",
            "LOPEZ CALDERON, JUAN JOSE",
            "LUNA PEREZ, SHEILA MARIAN",
            "MARTIN GOMEZ, ROBERTO ANTONIO",
            "MARTIN MEDINA, LUIS SANTIAGO",
            "MAYO DOMINGUEZ, JOSE ANTONIO",
            "MENA TZEL, RAUL ROMAN",
            "NEGRON SALAZAR, DANNA GUISELLE",
            "ORTEGA CAMARA, CARLOS EDUARDO",
            "ORTIZ RODRIGUEZ, ABDIEL EMMANUEL",
            "PATIÑO TUN, HUGO ALBERTO",
            "PEÑA POLANCO, SOFIA GUADALUPE",
            "RIOS FUENTES, SEBASTIAN ELIGIO",
            "RODRIGUEZ DEL ANGEL, ERICK MANUEL",
            "ROSADO KEB, ANAHI CRISTAL",
            "SERRANO LOPEZ, JONATHAN EMMANUEL",
            "SOLIS CAUICH, PALOMA"};

    /*Realizar 3 arreglos, que contendrán el primero el código del municipio y su nombre,
    el segundo la cabecera municipal y tercero el número de habitantes, desplegar su codificación y nombre*/
        public  static String[][] codigo = {{"001", "002", "003", "004", "005", "006", "007", "008", "009", "010", "011"},
            {"Calakmul", "Campeche", "Candelaria", "Carmen", "Champoton", "Hecelchakan", "Hopelchen", "Palizada", "Tenabo", "Escarcega", "Jonuta"}};
        public  static String[] cabeceraMunicipal = {"Calakmul", "San francisco de Campeche", "Candelaria", "Carmen", "Champoton",
            "Hecelchakan", "Hopelchen", "Palizada", "Tenabo", "Escarcega", "Jonuta"};
        public  static int[] numeroDeHabitantes = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100};

}
