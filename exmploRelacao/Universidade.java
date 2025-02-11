package exmploRelacao;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private String nome;
    private List<Departamento> departamentos;

    public Universidade(String nome) {
        this.nome = nome;
        this.departamentos = new ArrayList<>();
    }

    public void adicionarDepartamento(String departamento, String localizacao) {
        departamentos.add(new Departamento(departamento, localizacao));
    }

    public void removerDepartamento(Departamento departamento) {
        departamentos.remove(departamento);
    }

    public String getNome() {
        return nome;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }
}
