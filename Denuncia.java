public class Denuncia {
    private int id;
    private Cliente autor;
    private String motivo;
    private String descricao;
    private Produto produtoDenunciado;
    private Vendedor vendedorDenunciado;
    private String status;

    public Denuncia(int id, Cliente autor, String motivo, String descricao, Produto produto, Vendedor vendedor) {
        this.id = id;
        this.autor = autor;
        this.motivo = motivo;
        this.descricao = descricao;
        this.produtoDenunciado = produto;
        this.vendedorDenunciado = vendedor;
        this.status = "EM_ANALISE";
    }

    public void resolverDenuncia(String novoStatus) {
        this.status = novoStatus;
    }

    public int getId() { return id; }
    public Cliente getAutor() { return autor; }
    public String getMotivo() { return motivo; }
    public String getDescricao() { return descricao; }
    public Produto getProdutoDenunciado() { return produtoDenunciado; }
    public Vendedor getVendedorDenunciado() { return vendedorDenunciado; }
    public String getStatus() { return status; }
}