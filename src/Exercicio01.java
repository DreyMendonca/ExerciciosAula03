
import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        double salario, novoSalario;

        System.out.print("Digite o seu salário: ");
        salario = entrada.nextDouble();

        novoSalario = ((salario*25)/100) + salario;

        System.out.print("Seu sálario terá um aumento de 25%!\n Seu sálario será de: " + novoSalario);

    }
}
