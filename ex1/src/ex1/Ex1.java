package ex1;
import java.util.Scanner;
public class Ex1 {
    public static boolean vernumero(int numero) {
        if (numero <= 1) {
            return false;
        }
        int soma = 1; 
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                soma += i;
                if (i * i != numero) { 
                    soma += numero / i;
                }
            }
        }
        return soma == numero;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        if (vernumero(numero)) {
            System.out.println(numero + " é um número perfeito.");
        } else {
            System.out.println(numero + " não é um número perfeito.");
        }       
    }
}
//protno