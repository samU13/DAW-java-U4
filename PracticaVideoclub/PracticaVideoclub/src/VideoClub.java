public class VideoClub {
    private Producto productos[];
    private Cliente clientes[];
    private Alquiler alquileres[];
    private int sigProducto;
    private int sigCliente;
    private int sigAlquiler;

    public VideoClub(){
        this.productos = new Producto[1000];
        this.clientes = new Cliente[1000];
        this.alquileres = new Alquiler[1000];
    }

    public void addProducto(Producto dato){
        productos[sigProducto]=dato;
        sigProducto++;
    }

    public void addCliente(Cliente dato){
        clientes[sigCliente]=dato;
        sigCliente++;
    }

    public void addAlquiler(Alquiler dato){
        alquileres[sigAlquiler]=dato;
        sigAlquiler++;
    }

    public void listaProductos() {
        int i;

        for (i = 0; i < sigProducto; i++) {
            System.out.println(i+" "+productos[i].getReferencia()+" - "+productos[i].getTitulo());
        }
    }

    public void fichaProducto(int referencia)
    {
        int i;

        for (i = 0; i < sigProducto; i++) {
            if(referencia==productos[i].getReferencia())
                System.out.println(productos[i].mostrar());
        }
    }

    public Producto localizarProducto(int referencia)
    {
        int i;

        for (i = 0; i < sigProducto; i++) {
            if(referencia==productos[i].getReferencia())
                return productos[i];
        }
        return null;
    }

    public void listaClientes() {
        int i;

        for (i = 0; i < sigCliente; i++) {
            System.out.println(i+" "+clientes[i].getNumero()+" - "+clientes[i].getNombre());
        }
    }

    public void fichaCliente(int numero)
    {
        int i;

        for (i = 0; i < sigCliente; i++) {
            if(numero==clientes[i].getNumero()){
                System.out.println(clientes[i].mostrar());
                listadoAlquileresCliente(clientes[i]);
            }
        }
    }

    public Cliente localizarCliente(int numero)
    {
        int i;

        for (i = 0; i < sigCliente; i++) {
            if(numero==clientes[i].getNumero())
                return clientes[i];
        }
        return null;
    }

    public void listadoAlquileres() {
        int i;

        for (i = 0; i < sigAlquiler; i++) {
            System.out.println(alquileres[i].mostrar());
        }
    }

    public void listadoAlquileresCliente(Cliente c) {
        int i;

        for (i = 0; i < sigAlquiler; i++) {
            if(alquileres[i].cliente==c)
                System.out.println(alquileres[i].mostrarSoloProducto());
        }
    }

}
