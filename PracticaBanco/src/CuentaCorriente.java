public class CuentaCorriente extends Cuenta {
    public CuentaCorriente(double saldo, int numeroCuenta, Cliente cliente)
    {
        super(saldo,numeroCuenta,0.1,cliente);
    }
    public  void retirar(double importe){
        if (importe <= saldo)
            saldo = saldo - importe;
        else
        {
            System.out.println("No se puede realizar la transacción.");
            System.out.println("Superas el saldo disponible en tu cuenta");
        }
    }
}
