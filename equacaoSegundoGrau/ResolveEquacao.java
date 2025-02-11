package equacaoSegundoGrau;

public class ResolveEquacao {
    double a, b, c;
    ResolveEquacao(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
   public double delta(){
        return Math.pow(b, 2) - 4 * a * c;
    }

   public double calculaX1(double x){
        return (-b + Math.sqrt(x)) / (2 * a);
    }
   public double calculaX2(double x){
        return (-b - Math.sqrt(x)) / (2 * a);
    }
}
