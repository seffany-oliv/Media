import java.nio.channels.Pipe.SourceChannel;

import java.util.Scanner;

public class Media{
    public static void main(String[] args) {
        //Declaração de variável 
        //double n1, n2, media;
        double[] nota = new double[4];
        double media = 0;

        //Objeto de entrada
        Scanner entrada = new Scanner(System.in);

        //Apresentação
        System.out.println("\n\t\t\t -- Média das Notas --\n");

        //Entrada
        for(int i = 0; i <= 3; i++){
            System.out.println("Informe a " + (i+1) + "ª nota: ");
            nota[i] = entrada.nextDouble();
        }

        /* 
        System.out.print("Informe a 1ª nota: ");
        n1 = entrada.nextDouble();

        System.out.print("Informe a 2ª nota: ");
        n2 = entrada.nextDouble();
        */
        //Processamento
        for(int i = 0; i <= 3; i++){
            media += nota[i];
        } 
        media /= 4;

        //Saída
        for(int i = 0; i <= 3; i++){
            System.out.println("Nota " + (i + 1) +": " +nota[i]);
        }

        /*
        System.out.println("Nota 1: " + n1);
        System.out.println("Nota 2: " + n2);
        */
        
        System.out.printf("\nMédia %.2f\n", media);
        
    }
}
