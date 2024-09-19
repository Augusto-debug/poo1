import java.util.Scanner;

public class paridade {
    public static void main(String[] args) {
        int entrada = le();
        if (entrada < 0) {
            restricao();
        }
        ePar(entrada);
    }
    static int le() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    static void restricao() {
        System.out.println("numero invalido");
    }

    static void ePar (int n) {
        if (verifica(n)) {
            System.out.println("numero par");
        } else {
            System.out.println("numero impar");
        }
    }

    static boolean verifica (int n) {
        return n % 2 == 0 ? true : false;
    }

}
