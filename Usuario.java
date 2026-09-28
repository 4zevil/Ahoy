public abstract class Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private boolean ativo;

    public Usuario(int id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.ativo = true;
    }

    public boolean autenticar(String email, String senha) {
        return this.email.equalsIgnoreCase(email) && this.senha.equals(senha) && this.ativo;
    }

    public void suspender() {
        this.ativo = false;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public boolean isAtivo() { return ativo; }
}