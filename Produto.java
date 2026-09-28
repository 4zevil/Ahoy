public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private int quantidadeEstoque;
    private String urlFoto;
    private Vendedor vendedor;
    private boolean ativo;

    public Produto(int id, String nome, String descricao, double preco, int estoque, String urlFoto, Vendedor vendedor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeEstoque = estoque;
        this.urlFoto = urlFoto;
        this.vendedor = vendedor;
        this.ativo = true;
    }

    public boolean baixarEstoque(int quantidade) {
        if (quantidade <= this.quantidadeEstoque) {
            this.quantidadeEstoque -= quantidade;
            return true;
        }
        return false;
    }

    public void reativarOuSuspender(boolean status) { this.ativo = status; }
    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }
    public double getPreco() { return preco; }
    public int getQuantidadeEstoque() { return quantidadeEstoque; }
    public String getUrlFoto() { return urlFoto; }
    public Vendedor getVendedor() { return vendedor; }
    public boolean isAtivo() { return ativo; }
}