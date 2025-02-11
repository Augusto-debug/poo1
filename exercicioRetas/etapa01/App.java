package exercicioRetas.etapa01;

import java.util.Scanner;

public class App {
    public static boolean valida (double x1, double y1, double x2, double y2) {
        if (x1 == x2 && y1 == y2) {
            return false;
        }
        return true;
    }
    public static double leCoordenada (int coord) {
        Scanner entrada = new Scanner(System.in);
        if (coord == 1) {
            return entrada.nextInt();
        } else if (coord == 2) {
            return entrada.nextInt();
        } else if (coord == 3) {
            return entrada.nextInt();
        } else if (coord == 4) {
            return entrada.nextInt();
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int count = 0;
        String resp;
        do {
            System.out.println("Digite as coordenadas da reta:");
            System.out.print("x1: ");
            double x1 = leCoordenada(1);
            System.out.print("y1: ");
            double y1 = leCoordenada(2);
            System.out.print("x2: ");
            double x2 = leCoordenada(3);
            System.out.print("y2: ");
            double y2 = leCoordenada(4);
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
