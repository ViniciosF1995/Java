public class Livro extends Pedido{
    private String nome;

    private String categoria;

    public Livro(int id, String tipo, String nome, String categoria) {
        super(id, tipo);
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria(){return categoria;}

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void SetCategoria(String categoria) {this.categoria = categoria;}
}
