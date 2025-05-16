
package ex2;
import java.util.Scanner;
public class Ex2 {
    public static String trocar(String texto) {
        String resultado = "";
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            char letra2 = Character.toLowerCase(letra);
            if (letra2 == 'a' || letra2 == 'e' || letra2 == 'i' || letra2 == 'o' || letra2 == 'u') {
                resultado += "*";
            } else {
                resultado += letra;
            }
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        String trocado = trocar(palavra);
        System.out.println("Vogais substituídas: " + trocado);
    }
}
