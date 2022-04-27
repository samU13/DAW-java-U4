import java.util.Scanner;

public class Banco {
    private static Cliente clientes[]=new Cliente[1000];
    private static int numSigCliente=0;
    private static Cuenta cuentas[]=new Cuenta[1000];
    private static int numSigCuenta=1;
    private static double comisionMensual=0.6;
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion=0;
        do{
            opcion=mostrarMenu();
            switch (opcion){
                case 1: ingreso();
                    break;
                case 2: cargo();
                    break;
                case 3: consultarSaldo();
                    break;
                case 4: cambioPropietario();
                    break;
                case 6: nuevoCliente();
                    break;
                case 5: revisionMensual();
                    break;
                case 8: listarClientes();
                    break;
                case 7: nuevaCuenta();
                    break;
                case 9: cambiarComisionMensual();
                    break;
            }

        }while (opcion!=0);
    }

    static int mostrarMenu(){
        int opcion;

        System.out.println("1. Ingresar dinero");
        System.out.println("2. Sacar dinero");
        System.out.println("3. Consultar saldo");
        System.out.println("4. Cambiar el cliente");
        System.out.println("5. Revisión mensual");
        System.out.println("6. Nuevo cliente");
        System.out.println("7. Nueva cuenta");
        System.out.println("8. Listar clientes y cuentas");
        System.out.println("9. Cambiar comision mensual");
        System.out.println("0. Salir");

        opcion=teclado.nextInt();
        teclado.nextLine();

        return opcion;
    }

    static void nuevoCliente(){
        String nif, nombre, apellidos;
        System.out.println("Introduzca N.I.F.");
        nif=teclado.nextLine();
        System.out.println("Introduzca nombre");
        nombre=teclado.nextLine();
        System.out.println("Introduzca apellidos");
        apellidos=teclado.nextLine();

        clientes[numSigCliente]=new Cliente(nif,nombre,apellidos);
        numSigCliente++;
    }

    static Cliente localizarCliente(String nif){
        int i;
        for(i=0;i<numSigCliente;i++){
            if(clientes[i].getNif().equals(nif)){
                return clientes[i];
            }
        }
        return null;
    }

    static void listarClientes(){
        int i;
        for(i=0;i<numSigCliente;i++){
            System.out.println("NIF: "+clientes[i].getNif()+"   Nombre: "+clientes[i].getNombre()+"   Apellidos: "+clientes[i].getApellidos());
            listarCuentasCliente(clientes[i]);
        }
    }

    static void nuevaCuenta(){
        String nif;
        int opcion=0;
        double saldo;

        System.out.println("Introduzca tipo de cuenta");
        System.out.println("1. Corriente");
        System.out.println("2. Vivienda");
        System.out.println("3. Fondo de Inversión");
        System.out.println("4. Cancelar");

        opcion=teclado.nextInt();
        teclado.nextLine();

        switch (opcion)
        {
            case 1:
                System.out.println("Introduzca N.I.F. del cliente");
                nif=teclado.nextLine();
                if (localizarCliente(nif)!=null) {
                    System.out.println("Introduzca saldo");
                    saldo=teclado.nextDouble();
                    teclado.nextLine();
                    cuentas[numSigCuenta] = new CuentaCorriente(saldo,numSigCuenta,localizarCliente(nif));
                    numSigCuenta++;
                }
                else
                    System.out.println("El cliente no existe");
                break;
            case 2:
                System.out.println("Introduzca N.I.F. del cliente");
                nif=teclado.nextLine();
                if(localizarCliente(nif)!=null)
                {
                    System.out.println("Introduzca saldo");
                    saldo=teclado.nextDouble();
                    teclado.nextLine();
                    cuentas[numSigCuenta] = new CuentaVivienda(saldo,numSigCuenta,localizarCliente(nif));
                    numSigCuenta++;
                }
                else
                    System.out.println("El cliente no existe");
                break;

            case 3:
                System.out.println("Introduzca N.I.F. del cliente");
                nif=teclado.nextLine();
                if(localizarCliente(nif)!=null)
                {
                    System.out.println("Introduzca saldo");
                    saldo=teclado.nextDouble();
                    teclado.nextLine();
                    cuentas[numSigCuenta] = new FI(saldo,numSigCuenta,localizarCliente(nif));
                    numSigCuenta++;
                }
                else
                    System.out.println("El cliente no existe");
                break;
        }
    }

    static void listarCuentasCliente(Cliente cliente){
        int i;

        for(i=1; i<numSigCuenta; i++){
            if(cliente==cuentas[i].getCliente())
                System.out.println("   Cuenta: "+cuentas[i].getNumeroCuenta()+" Saldo: "+cuentas[i].getSaldo()+" Puntos: "+cuentas[i].getCliente().getPuntos());
        }
    }



}
