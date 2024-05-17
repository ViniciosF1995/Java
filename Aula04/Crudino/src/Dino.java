public class Dino {
    private String nome;
    private  int altura;
    private float peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Dino (String nome, int altura, float peso) {

        this.nome = nome;
        this.altura = altura;
        this.peso = peso;

    }


}
