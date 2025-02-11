package exerciciosFixacao;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do titular da conta: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o número da conta: ");
        String numeroConta = scanner.nextLine();
        System.out.println("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();
        System.out.println("Digite o limite especial: ");
        double limiteEspecial = scanner.nextDouble();
        ContaCorrente conta1 = new ContaCorrente(nome, numeroConta, saldo);
        ContaCorrente conta2 = new ContaCorrente(nome, numeroConta, saldo, limiteEspecial);
        int opcao = 1;
        while (opcao != 0) {
            menu();
            opcao = scanner.nextInt();
            if (opcao == 1) {
                System.out.println("Digite o valor a ser sacado: ");
                double valor = scanner.nextDouble();
                if (conta2.getTotalComLimite()  < valor) {
                    System.out.println("Saldo insuficiente");
                    continue;
                }
                conta2.sacar(valor, String.valueOf(limiteEspecial));
            } else if (opcao == 2) {
                System.out.println("Digite o valor a ser depositado: ");
                double valor = scanner.nextDouble();
                conta2.depositar(valor);
            } else {
                exibir(conta2);
            }
        }
    }

    static void menu() {
        System.out.println("Digite a opção desejada: ");
        System.out.println("1 - Sacar");
        System.out.println("2 - Depositar");
        System.out.println("3 - exibir");
        System.out.println("0 - Sair");
    }

    static void exibir(ContaCorrente conta) {
        System.out.println("Nome: " + conta.getNome());
        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Tipo de Conta: " + conta.getTipoConta());
        if (conta.getTipoConta().equalsIgnoreCase("especial")) {
            System.out.println("Limite: R$" + String.format("%.2f", conta.getTotalComLimite() - conta.getSaldo()));
        }
        System.out.println("Saldo: R$" + String.format("%.2f", conta.getSaldo() - conta.getLimiteEspecial()));
    }
}
