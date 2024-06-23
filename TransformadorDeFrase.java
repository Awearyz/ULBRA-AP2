import java.util.ArrayList;

public class TransformadorDeFrase {

    public static void transformarFrase(String frase) {

        ArrayList<Character> fraseTratada = new ArrayList<>();
        for (char caractere : frase.toCharArray())
            if (caractere != ' ') fraseTratada.add(caractere);

        StringBuilder fraseInvertida = new StringBuilder();
        for (int i = fraseTratada.size() - 1; i >= 0; i--)
            fraseInvertida.append(fraseTratada.get(i));
        System.out.println("Sua frase transformada: " + fraseInvertida.toString());
    }
    public static void main(String[] args) {
        transformarFrase("Test e e e e ");
    }
}