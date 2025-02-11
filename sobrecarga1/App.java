package sobrecarga1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Adicao1 adicao = new Adicao1();
        Dados1 dados = new Dados1(10, 20);
        Dados1 dados2 = new Dados1(10.5f, 20.5f);
        int opcao = entrada.nextInt();
        if (opcao == 1) {
            System.out.println(adicao.exibeInt(dados.getA(), dados.getB()));
        } else if (opcao == 2) {
            System.out.println(adicao.exibeFloat(dados2.getC(), dados2.getD()));
        } else  {
            System.out.println("Opção inválida");
        }
    }
}
