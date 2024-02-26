/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leticia
 */
import java.util.Scanner;

// Codigo Leticia Sontay opcion para crear un nuevo campeonato
public class Opcion_nuevocampeonato {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {         
            // Codigo del campeonato

            System.out.print("\n¿Desea iniciar un nuevo campeonato? (s/n): ");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("s")) {
                break; // Salir del bucle si la respuesta no es "s"
            }
        }

        System.out.println("¡Gracias por participar en el campeonato!");
        scanner.close();
    }
}
