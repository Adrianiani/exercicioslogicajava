
package ex9;
import java.util.Scanner;
public class Ex9 {
    public static double calculo(double valor, double porcentagem) {
        double porcento = (valor * porcentagem) / 100;
        return porcento;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();
        System.out.print("Digite a porcentagem: ");
        double porcentagem = scanner.nextDouble();
        double resultado = calculo(valor, porcentagem);
        System.out.println(porcentagem + "% de " + valor + " é: " + resultado);
    }
}
