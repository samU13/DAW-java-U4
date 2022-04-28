public class Videojuego extends Producto{
    private String estilo;
    private String plataforma;



    public Videojuego(int referencia, String titulo, float precio, int plazo, boolean alquilado, String estilo, String plataforma){
        super(referencia,titulo,precio,plazo,alquilado);
        this.estilo=estilo;
        this.plataforma = plataforma;
    }

    public String getEstilo() {return estilo;}

    public void setEstilo(String estilo) {this.estilo = estilo;}

    public String getPlataforma() {return plataforma;}

    public void setPlataforma(String plataforma) {this.plataforma = plataforma;}

    public String mostrar(){
        return  super.mostrar()+
                "\nEstilo: "+estilo+
                "\nPlataforma: "+plataforma;
    }
}

