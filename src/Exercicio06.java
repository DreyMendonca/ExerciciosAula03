import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        double volume, comprimento, largura, altura;

        System.out.println("Calcule o valor de uma caixa retangular!");
        System.out.print("Digite o comprimento: ");
        comprimento = entrada.nextDouble();
        System.out.print("Digite a largura: ");
        largura = entrada.nextDouble();
        System.out.print("Digite a altura: ");
        altura = entrada.nextDouble();

        volume = comprimento * largura * altura;

        System.out.print("O volume da caixa é de: " + volume + "!");
    }
}
