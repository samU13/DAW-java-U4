public class FI extends Cuenta{
    public FI(double saldo, int numeroCuenta, Cliente cliente)
    {
        super(saldo,numeroCuenta,0.34,cliente);
    }
    public  void retirar(double importe)

    {
        if (importe <= saldo + 500)
            saldo = saldo - importe;
        else
        {
            System.out.println("No se puede realizar la transacción.");
            System.out.println("En un fondo de inversión el saldo negativo no puede superar 500€.");
        }
    }
}
