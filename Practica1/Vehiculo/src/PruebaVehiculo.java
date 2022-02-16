public class PruebaVehiculo {

    public static void main(String[] args){
        Vehiculo v1;

        v1= new Vehiculo("Ford");
        v1.setPotencia(100);
        v1.setcRuedas(true);
        System.out.println(v1.imprimir());

        Vehiculo v2;

        v2= new Vehiculo("Renault Megane");
        v2.setPotencia(140);
        v2.setcRuedas(false);
        System.out.println(v2.imprimir());
    }
}
