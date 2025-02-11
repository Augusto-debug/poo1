package encapsulamentoEx01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final int cadastrarPessoa = 1;
        final int cadastrarFormacao = 2;
        final int exibir = 3;
        final int atualizarIdade = 4;
        Pessoa pessoa = null;
        Formacao formacao = null;
        System.out.println("Digite 1 para cadastrar pessoa, 2 para cadastrar formação, 3 para exibir, 4 para atualizar idade e 5 para sair");
        Scanner entrada = new Scanner(System.in);
        int opcao = entrada.nextInt();
        while(opcao != 5) {
        if (opcao == cadastrarPessoa) {
            pessoa = lePessoa();
        } else if (opcao == cadastrarFormacao) {
            formacao = leFormacao();
        } else if (opcao == exibir) {
            if(pessoa == null && formacao == null){
                System.out.println("Nada cadastrado");
                break;
            }
            if (pessoa != null) {
                System.out.println(pessoa.exibe(pessoa.getPessoa(), pessoa.getIdade(), pessoa.getSexo()));
            } else  {
                System.out.println(formacao.exibe(formacao.getNivel(), formacao.isConcluido(), formacao.getInstituicao(), formacao.getAno()));
            }
        } else if (opcao == atualizarIdade) {
            if (pessoa == null) {
                System.out.println("Pessoa não cadastrada");
                break;
            }
            System.out.println("Digite a nova idade");
            int novaIdade = entrada.nextInt();
            pessoa.setIdade(novaIdade);
            System.out.println("Idade atualizada");
        }
        System.out.println("Digite 1 para cadastrar pessoa, 2 para cadastrar formação, 3 para exibir, 4 para atualizar idade e 5 para sair");
        opcao = entrada.nextInt();
        }
    }

    public static Pessoa lePessoa() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa");
        String nome = entrada.nextLine();
        System.out.println("Digite a idade da pessoa");
        int idade = entrada.nextInt();
        System.out.println("Digite o sexo da pessoa");
        char sexo = entrada.next().charAt(0);
        return new Pessoa(nome, idade, sexo);
    }

    public static Formacao leFormacao() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nível da formação");
        String nivel = entrada.nextLine();
        System.out.println("Digite se a formação foi concluída (true/false)");
        boolean concluido = entrada.nextBoolean();
        entrada.nextLine();
        System.out.println("Digite a instituição da formação");
        String instituicao = entrada.nextLine();
        System.out.println("Digite o ano da formação");
        int ano = entrada.nextInt();
        return new Formacao(nivel, concluido, instituicao, ano);
    }
}
