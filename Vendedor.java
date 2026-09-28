public class Vendedor extends Usuario {
    private String cnpjOuCpf;

    public Vendedor(int id, String nome, String email, String senha, String cnpjOuCpf) {
        super(id, nome, email, senha);
        this.cnpjOuCpf = cnpjOuCpf;
    }

    public String getCnpjOuCpf() { return cnpjOuCpf; }
}