package Aula04;
import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1,n2, divi;

        System.out.println("Digite o primeiro número: ");
        n1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = entrada.nextInt();
        if(n2 == 0){
            System.out.println("ERRO: Não há divisão por zero");
        }else{
            divi = n1/n2;
            System.out.println("O resultado é: " + divi);
        }

    }
}
