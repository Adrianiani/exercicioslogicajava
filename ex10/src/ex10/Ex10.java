
package ex10;
import java.util.Scanner;
public class Ex10 {
    public static boolean verseda(int numero) {
        if (numero < 0) {
            return false;
        }
        if (numero == 0 || numero == 1) {
            return true;
        }
        int a = 0;
        int b = 1;
        while (b < numero) {
            int proximo = a + b;
            a = b;
            b = proximo;
        }
        return b == numero;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        if (verseda(numero)) {
            System.out.println(numero + " é um número de fibonacci.");
        } else {
            System.out.println(numero + " não é um número de fibonacci.");
        }
    }
}
//pronto