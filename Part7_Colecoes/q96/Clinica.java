package Part7_Colecoes.q96;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;

public class Clinica {
    public static void main(String[] args) {
        Comparator<Paciente> comparadorPorIdade = Comparator.comparingInt(Paciente::getIdade).reversed();
        PriorityQueue<Paciente> filaPacientes = new PriorityQueue<>(comparadorPorIdade);
        Random aleatorio = new Random();
        Scanner sc = new Scanner(System.in);
        int minutoTotal = 0;
        int minutoAtendimento = 0;
        filaPacientes.offer(new Paciente(aleatorio.nextInt(1000), aleatorio.nextInt(100)));
        
        while (!filaPacientes.isEmpty()) {
            while(minutoAtendimento <= 4){
                System.out.println("Atendendo no minuto " + minutoTotal + " " + filaPacientes.peek());
                minutoAtendimento++;
                if(minutoAtendimento == 4){
                    filaPacientes.offer(new Paciente(aleatorio.nextInt(), aleatorio.nextInt(100)));
                }if(minutoAtendimento == 5){
                    filaPacientes.poll();
                }
                minutoTotal++; 
            }
            minutoAtendimento = 0;
        }
        sc.close();
    }
}