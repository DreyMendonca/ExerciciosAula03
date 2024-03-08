package Aula03;

import java.util.Scanner;
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A, B, C, resultado;

        System.out.print("Digite um valor para A: ");
        A = entrada.nextInt();
        System.out.print("Digite um valor para B: ");
        B = entrada.nextInt();
        System.out.print("Digite um valor para C: ");
        C = entrada.nextInt();

        resultado = (A + B + C) * (A + B + C);

        System.out.println("O valor do quadrado da soma dos três valores lidos é: " + resultado);

    }
}
