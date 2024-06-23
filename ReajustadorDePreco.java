import static java.lang.Math.round;

public class ReajustadorDePreco {
    private static final double REAJUSTE = 0.12;

    public static void reajustarPreco(double entrada) {
        System.out.println("Reajustador de preço: insira um preço para ser ajustado em " + REAJUSTE*100 + "%");
        System.out.println("Cuidado:");
        System.out.println("> inserir 0 vai encerrar o programa.");
        System.out.println("> o programa solicita repetidamente um valor enquanto letras ou nada for passado.");

        if (entrada != 0)
            System.out.println("Novo preco: " + round(entrada * (1 + REAJUSTE)));
        else
            System.out.println("Um preço zero foi passado; o programa foi encerrado.");
    }
    public static void main(String[] args) {
        reajustarPreco(20);
    }
}