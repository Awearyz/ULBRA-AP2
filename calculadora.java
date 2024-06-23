class calculadora 
{
    public static void obterPotencia(double base, double expoente) 
    {
        System.out.println(base + " elevado a " + expoente + " = "+ Math.pow(base, expoente));
    }

    public static void main(String[] args) 
    {
        obterPotencia(2,3);
    }
}

