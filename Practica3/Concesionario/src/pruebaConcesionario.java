import java.util.Scanner;

public class pruebaConcesionario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String modelo;
        double potencia;
        Vehiculo[] arr;
        arr = new Vehiculo[1000];
        System.out.println("PROGRAMA CONCESIONARIO. INTRODUZCA LOS COCHES (FIN SI QUIERES ACABAR)");
        for (int i = 0; i <= 1000; i++) {
            System.out.println("Introduce el modelo del coche: ");
            modelo = teclado.nextLine().toUpperCase();
            if (modelo.equals("FIN")) {
                System.out.println("Fin del programa");
                break;
            }
            System.out.println("Introduce potencia del coche: ");
            potencia = teclado.nextDouble();
            teclado.nextLine();
            arr[i] = new Vehiculo(modelo, potencia);
        }
        System.out.println("Los coches disponibles en el concesionario son : ");
        for (int i = 0; i < arr.length; i++) {
          //for (int i=0; !arr[i] == null; i++)
            if (arr[i] == null) {
                break;
            }
            System.out.println("El coche numero " + i + " : "
                    + arr[i].modelo + " " + arr[i].potencia + " cv");
            
            //System.out.println(arr[i].imprimir());
        }
    }

}
