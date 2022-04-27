public class Cuenta {
    private double saldo = 0.0D;
    private int numeroCuenta;
    private double tipointeres;
    private Cliente cliente;

    public Cuenta(double saldoInicial){}

    public double getBlance(){return this.saldo;}

    public void ingresar(double importe){
        if(importe>0.0D){
            this.saldo += importe;
            System.out.println("Transaccion realizada correctamente.");
            System.out.println("Su nuevo saldo es: $" + this.saldo +" --euros");
        }else{
            System.out.println("No se puede realizar la transaccion, el ingreso debe ser mayor a $0-- euros");
        }
    }
    public void retirar(double importe){
        if (importe <=this.saldo) {
            this.saldo -= importe;
            System.out.println("Transaccion realizada correctamente.");
            System.out.println("Usted ha retirado $"+importe+"-- euros. El saldo restante es: $"+this.saldo+"-- euros");
        }else{
            System.out.println("No dispone de saldo suficiente");
        }
    }

    public void actualizarSaldo(double importe){this.saldo+=importe;}

    public int getNumeroCuenta() {
        return numeroCuenta;
    }
}
