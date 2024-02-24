import java.util.Random;
import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author cdavi
 */
public class Campeonato_Footbol {

    /**
     * @param args the command line arguments
     */
    //codigo para calcular resultados con numeros aleatorios David Rojas
    public static void main(String[] args) {
        // TODO code application logic here
        // Llamar a la función para calcular el resultado
        calcularResultado();
    }
    public static void calcularResultado() {
        // Crear un objeto Random para generar números aleatorios
        Random random = new Random();

        // Generar números aleatorios para los goles de dos equipos
        int golesEquipo1 = random.nextInt(11); // Números aleatorios de 0 a 10
        int golesEquipo2 = random.nextInt(11);
        int golesEquipo3 = random.nextInt(11);
        int golesEquipo4 = random.nextInt(11);
        int golesEquipo5 = random.nextInt(11);
        int golesEquipo6 = random.nextInt(11);

        // Imprimir el resultado
        System.out.println("Resultado del partido: Equipo 1 " + golesEquipo1 + " - " + golesEquipo2 + " Equipo 2" + " - " + golesEquipo3 + "Equipo 3" + " - " + golesEquipo4 + "Equipo 4" + " - " + golesEquipo5 + "Equipo 5" + " - " + golesEquipo6 + "Equipo 6");
    }
}
