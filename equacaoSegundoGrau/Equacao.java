package equacaoSegundoGrau;

import java.util.Objects;
import java.util.Scanner;

public class Equacao {
    static Scanner entrada = new Scanner(System.in);
    static int a, b ,c;
    static String resposta = "s";
    public static void main(String[] args) {
        do {
            ResolveEquacao equacao = new ResolveEquacao(le(a), le(b), le(c));
            double delta = equacao.delta();
            if(delta < 0) {
                System.out.println("A equação não possui raizes reais");
                return;
            } else {
                double x1 = equacao.calculaX1(delta);
                double x2 = equacao.calculaX2(delta);

                System.out.println(exibe(x1,x2));
            }
            System.out.println("Deseja realizar outro cálculo? (s/n)");
            entrada.nextLine();
            resposta = entrada.nextLine();
        } while (Objects.equals(resposta, "s") || Objects.equals(resposta, "S"));
    }

    public static String exibe(double x, double y){
        return "As raizes da equação são " + x + " e " + y;
    }
    public static double le (int x) {
        System.out.println("Digite 1 para digitar o valor de a, 2 para digitar o valor de b e 3 para digitar o valor de c");
        x =  entrada.nextInt();
        if (x == 1) {
            System.out.println("por favor digite o valor de a diferente e maior do que 0");
            x = entrada.nextInt();
            a = x;
        } else if (x == 2) {
            System.out.println("por favor digite o valor de b");
            x = entrada.nextInt();
            b = x;
        } else {
            System.out.println("por favor digite o valor de c");
            x = entrada.nextInt();
            c = x;
        }
        return x;
    }
}
