package TryCatch;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite o valor do saque: ");
            double saque = sc.nextDouble();
            limiteSaque(saque);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }

    public static void limiteSaque(double saque) throws Exception {
        if (saque > 2000) {
            throw new Exception("Valor acima do permitido");
        } else {
            System.out.println("Saque realizado com sucesso");
        }
    }
}
