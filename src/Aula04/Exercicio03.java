package Aula04;
import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, novoSalario;

        System.out.print("informe seu salário: ");
        salario = entrada.nextDouble();

        if(salario < 1500){
            novoSalario = ((salario*15)/100) + salario;
            System.out.println("Seu novo salário será de: " + novoSalario);
        }else{
            System.out.println("Não haverá aumento.");
        }
    }
}
