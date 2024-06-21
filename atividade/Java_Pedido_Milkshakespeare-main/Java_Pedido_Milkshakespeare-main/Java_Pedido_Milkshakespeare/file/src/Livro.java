public class Livro extends Pedido{
    private String nome;

    public Livro(int id, String tipo, String nome) {
        super(id, tipo);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
