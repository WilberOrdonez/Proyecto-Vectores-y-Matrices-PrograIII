
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author favio
 */
public class ControlPartidos {
    
//--------------------------------------------------------------------------------------------------------------------
    // Código trabajado por Favio Lopez - Ingreso manual de candidatos y la generacion de números aleatorios
    
    public static void main(String[] args){
    
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); 
        
        String[] candidatos = new String[10];
        int [][] votos = new int[10][5];  
        int [] totalVotos = new int[10];  
        
        // Ingresar nombres de candidatos
        System.out.println("Ingrese los nombres de los 10 candidatos a presidente:");
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            System.out.print("Candidato " + (i + 1) + ": ");
            candidatos[i] = scanner.nextLine();
        }
        
        // Simulacion de los votos de afiliados en 5 rondas
        for (int ronda = 0; ronda < 5; ronda++){
            for (int afiliado = 0; afiliado < 50; afiliado++){
                int voto = random.nextInt(10);
                votos[voto][ronda]++; 
            }
        }
//--------------------------------------------------------------------------------------------------------------------
        //Codigo de Wilber - Mostrar matriz de rondas de votacion, calculo de ganadores, mayor y menor votado, y resultado de votaciones
        boolean eleccion=true;
        do{
                    // Mostrar la tabla de votos por cada candidato y ronda
            System.out.println("Tabla de Votos:");
            System.out.printf("%-25s", "Candidato");
            for (int ronda = 1; ronda <= 5; ronda++) {
                System.out.printf("%-10s", "Ronda " + ronda);
            }
            System.out.println();

            for (int candidato = 0; candidato < 10; candidato++) {
                System.out.printf("%-25s", candidatos[candidato]);
                for (int ronda = 0; ronda < 5; ronda++) {
                    System.out.printf("%-10d", votos[candidato][ronda]);
                }
                System.out.println();
            }

            // Calcular el candidato ganador y el que obtuvo menos votos
            for (int candidato = 0; candidato < 10; candidato++) {
                for (int ronda = 0; ronda < 5; ronda++) {
                    totalVotos[candidato] += votos[candidato][ronda];
                }
            }

            // Encontrar el ganador y el que obtuvo menos votos
            int ganador = 0;
            int menosVotos = 0;
            for (int candidato = 1; candidato < 10; candidato++) {
                if (totalVotos[candidato] > totalVotos[ganador]) {
                    ganador = candidato;
                }
                if (totalVotos[candidato] < totalVotos[menosVotos]) {
                    menosVotos = candidato;
                }
            }

            // Mostrar resultados
            System.out.println("\nEl candidato ganador es: " + candidatos[ganador]);
            System.out.println("El candidato con menos votos es: " + candidatos[menosVotos]);  
            System.out.println();
            System.out.println("Se repiten las elecciones?");
            String repetir = scanner.nextLine();
            eleccion= repetir.equalsIgnoreCase("Si") || repetir.equalsIgnoreCase("S") || repetir.equalsIgnoreCase("si");
        } while (eleccion);
        
        System.out.println("La votacion ha finalizado.");
        System.out.println("Creditos: Favio, Wilber, Lety, David.");

        
    }

}
