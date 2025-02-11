package exmploRelacao;

public class App {
    public static void main(String[] args) {
        //Composição: Caso universidade seja removida os departamentos deixam de existir e as pessoas também
        Universidade u1 = new Universidade("UFU");

        u1.adicionarDepartamento("Física", "Bloco 1");
        u1.adicionarDepartamento("Matemática", "Bloco 2");

        Pessoa p1 = new Pessoa("João", 30, 'M');
        Pessoa p2 = new Pessoa("Maria", 25, 'F');
        Pessoa p3 = new Pessoa("José", 35, 'M');
        Pessoa p4 = new Pessoa("Ana", 28, 'F');

        u1.getDepartamentos().get(0).adicionarPessoa(p1);
        u1.getDepartamentos().get(0).adicionarPessoa(p3);
        u1.getDepartamentos().get(1).adicionarPessoa(p2);
        u1.getDepartamentos().get(1).adicionarPessoa(p4);

//        u1.removerDepartamento(u1.getDepartamentos().get(0));

        System.out.println("Departamentos da " + u1.getNome() + ":");
        for (Departamento d : u1.getDepartamentos()) {
            System.out.println("- " + d.getNome() + " (" + d.getLocalizacao() + ")");
            System.out.println("  Pessoas:");
            for (Pessoa p : d.getPessoas()) {
                System.out.println("  - " + p.getNome() + " (" + p.getIdade() + " anos)");
            }
        }
    }
}
