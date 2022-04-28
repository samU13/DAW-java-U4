import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MenuVideoclub {
    private static final Scanner teclado = new Scanner(System.in);
    private static VideoClub videoclub;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

    public static void main(String[] args) {
        int opcion;
        videoclub = new VideoClub();

        do {
            opcion = mostrarMenu();

            switch (opcion) {
                case 1 -> videoclub.listaProductos();
                case 2 -> addProducto();
                case 3 -> fichaProducto();
                case 4 -> videoclub.listaClientes();
                case 5 -> addCliente();
                case 6 -> fichaCliente();
                case 7 -> alquilarProducto();
                case 8 -> videoclub.listadoAlquileres();
            }

        } while (opcion != 0);
    }

    static int mostrarMenu() {
        int opcion;

        System.out.println("1. Lista productos");
        System.out.println("2. Añadir producto");
        System.out.println("3. Ficha producto");
        System.out.println("4. Lista clientes");
        System.out.println("5. Añadir cliente");
        System.out.println("6. Ficha cliente");
        System.out.println("7. Alquilar producto");
        System.out.println("8. Listado de registro de alquiler");
        System.out.println("0. Salir");

        opcion = teclado.nextInt();
        teclado.nextLine();

        return opcion;
    }

    private static void addProducto() {
        int opcion;

        System.out.println("1. Película");
        System.out.println("2. Videojuego");
        System.out.println("3. Cancelar");
        opcion = Integer.parseInt(teclado.nextLine());
        switch (opcion) {
            case 1 -> addPelicula();
            case 2 -> addVideojuego();
        }
    }

    private static void addPelicula() {
        int referencia;
        String titulo;
        float precio;
        int plazo;
        String genero;
        int ano;
        String director;
        String interpretes;

        System.out.println("Introduzca referencia");
        referencia = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduzca titulo");
        titulo = teclado.nextLine();
        System.out.println("Introduzca precio");
        precio = Float.parseFloat(teclado.nextLine());
        System.out.println("Introduzca plazo");
        plazo = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduzca genero");
        genero = teclado.nextLine();
        System.out.println("Introduzca año");
        ano = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduzca director");
        director = teclado.nextLine();
        System.out.println("Introduzca interpretes");
        interpretes = teclado.nextLine();
        videoclub.addProducto(new Pelicula(referencia,
                titulo,
                precio,
                plazo,
                false,
                genero,
                ano,
                director,
                interpretes));
    }

    private static void addVideojuego() {
        int referencia;
        String titulo;
        float precio;
        int plazo;
        String estilo;
        String plataforma;

        System.out.println("Introduzca referencia");
        referencia = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduzca titulo");
        titulo = teclado.nextLine();
        System.out.println("Introduzca precio");
        precio = Float.parseFloat(teclado.nextLine());
        System.out.println("Introduzca plazo");
        plazo = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduzca estilo");
        estilo = teclado.nextLine();
        System.out.println("Introduzca plataforma");
        plataforma = teclado.nextLine();
        videoclub.addProducto(new Videojuego(referencia,
                titulo,
                precio,
                plazo,
                false,
                estilo,
                plataforma));
    }

    private static void fichaProducto() {
        int referencia;

        System.out.println("Introduzca referencia");
        referencia = Integer.parseInt(teclado.nextLine());
        videoclub.fichaProducto(referencia);
    }

    private static void addCliente() {
        int numero;
        String nombre;
        String direccion;
        String telefono;

        System.out.println("Introduzca numero");
        numero = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduzca nombre");
        nombre = teclado.nextLine();
        System.out.println("Introduzca direccion");
        direccion = teclado.nextLine();
        System.out.println("Introduzca telefono");
        telefono = teclado.nextLine();
        videoclub.addCliente(new Cliente(numero,
                nombre,
                direccion,
                telefono));
    }

    private static void fichaCliente() {
        int numero;

        System.out.println("Introduzca numero cliente");
        numero = Integer.parseInt(teclado.nextLine());
        videoclub.fichaCliente(numero);
    }
    private static void alquilarProducto() {
        int numeroCliente;
        int referenciaProducto;
        Date fechaAlquiler;
        Date fechaDevolucion;
        float importe;

        System.out.println("Introduzca numero cliente");
        numeroCliente = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduzca referencia producto");
        referenciaProducto = Integer.parseInt(teclado.nextLine());
        try
        {
            System.out.println("Introduce fecha alquiler");
            fechaAlquiler = sdf.parse(teclado.nextLine());
            System.out.println("Introduce fecha devolución");
            fechaDevolucion = sdf.parse(teclado.nextLine());
        }
        catch(Exception e){
            System.out.println("Fecha incorrecta");
            return;
        }
        System.out.println("Introduzca importe");
        importe = Float.parseFloat(teclado.nextLine());
        videoclub.addAlquiler(new Alquiler(videoclub.localizarCliente(numeroCliente),
                videoclub.localizarProducto(referenciaProducto),
                fechaAlquiler,
                fechaDevolucion,
                importe));
        videoclub.localizarProducto(referenciaProducto).setAlquilado(true);

    }

}
