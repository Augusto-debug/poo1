class Cliente {
    private int id;
    private String nome;
    private String email;
    private CarrinhoDeCompras carrinho;

    public Cliente() {}

    public Cliente(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.carrinho = new CarrinhoDeCompras(this);
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public CarrinhoDeCompras getCarrinho() { return carrinho; }

    public void destroiCliente() {
        if (carrinho != null) {
            carrinho = null;
            System.out.println("Carrinho de compras destruído junto com o cliente.");
        }
    }

    public void comprar(Produto produto, int quantidade) {
        if (carrinho != null) {
            carrinho.adicionarProduto(produto, quantidade);
        } else {
            System.out.println("Erro: Carrinho de compras não existe.");
        }
    }
}