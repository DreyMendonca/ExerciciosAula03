package Aula03;

import java.util.Scanner;
public class Exercicio08 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double dolar, real, cotacao;

        System.out.print("Digite a cotação do dólar: ");
        cotacao = entrada.nextDouble();
        System.out.print("Digite o valor em dólar: ");
        dolar = entrada.nextDouble();;

        real = cotacao * dolar;

        System.out.println("O valor em reais ficará: " + real);

    }
}
