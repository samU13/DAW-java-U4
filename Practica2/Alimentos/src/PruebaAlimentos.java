import java.text.DecimalFormat;
import java.util.Scanner;

public class PruebaAlimentos {
    public static void main(String[] args) {
        Alimentos a1;
        Scanner teclado=new Scanner(System.in);

        System.out.println("NECESITAREMOS LOS SIGUIENTES DATOS DE UN ALIMENTO :");
        System.out.println("Introduce su nombre : ");
        String nombre= teclado.nextLine();
        System.out.println("Introduce su contenido en lipidos sin % : ");
        int lipidos= teclado.nextInt();
        System.out.println("Introduce su contenido en hidratos sin % : ");
        int hidratos= teclado.nextInt();
        System.out.println("Introduce su contenido en proteinas sin % : ");
        int proteinas= teclado.nextInt(); teclado.nextLine();
        System.out.println("Su contenido en minerales: A alto, M medio, B bajo : ");
        String minerales= teclado.nextLine();
        System.out.println("Su contenido en en vitaminas: A alto, M medio, B bajo : ");
        String vitaminas= teclado.nextLine();
        System.out.println("Es de origen animal: 1.Afirmativo 2.Negativo : ");
        int anim= teclado.nextInt();
        boolean animal;
        animal= anim == 1;

        a1 = new Alimentos(nombre,lipidos,hidratos,proteinas,animal,vitaminas,minerales);

        System.out.println(a1.muestraAlimento());

        if(a1.esDietetico()){
            System.out.println("Es un producto dietetico.");
        }else {
            System.out.println("No es un producto dietetico.");
        }

        if(a1.esParaDeportistas()){
            System.out.println("Es recomendable para deportistas.");
        }else{
            System.out.println("No es recomendable para deportistas.");
        }
        DecimalFormat df= new DecimalFormat("#.00");

        System.out.print("El contenido energetico de 1g del alimentos es de: "+df.format(a1.calculoContenidoEnergetico())+" Kcal");
    }
}
