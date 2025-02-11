package exerciciosFixacao;

public class ContaCorrente {
    private String nome;
    private String numeroConta;
    private double saldo;
    private String tipoConta = "comum";
    private double limiteEspecial;
    private double totalComLimite;

    public ContaCorrente(String nome, String numeroConta, double saldo) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public ContaCorrente(String nome, String numeroConta, double saldo, double limiteEspecial) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.tipoConta = "especial";
        this.limiteEspecial = limiteEspecial;
        this.totalComLimite = saldo + limiteEspecial;
    }

    boolean sacar(double valor) {
        double valorComTaxa = valor + (valor * 0.001);
        if (saldo >= valorComTaxa) {
            saldo -= valorComTaxa;
            return true;
        }

        return false;
    }

    boolean sacar(double valor, String limiteEspecial) {
        saldo += valor;
        double taxa = limiteEspecial.equalsIgnoreCase("especial") ? 0.2 : 0.1;
        double valorComTaxa = valor + (valor * taxa);
        if (saldo >= valorComTaxa) {
            saldo -= valorComTaxa;
            return true;
        }
        return false;
    }

    void depositar(double valor) {
        saldo += valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public double getTotalComLimite() {
        return totalComLimite;
    }

    public void setTotalComLimite(double totalComLimite) {
        this.totalComLimite = totalComLimite;
    }
}
