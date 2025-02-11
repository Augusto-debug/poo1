package exmploRelacao;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private String localizacao;
    private List<Pessoa> pessoas;

    public Departamento(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void removerPessoa(Pessoa pessoa) {
        pessoas.remove(pessoa);
    }

    public String getNome() {
        return nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }
}
