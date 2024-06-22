public class Milkshake extends Pedido{
    private String tamanho;
    private String sabor;

    public Milkshake(int id, String tipo, String tamanho, String sabor) {
        super(id, tipo);
        this.tamanho = tamanho;
        this.sabor = sabor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
}
