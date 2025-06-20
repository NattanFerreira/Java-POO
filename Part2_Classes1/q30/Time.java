package Part2_Classes1.q30;

public class Time {
    private String nome, abrev, pais;
    private int titulos;

    public Time(String nome, String abrev, String pais, int titulos) {
        this.nome = nome;
        this.abrev = abrev;
        this.pais = pais;
        this.titulos = titulos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAbrev() {
        return abrev;
    }

    public void setAbrev(String abrev) {
        this.abrev = abrev;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTitulos() {
        return titulos;
    }

    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }

    @Override
    public String toString() {
        return "Time [nome=" + nome + ", abrev=" + abrev + ", pais=" + pais + ", titulos=" + titulos + "]";
    }

}
