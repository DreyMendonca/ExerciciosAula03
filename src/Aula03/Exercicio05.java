package Aula03;

import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int A, B, C;

        System.out.print("Digite o valor da variável A: ");
        A = entrada.nextInt();
        System.out.print("Digite o valor da variável B: ");
        B = entrada.nextInt();

        C = B; // coloca o valor da B na C
        B = A; // coloca o valor da A na B
        A = C; // coloca o valor da C na A (que é o valor que estava na B)

        System.out.println("O valor da variável A agora é: " + A +"!");
        System.out.println("O valor da variável B agora é: " + B +"!");
    }
}
