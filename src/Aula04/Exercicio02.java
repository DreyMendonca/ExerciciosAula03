package Aula04;
import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1,n2,media;

        System.out.print("Digite a primeira nota: ");
        n1 = entrada.nextDouble();
        System.out.print("Digite a segunda nota: ");
        n2 = entrada.nextDouble();

        media = n1/n2;

        if(media < 6){
            System.out.println("Você foi reprovado! sua média foi de: " + media);
        }else{
            System.out.println("Você foi aprovado! sua média foi de: " + media);
        }
    }
}
