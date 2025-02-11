package sobrecarga2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Adicao2 adicao = new Adicao2();
        Dados2 dados = new Dados2(10, 20);
        Dados2 dados2 = new Dados2(10.5f, 20.5f);
        System.out.println("Digite 1 para somar inteiros , 2 para somar reais e 3 para sair da aplicação: ");
        int opcao = entrada.nextInt();
        do {
            if (opcao == 1) {
                System.out.println(adicao.exibe(dados.getA(), dados.getB()));
            } else if (opcao == 2) {
                System.out.println(adicao.exibe(dados2.getC(), dados2.getD()));
            } else {
                System.out.println("Saindo da aplicação...");
                break;
            }
            System.out.println("Digite 1 para somar inteiros , 2 para somar reais e 3 para sair da aplicação: ");
            opcao = entrada.nextInt();
        } while (opcao != 3);
    }
}
