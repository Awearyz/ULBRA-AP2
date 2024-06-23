class EscondedorDeCaracteres {
    public static void esconderUltimoCaractere(String entrada) {
        
        System.out.println(entrada.substring(0, entrada.length()-1));
    }

    public static void main(String[] args) {
        esconderUltimoCaractere("teste");
    }
}