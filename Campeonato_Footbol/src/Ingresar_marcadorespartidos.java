/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leticia
 */
import java.util.Scanner;
import java.util.Random;

// codigo Leticia SOntay Marcadores de los partidos
public class Ingresar_marcadorespartidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Inicialización del arreglo de equipos
        String[] equipos = new String[6];
        for (int i = 0; i < equipos.length; i++) {
            System.out.print("Ingrese el nombre del equipo " + (i + 1) + ": ");
            equipos[i] = scanner.nextLine();
        }

        // Inicialización de la matriz de marcadores
        int[][] marcadores = new int[6][6];

        // Iniciar partidos y calcular resultados
        for (int i = 0; i < equipos.length; i++) {
            for (int j = i + 1; j < equipos.length; j++) {
                int golesEquipo1 = random.nextInt(11);
                int golesEquipo2 = random.nextInt(11);
                marcadores[i][j] = golesEquipo1;
                marcadores[j][i] = golesEquipo2;
                System.out.println(equipos[i] + " " + golesEquipo1 + " - " + golesEquipo2 + " " + equipos[j]);
            }
        }

        scanner.close();
    }
}