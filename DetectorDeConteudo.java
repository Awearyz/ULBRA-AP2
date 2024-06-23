class DetectorDeConteudo {
    public static void detectarConteudoInadequado(String inadequado) {
        
        if (inadequado == "sexo" || inadequado == "sexual")
            System.out.println("Algum conteudo inadequado foi detectado!");
        else
            System.out.println("Nenhum conteudo inadequado foi detectado!");
    }

    public static void main(String[] args) {
        detectarConteudoInadequado("sexual");
    }
}