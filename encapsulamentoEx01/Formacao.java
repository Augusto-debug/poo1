package encapsulamentoEx01;

public class Formacao {
    private String nivel;
    private boolean concluido;
    private String instituicao;
    private int ano;
    Formacao(String nivel, boolean concluido, String instituicao, int ano){
        this.nivel = nivel;
        this.concluido = concluido;
        this.instituicao = instituicao;
        this.ano = ano;
    }
    public String exibe(String nivel, boolean concluido, String instituicao, int ano){
        return "Nível: " + nivel + "\nConcluído: " + concluido + "\nInstituição: " + instituicao + "\nAno: " + ano;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
