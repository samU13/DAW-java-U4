public class Producto {
    private int referencia;
    private String titulo;
    private float precio;
    private int plazo;
    private boolean alquilado;

    public Producto(int referencia, String titulo, float precio, int plazo, boolean alquilado) {
        this.referencia = referencia;
        this.titulo = titulo;
        this.precio = precio;
        this.plazo = plazo;
        this.alquilado = alquilado;
    }

    public int getReferencia() {return referencia;}

    public void setReferencia(int referencia) {this.referencia = referencia;}

    public String getTitulo() {return titulo;}

    public void setTitulo(String titulo) {this.titulo = titulo;}

    public float getPrecio() {return precio;}

    public void setPrecio(float precio) {this.precio = precio;}

    public int getPlazo() {return plazo;}

    public void setPlazo(int plazo) {this.plazo = plazo;}

    public boolean isAlquilado() {return alquilado;}

    public void setAlquilado(boolean alquilado) {this.alquilado = alquilado;}

    public String mostrar(){
        return "\nReferencia: "+referencia+
                "\nReferencia: "+titulo+
                "\nPrecio: "+precio+
                "\nPlazo: "+plazo+
                "\nAlquilado: "+(alquilado?"Si":"No");
    }
}
