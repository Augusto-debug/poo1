package TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int num = sc.nextInt();
            int num2 = sc.nextInt();
            int res = num / num2;
            System.out.println(res);
        } catch (InputMismatchException e) {
            System.out.println("Digitou diferente de numero inteiro: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Tentou dividir por 0: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
