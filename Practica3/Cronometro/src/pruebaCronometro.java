import java.util.Scanner;

public class pruebaCronometro {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        Cronometro c1=new Cronometro();
        long start;
        System.out.println("VAMOS CALCULAR EL TIEMPO ENTRE DOS PULSACIONES!");
        System.out.println("Pulsa la tecla INTRO para empezar! ");
        teclado.nextLine();
        start= c1.sStart();
        System.out.println("Pulsa la tecla INTRO para finalizar!");
        teclado.nextLine();
        long end = c1.sEnd();
        System.out.println("El tiempo que paso entre las dos pulsaciones es de "+c1.esTiempo(start,end)+" ms");
    }
}
