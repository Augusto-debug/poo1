package exercicioRetas.etapa02;

public class Retas {
    private static double x1;
    private static double y1;
    private static double x2;
    private static double y2;
    public static int cont = 0;
    public Retas(double x1, double y1, double x2, double y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        cont++;
    }
    public Retas(){
    }
    public double comprimento (){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public boolean valida (){
        if (x1 == x2 && y1 == y2) {
            return false;
        }
        return true;
    }
    public String exibe (){
        return "Comprimento da reta: " + comprimento();
    }
}
