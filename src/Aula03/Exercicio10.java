package Aula03;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double A, B, soma, subtracao, divisao, multiplicacao;

        System.out.print("Insira o primeiro número: ");
        A = entrada.nextInt();
        System.out.print("Insira o segundo número: ");
        B = entrada.nextInt();

        soma = A + B;
        subtracao = A - B;
        divisao = A / B;
        multiplicacao = A * B;

        System.out.println("O resultado dos dois numeros somados é de: " + soma);
        System.out.println("O resultado dos dois numeros subtraidos é de: " + subtracao);
        System.out.println("O resultado dos dois numeros divididos é de: " + divisao);
        System.out.println("O resultado dos dois numeros multiplicados é de: " + multiplicacao);
    }
}
