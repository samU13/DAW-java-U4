import java.util.Scanner;

public class pruebaConcesionario {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        String modelo;
        double potencia;
        Vehiculo [] arr;
        arr= new Vehiculo[1000];
        for(int i=0;i<=1000;i++){
            System.out.println("Introduce el modelo del coche: ");
            modelo= teclado.nextLine();
            if(modelo.equals("Fin")){
                System.out.println("Fin del programa");
                break;
            }
            System.out.println("Introduce potencia del coche: ");
            potencia= teclado.nextDouble();teclado.nextLine();
            arr[i]= new Vehiculo(modelo, potencia);
        }
        for (int i = 0; i < arr.length; i++)
            System.out.println("El coche numero " + i + " : " +
                    arr[i].modelo +" "+ arr[i].potencia+" cv");
    }

}
