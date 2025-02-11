package TryCatch;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite a senha: ");
            String senhaAdivinhada = sc.nextLine();
            senhaCorreta(senhaAdivinhada);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void senhaCorreta(String senha) throws Exception {
        if (senha.equals("123456789")) {
            System.out.println("Senha correta");
        } else {
            throw new Exception("Senha incorreta");
        }
    }
}
