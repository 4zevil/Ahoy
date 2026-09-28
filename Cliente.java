public class Cliente extends Usuario {
    private String endereco;

    public Cliente(int id, String nome, String email, String senha, String endereco) {
        super(id, nome, email, senha);
        this.endereco = endereco;
    }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
}