class radianos
{

    public static void converterRadianosParaGraus(double anguloEmRadianos) 
    {
    
        System.out.println(anguloEmRadianos + " rad se aproxima a " + Math.round(Math.toDegrees(anguloEmRadianos)) + " graus");
    }

    public static void main(String[] args) {
        converterRadianosParaGraus(1);
    }


}