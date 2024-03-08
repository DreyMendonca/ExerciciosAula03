package Aula03;

import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int A, B, diferenca;

        System.out.print("Digite o primeiro valor: ");
        A = entrada.nextInt();
        System.out.print("Digite o segundo valor: ");
        B = entrada.nextInt();;

        diferenca = A - B;

        diferenca = diferenca * diferenca;

        System.out.print("aqui está o resultado: " + diferenca + "!");
    }
}
