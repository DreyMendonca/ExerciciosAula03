import java.util.Scanner;
public class Exercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nascimento,anos , meses, semanas, dias;

        System.out.print("Digite o ano que você nasceu: ");
        nascimento = entrada.nextInt();
        anos = 2024 - nascimento;
        meses = nascimento * 12;
        semanas = nascimento * 52;
        dias = nascimento * 365;

        System.out.println("Voce tem " + anos + " anos de vida!");
        System.out.println("Voce tem " + meses + " meses de vida!");
        System.out.println("Voce tem " + semanas + " semanas de vida!");
        System.out.println("Voce tem " + dias + " dias de vida!");

    }
}
