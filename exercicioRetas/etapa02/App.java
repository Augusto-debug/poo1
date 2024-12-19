package exercicioRetas.etapa01;

import java.util.Scanner;

public class App {
    public static boolean valida (double x1, double y1, double x2, double y2) {
        if (leCoordenada(x1) == leCoordenada(x2) && leCoordenada(y1) == leCoordenada(y2)) {
            return false;
        }
        return true;
    }
    public static double leCoordenada (double coord) {
        return coord;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int count = 0;
        String resp;
        do {
            System.out.println("Digite as coordenadas da reta:");
            double x1 = entrada.nextDouble();
            double y1 = entrada.nextDouble();
            double x2 = entrada.nextDouble();
            double y2 = entrada.nextDouble();
            Retas r = new Retas(x1, y1, x2, y2);
            if (valida(x1, y1, x2, y2)) {
                System.out.println(r.exibe());
                count++;
            } else {
                System.out.println("Coordenadas iguais, não é uma reta.");
            }
            System.out.println("Deseja calcular o comprimento de outra reta ? (s/n)");
            resp = entrada.next();
        } while (resp.toLowerCase().charAt(0) == 's');
        System.out.println("Total de retas calculadas: " + count);
    }
}
