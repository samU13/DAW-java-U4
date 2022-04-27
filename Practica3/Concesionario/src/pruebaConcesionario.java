import java.util.Scanner;

public class pruebaConcesionario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String modelo;
        double potencia;
        boolean cRuedas;
        Vehiculo[]arr;
        arr = new Vehiculo[1000];
        System.out.println("PROGRAMA CONCESIONARIO. INTRODUZCA LOS COCHES (FIN SI QUIERES ACABAR)");
        for (int i=0; i<=1000;i++){
            System.out.println("Introduce el modelo del coche: ");
            modelo=teclado.nextLine().toUpperCase();
            if(modelo.equals("FIN")){
                System.out.println("Fin del programa");
                break;
            }
            System.out.println("Introduce potencia del coche: ");
            potencia=teclado.nextDouble();
            teclado.nextLine();

            System.out.println("Tiene traccion a las cuatro ruedas? 1.Afirmativo 2.Negativo");
            int cRue = teclado.nextInt();
            cRuedas= cRue == 1;
            arr[i]= new Vehiculo(modelo,potencia);
            arr[i].setcRuedas(cRuedas);
            teclado.nextLine();
        }
        System.out.println("Los coches disponibles en el concesionario son: ");
        for(int i=0; i<arr.length; i++){
            if (arr[i]==null) {
                break;
            }
            //System.out.println("El coche numero " + i + " : "
            // + arr[i].modelo + " " + arr[i].potencia + " cv");

            System.out.println("El coche numero "+i+" : "+"\n"+arr[i].Imprimir());
        }
    }
}
