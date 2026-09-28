public class Administrador extends Usuario {
    private boolean master;

    public Administrador(int id, String nome, String email, String senha, boolean master) {
        super(id, nome, email, senha);
        this.master = master;
    }

    public boolean isMaster() { return master; }
}