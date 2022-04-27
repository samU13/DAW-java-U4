public class Cliente {
    private String nif;
    private String nombre;
    private String apellidos;
    private int puntos;

    public Cliente(String nif, String nombre, String apellidos){
        this.nif=nif;
        this.nombre=nombre;
        this.apellidos=apellidos;
    }

    public int getPuntos() {return puntos;    }
    public void setPuntos(int puntos) {this.puntos = puntos;}
    public String getNif() {return nif;}
    public void setNif(String nif) {
        this.nif = nif;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

}
