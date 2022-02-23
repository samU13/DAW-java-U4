public class Vehiculo {
    String modelo;
    double potencia;
    boolean cRuedas;

    Vehiculo( String modelo, double potencia){this.modelo=modelo; this.potencia=potencia;}



    public double getPotencia() {
        return potencia;
    }

    public boolean iscRuedas() {
        return cRuedas;
    }

    public String imprimir(){
        if( iscRuedas()){
            return "Modelo: "+modelo+" /nPotencia: "+getPotencia()+ "/nTraccion a las cuatro ruedas";
        }else{
            return "Modelo: "+modelo+" /nPotencia: "+getPotencia()+ "/nSin traccion a las cuatro ruedas";
        }
    }
}
