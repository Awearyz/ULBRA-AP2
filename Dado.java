import java.util.concurrent.ThreadLocalRandom;

class Dado {
    private static final int MAIOR_FACE = 6;

    private static int jogar(int maiorFace){
        return ThreadLocalRandom.current().nextInt(1, maiorFace + 1);
    }

    public static void jogarTresDadosDeSeisLadosESomar(){
        int soma = 0;
        System.out.println("Um dado foi jogado tres vezes:");
        for (int i = 1, resultado = jogar(MAIOR_FACE); i <= 3; resultado = jogar(MAIOR_FACE), i++) {
            System.out.println("\t" + i + " vez: " + resultado);
            soma += resultado;
        }
        System.out.println("Soma dos valores sorteados: "+soma);
    }

    public static void main(String[] args) {
        jogarTresDadosDeSeisLadosESomar();
    }
}