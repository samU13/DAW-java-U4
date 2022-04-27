public class Vehiculo {
    String modelo;
    double potencia;
    boolean cRuedas;

    Vehiculo(String modelo, double potencia) {
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }


    public boolean iscRuedas() {
        return cRuedas;
    }

    public void setcRuedas(boolean cRuedas) {
        this.cRuedas = cRuedas;
    }

    public String Imprimir() {
        if (iscRuedas()) {
            return "Modelo: " + modelo + "\n" + "Potencia: " + getPotencia() + "\n" + "Traccion a las cuatro ruedas";
        } else {
            return "Modelo: " + modelo + "\n" + "Potencia: " + getPotencia() + "\n" + "Sin traccion a las cuatro ruedas";
        }
    }
}
