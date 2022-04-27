public abstract class Cuenta {
    protected double saldo = 0.0D;
    private int numeroCuenta;
    private double tipoInteres;
    private Cliente cliente;

    public Cuenta( double saldo, int numeroCuenta, double tipoIntereses, Cliente cliente){
        this.numeroCuenta=numeroCuenta;
        this.tipoInteres=tipoIntereses;
        this.cliente=cliente;
        ingresar(saldo);
    }

    public double getSaldo() {return saldo;}

    public int getNumeroCuenta() {return numeroCuenta;}

    public void setNumeroCuenta(int numeroCuenta) {this.numeroCuenta = numeroCuenta;}

    public double getTipoInteres() {return tipoInteres;}

    public void setTipoInteres(double tipoInteres) {this.tipoInteres = tipoInteres;}

    public Cliente getCliente() {return cliente;}
    public void setCliente(Cliente cliente) {this.cliente = cliente;}

    public void ingresar(double importe){
        if(importe>0){
            this.saldo=this.saldo+importe;
        }else{
            System.out.println("El importe debe ser mayor a cero");
        }
    }

    public void aplicarComision(double importeComision){this.saldo=this.saldo-importeComision;}
    public void pagarIntereses(){saldo=saldo*(1+this.getTipoInteres()/100);}
    public abstract void retirar(double importe);


}
