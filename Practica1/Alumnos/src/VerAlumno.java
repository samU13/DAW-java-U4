import java.util.Scanner;

public class VerAlumno {

    public static void main(String[] args){
       Scanner teclado= new Scanner(System.in);

       Alumno a1;
        System.out.println("Introduce su nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Introduce la matricula del alumno: ");
        int matricula = teclado.nextInt();
        System.out.println("Introduce la primera nota: ");
        double nota1 = teclado.nextDouble();
        System.out.println("Introduce la segunda nota: ");
        double nota2 = teclado.nextDouble();

        a1 = new Alumno(matricula, nombre);
        a1.setNota(nota1, nota2);
        System.out.println(a1.muestraAlumno());


    }

}
