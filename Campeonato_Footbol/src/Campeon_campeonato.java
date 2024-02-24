import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author cdavi
 */
public class Campeon_campeonato {

    /**
     * @param args the command line arguments
     */
    //codigo para simular un campeonato y mostrar al ganador David Rojas 
    public static void main(String[] args) {
        // TODO code application logic here
         // Definir nombres de equipos
        String[] equipos = {"Equipo 1", "Equipo 2", "Equipo 3", "Equipo 4", "Equipo 5", "Equipo 6"};

        // Crear una matriz para almacenar la puntuación de cada equipo
        int[][] puntuacion = new int[equipos.length][3]; // Columnas: PJ (Partidos Jugados), PG (Partidos Ganados), y PE (Partidos Empatados)

        // Simular algunos resultados de partidos (puedes ajustar esto según sea necesario)
        simularResultados(equipos, puntuacion, 20);

        // Mostrar la tabla de puntuación
        mostrarTabla(equipos, puntuacion);

        // Determinar al campeón
        String campeon = determinarCampeon(equipos, puntuacion);
        System.out.println("\n¡El campeón del campeonato es: " + campeon + "!");
    }

    // Método para simular resultados de partidos
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

    // Método para registrar los resultados de un partido
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

    // Método para mostrar la tabla de puntuación
    public static void mostrarTabla(String[] equipos, int[][] puntuacion) {
        System.out.println("Tabla de Puntuación:");
        System.out.printf("%-15s%-10s%-10s%-10s%n", "Equipo", "PJ", "PG", "PE");

        for (int i = 0; i < equipos.length; i++) {
            System.out.printf("%-15s%-10d%-10d%-10d%n",
                    equipos[i],
                    puntuacion[i][0],  // PJ (Partidos Jugados)
                    puntuacion[i][1],  // PG (Partidos Ganados)
                    puntuacion[i][2]); // PE (Partidos Empatados)
        }
    }

    // Método para determinar al campeón
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
   
