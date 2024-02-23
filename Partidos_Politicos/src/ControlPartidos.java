
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
    
        Scanner scanner = new Scanner(System.in); // Objeto para tomar entrada del usuario
        Random random = new Random(); // Objeto para generar números aleatorios
        
        String[] candidatos = new String[10]; // Arreglo para almacenar nombres de candidatos
        int [][] votos = new int[10][5];  // Matriz para registrar votos de cada candidato en 5 rondas
        int [] totalVotos = new int[10];  // Arreglo para almacenar el total de votos por candidato
        
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
                int voto = random.nextInt(10); // Generar voto aleatorio entre 0 y 9 (10 candidatos)
                votos[voto][ronda]++; // Incrementa el conteo de votos para el candidato elegido en la ronda actual
            }
        }
//--------------------------------------------------------------------------------------------------------------------
        
        
    }
    
}
