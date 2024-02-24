/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author cdavi
 */
public class Puntuacion_campe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Definir nombres de equipos
        String[] equipos = {"Equipo 1", "Equipo 2", "Equipo 3", "Equipo 4", "Equipo 5", "Equipo 6"};

        // Crear una matriz para almacenar la puntuación de cada equipo
        int[][] puntuacion = new int[equipos.length][3]; // Columnas: PJ (Partidos Jugados), PG (Partidos Ganados), PE (Partidos Empatados), y PP (Partidos Perdidos)

        // Simular algunos resultados de partidos (puedes ajustar esto según sea necesario)
        registrarPartido(equipos, puntuacion, 0, 1, 2); // Equipo 1 vs Equipo 2 (Gana el Equipo 1)
        registrarPartido(equipos, puntuacion, 1, 2, 0); // Equipo 3 vs Equipo 4 (Gana el Equipo 4)
        registrarPartido(equipos, puntuacion, 2, 0, 1); // Equipo 5 vs Equipo 6 (Gana el Equipo 6)

        // Mostrar la tabla de puntuación
        mostrarTabla(equipos, puntuacion);
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
            puntuacion[equipoLocal][3]++;
            puntuacion[equipoVisitante][3]++;
        } else if (resultado == 1) {
            // Gana el equipo local
            puntuacion[equipoLocal][1]++;
            puntuacion[equipoVisitante][6]++;
        } else {
            // Gana el equipo visitante
            puntuacion[equipoVisitante][1]++;
            puntuacion[equipoLocal][6]++;
        }
    }

    // Método para mostrar la tabla de puntuación
    public static void mostrarTabla(String[] equipos, int[][] puntuacion) {
        System.out.println("Tabla de Puntuación:");
        System.out.printf("%-15s%-10s%-10s%-10s%-10s%n", "Equipo", "PJ", "PG", "PE", "PP");

        for (int i = 0; i < equipos.length; i++) {
            System.out.printf("%-15s%-10d%-10d%-10d%-10d%n",
                    equipos[i],
                    puntuacion[i][0],  // PJ (Partidos Jugados)
                    puntuacion[i][1],  // PG (Partidos Ganados)
                    puntuacion[i][2],  // PE (Partidos Empatados)
                    puntuacion[i][3]); // PP (Partidos Perdidos)
        }
    
    }
    
}
