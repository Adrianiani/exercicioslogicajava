package ex5;
public class Ex5 {
    public static int continha(int numero) {
        if (numero < 0) {
            return -1;
        }
        if (numero == 0) {
            return 1;
        }
        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }
    public static void main(String[] args) {
        int numero = 5;
        int fatorial = continha(numero);
        if (fatorial == -1) {
            System.out.println("O número é negativo (inválido).");
        } else {
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
    }
}
