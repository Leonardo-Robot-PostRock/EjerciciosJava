package AbstraccionYpolimorfismo.Ejercicio1;

public class Novela {
    private String genero;

    public Novela(String genero) {
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void imprimir(){
        System.out.println("Genero de novela: " + this.genero);
    }
}
