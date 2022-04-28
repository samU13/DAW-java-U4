public class Cliente {
    private int numero;
    private String nombre;
    private String direccion;
    private String telefono;

    public Cliente(int numero, String nombre, String direccion, String telefono) {
        this.numero = numero;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getNumero() {return numero;}

    public void setNumero(int numero) {this.numero = numero;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getDireccion() {return direccion;}

    public void setDireccion(String direccion) {this.direccion = direccion;}

    public String getTelefono() {return telefono;}

    public void setTelefono(String telefono) {this.telefono = telefono;}

    public String mostrar()
    {
        return "\nNumero: "+numero+
                "\nNombre: "+nombre+
                "\nDirección: "+direccion+
                "\nTeléfono: "+telefono;
    }
}
