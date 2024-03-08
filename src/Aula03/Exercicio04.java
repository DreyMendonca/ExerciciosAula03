package Aula03;

import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double sacoRacao, qtdRacao, restante;

        System.out.print("Digite a quantos KG o saco de reção possui: ");
        sacoRacao = entrada.nextDouble();
        System.out.print("Digite a quantidade de ração em gramas que voce dará para os gatos: ");
        qtdRacao = entrada.nextDouble();

        sacoRacao = sacoRacao * 1000;
        qtdRacao = (qtdRacao * 2) * 5;
        restante = (sacoRacao - qtdRacao) / 1000;



        System.out.print("Após 5 dias restará " + restante + " KG no saco de ração");
    }
}
