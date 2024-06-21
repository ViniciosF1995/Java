public class imovel {


private String endereco;
private String area;
private int numeroQuartos;
private int id;

    public imovel(String endereco, String area, int numeroQuartos, int id) {
        this.endereco = endereco;
        this.area = area;
        this.numeroQuartos = numeroQuartos;
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
