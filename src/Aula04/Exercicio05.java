package Aula04;
import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.print("informe um número: ");
        numero = entrada.nextInt();

        if(numero % 2 == 0){
            System.out.println2("O número é par!");
        }else{
            System.out.println("O número é impar!");
        }
    }
}