public class Vehiculo {
    String modelo;
    double potencia;
    boolean cRuedas;

    Vehiculo( String modelo){
        this.modelo=modelo;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setcRuedas(boolean cRuedas) {
        this.cRuedas = cRuedas;
    }

    public boolean iscRuedas() {
        return cRuedas;
    }

    public String imprimir(){
        if( iscRuedas()){
            return "Modelo: "+modelo+" \nPotencia: "+getPotencia()+ "\nTraccion a las cuatro ruedas";
        }else{
            return "Modelo: "+modelo+" \nPotencia: "+getPotencia()+ "\nSin traccion a las cuatro ruedas";
        }
    }
}
