package aulaStatic;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<FichaPessoal> pessoas = new ArrayList<>();
        String resp;
        do {
            System.out.println("Digite o nome: ");
            String nome = sc.next();
            System.out.println("Digite a idade: ");
            int idade = sc.nextInt();
            FichaPessoal p = new FichaPessoal(nome, idade);
            pessoas.add(p);
            System.out.println("Ainda quer cadastrar mais pessoas ? ");
            resp = String.valueOf(sc.next().charAt(0));
        } while (resp.equals("s"));
        for (FichaPessoal p : pessoas) {
            exibe(p);
        }
        System.out.println("Tamanho da base de dados " + pessoas.size());
    }
    static void exibe(FichaPessoal p){
        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
    }
}
