package Aula03;

import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario, novoSalario, porcentagem;

        System.out.print("Digite o salário: ");
        salario = entrada.nextDouble();
        System.out.print("Digite a porcentagem a ser acrescentado: ");
        porcentagem = entrada.nextDouble();

        novoSalario = ((salario*porcentagem)/100) + salario;

        System.out.print("Seu sálario terá um aumento de " + porcentagem + "%!\nSeu sálario será de: " + novoSalario);

    }
}
