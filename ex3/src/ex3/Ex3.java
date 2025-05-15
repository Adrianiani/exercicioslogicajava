
package ex3;
import java.util.Scanner;

public class Ex3 {
     public static int vervalor(int[] vetor) {
        int maior = vetor[0] >= 0 ? vetor[0] : -vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            int valor = vetor[i] >= 0 ? vetor[i] : -vetor[i];
            if (valor > maior) {
                maior = valor;
            }
        }
        return maior;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        int[] vetor = new int[tamanho];
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        int maior = vervalor(vetor);
        System.out.println("O maior valor absoluto no array é: " + maior);
    }
}
//pronto