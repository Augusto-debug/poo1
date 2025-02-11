package AtividadeAvaliativaJogadorFutebol;
public class JogadorFutebol {
    private String nome;
    public String posicao;
    public int anoNascimento;
    public String nacionalidade;
    public double altura;
    public double peso;
    public JogadorFutebol(String nome, String posicao, int anoNascimento, String nacionalidade, double altura, double peso){
        this.nome = nome;
        this.posicao = posicao;
        this.anoNascimento = anoNascimento;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }
    public void exibe () {
        System.out.println("Nome : " + nome + "/n Ano de Nascimento: " + anoNascimento + "/n Altura: " + altura + "/n Peso: " + peso + "/n Nacionalidade: " + nacionalidade + "/n Posição: " + posicao);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
