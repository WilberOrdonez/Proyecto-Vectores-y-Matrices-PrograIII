/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leticia
 */
import java.util.Random;
import java.util.Scanner;

//Davis y Leticia

public class Campeonato_final {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("CAMPEONATO FOOTBOL");

            // Ingresar los nombres de los equipos Leticia Sontay
            System.out.println("Ingrese los nombres de los 6 equipos:");
            String[] equipos = new String[6];
            for (int i = 0; i < equipos.length; i++) {
                System.out.print("Equipo " + (i + 1) + ": ");
                equipos[i] = scanner.nextLine();
            }

            // Mostrar los nombres de los equipos ingresados
            System.out.println("\nLos nombres de los equipos son:");
            for (int i = 0; i < equipos.length; i++) {
                System.out.println("Equipo " + (i + 1) + ": " + equipos[i]);
            }

            // Generar marcadores Leticia Sontay
            int[][] marcadores = new int[6][6];
            System.out.println("\nMARCADOR:");

            for (int i = 0; i < equipos.length; i++) {
                for (int j = i + 1; j < equipos.length; j++) {
                    int golesEquipo1 = random.nextInt(11);
                    int golesEquipo2 = random.nextInt(11);
                    marcadores[i][j] = golesEquipo1;
                    marcadores[j][i] = golesEquipo2;
                    System.out.println(equipos[i] + " " + golesEquipo1 + " - " + golesEquipo2 + " " + equipos[j]);
                }
            }

            // Crear una matriz para almacenar la puntuación de cada equipo David Rojas
            int[][] puntuacion = new int[equipos.length][3]; // Columnas: PJ (Partidos Jugados), PG (Partidos Ganados), y PE (Partidos Empatados)

            // Simular algunos resultados de partidos
            simularResultados(equipos, puntuacion, 20);

            // Mostrar la tabla de puntuación
            mostrarTabla(equipos, puntuacion);

            // Determinar al campeón
            String campeon = determinarCampeon(equipos, puntuacion);
            System.out.println("\n¡El campeón del campeonato es: " + campeon + "!");

            // Preguntar si el usuario quiere iniciar un nuevo campeonato Leticia Sontay
            System.out.print("\n¿Desea iniciar un nuevo campeonato? (s/n): ");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("s")) {
                break; // Salir del bucle si la respuesta no es "s"
            }
        }

        System.out.println("¡BUEN CAMPEONATO!");
        scanner.close();
    }

    // Método para simular resultados de partidos David Rojas
    public static void simularResultados(String[] equipos, int[][] puntuacion, int cantidadPartidos) {
        Random random = new Random();

        for (int i = 0; i < cantidadPartidos; i++) {
            int equipoLocal = random.nextInt(equipos.length);
            int equipoVisitante = random.nextInt(equipos.length);

            // Asegurarse de que el equipo local y el equipo visitante sean diferentes
            while (equipoLocal == equipoVisitante) {
                equipoVisitante = random.nextInt(equipos.length);
            }

            // Simular el resultado del partido (0 - empate, 1 - gana el equipo local, 2 - gana el equipo visitante)
            int resultado = random.nextInt(3);

            // Registrar el resultado del partido en la tabla de puntuación
            registrarPartido(equipos, puntuacion, equipoLocal, equipoVisitante, resultado);
        }
    }

    // Método para registrar los resultados de un partido David Rojas
    public static void registrarPartido(String[] equipos, int[][] puntuacion, int equipoLocal, int equipoVisitante, int resultado) {
        // resultado: 0 - empate, 1 - gana el equipo local, 2 - gana el equipo visitante

        // Incrementar partidos jugados
        puntuacion[equipoLocal][0]++;
        puntuacion[equipoVisitante][0]++;

        // Actualizar partidos ganados, empatados o perdidos según el resultado
        if (resultado == 0) {
            // Empate
            puntuacion[equipoLocal][2]++;
            puntuacion[equipoVisitante][2]++;
        } else if (resultado == 1) {
            // Gana el equipo local
            puntuacion[equipoLocal][1]++;
        } else {
            // Gana el equipo visitante
            puntuacion[equipoVisitante][1]++;
        }
    }

    // Método para mostrar la tabla de puntuación David Rojas
    public static void mostrarTabla(String[] equipos, int[][] puntuacion) {
        System.out.println("\nTabla de Puntuación:");
        System.out.printf("%-15s%-10s%-10s%-10s%n", "Equipo", "PJ", "PG", "PE");

        for (int i = 0; i < equipos.length; i++) {
            System.out.printf("%-15s%-10d%-10d%-10d%n",
                    equipos[i],
                    puntuacion[i][0],  // PJ (Partidos Jugados)
                    puntuacion[i][1],  // PG (Partidos Ganados)
                    puntuacion[i][2]); // PE (Partidos Empatados)
        }
    }

    // Método para determinar al campeón David Rojas
    public static String determinarCampeon(String[] equipos, int[][] puntuacion) {
        int maxPuntos = -1;
        String campeon = "";

        for (int i = 0; i < equipos.length; i++) {
            int puntos = puntuacion[i][1] * 3 + puntuacion[i][2];

            if (puntos > maxPuntos) {
                maxPuntos = puntos;
                campeon = equipos[i];
            }
        }

        return campeon;
    }
}

