/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leticia
 */

import java.util.Scanner;

// codigo leticia sontay ingresar nombre de los equipos

public class Ingresar_NombreEquipo {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los nombres de los 6 equipos:");

        String[] equipos = new String[6];
        for (int i = 0; i < equipos.length; i++) {
            System.out.print("Equipo " + (i + 1) + ": ");
            equipos[i] = scanner.nextLine();
        }

        System.out.println("\nLos nombres de los equipos son:");
        for (int i = 0; i < equipos.length; i++) {
            System.out.println("Equipo " + (i + 1) + ": " + equipos[i]);
        }

        scanner.close();
    }
}
    

