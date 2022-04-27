public class CuentaVivienda  extends Cuenta{

    public CuentaVivienda(double saldo, int numeroCuenta, Cliente cliente){
        super(saldo, numeroCuenta,0.2,cliente);
    }

    public void retirar(double importe){
        System.out.println("No se puede realizar la transaccion.");
        System.out.println("En una cuenta vivienda no se puede retirar dinero.");
    }

    public void aplicarComision(double importeComision){}


}
