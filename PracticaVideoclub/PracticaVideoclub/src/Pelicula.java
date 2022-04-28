public class Pelicula extends Producto {
    private String genero;
    private int ano;
    private String director;
    private String interpretes;

    public Pelicula(int referencia, String titulo, float precio, int plazo, boolean alquilado, String genero, int año, String director, String interpretes) {
        super(referencia, titulo, precio, plazo, alquilado);
        this.genero = genero;
        this.ano = año;
        this.director = director;
        this.interpretes = interpretes;
    }

    public String getGenero() {return genero;}

    public void setGenero(String genero) {this.genero = genero;}

    public int getAno() {return ano;}

    public void setAno(int ano) {this.ano = ano;}

    public String getDirector() {return director;}

    public void setDirector(String director) {this.director = director;}

    public String getInterpretes() {return interpretes;}

    public void setInterpretes(String interpretes) {this.interpretes = interpretes;}

    public String mostrar() {
        return  super.mostrar()+
                "\nDirector: "+director+
                "\nGénero: "+genero+
                "\nIntérpretes: "+interpretes;
    }
}
