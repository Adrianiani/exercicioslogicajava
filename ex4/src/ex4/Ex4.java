package ex4;
import java.util.Scanner;
public class Ex4 {
   public static String vervogais(String[] strings) {
        if (strings == null || strings.length == 0) {
            return null;
        }
        String maisvogais = strings[0];
        int maiorvogais = vogais(strings[0]);

        for (int i = 1; i < strings.length; i++) {
            int numerovogais = vogais(strings[i]);
            if (numerovogais > maiorvogais) {
                maiorvogais = numerovogais;
                maisvogais = strings[i];
            }
        }
        return maisvogais;
    }
    private static int vogais(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        int contador = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char letra = str.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        return contador;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        scanner.nextLine();
        String[] strings = new String[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite a string: " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }
        String resultado = vervogais(strings);       
            System.out.println("A string com mais vogais é: " + resultado);      
    }  
}
//terminado
