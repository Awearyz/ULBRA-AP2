import java.util.ArrayList;
import java.util.Random;

public class SenhaAleatoria {
    public static int numeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public static void gerarChaveNumerica(int entrada) {
        System.out.println("Gerador de chave");
        System.out.println("\tO sistema (iterativamente) requer chaves numéricas de 5 a 10 dígitos!");

        if (entrada < 5 || entrada > 10) {
            System.out.println("Entrada inválida! A chave deve ter entre 5 e 10 dígitos.");
            return;
        }

        ArrayList<String> valores = new ArrayList<>();
        for (int i = 0; i < entrada; i++) {
            valores.add(String.valueOf(numeroAleatorio(0, 9)));
        }

        StringBuilder sb = new StringBuilder();
        for (String s : valores) {
            sb.append(s);
        }
        System.out.println("Chave gerada: " + sb.toString());
    }

    public static void main(String[] args) {
        gerarChaveNumerica(5);
    }

}