import java.util.Scanner;

public class PruebaComprobaciones {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");
        int num = sc.nextInt();
        Comprobaciones c1= new Comprobaciones();
        System.out.println("El numero es capicua -> "+c1.esCapicua(num));
        System.out.println("El numero es primo -> "+c1.esPrimo(num));
        System.out.println("El numero es menor que el ano 1900 -> "+c1.esAntiguo(num));
        System.out.println("El numero es par -> "+c1.esPar(num));
        System.out.println("El numero es positivo -> "+c1.esPositivo(num));
        System.out.println("El numero es un ano bisiesto -> "+c1.esBisiesto(num));

        System.out.println("Introduce tres numeros enteros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        sc.nextLine(); //permite introducir el siguiente scan
        System.out.println("Los numeros indicados pueden formar un triangulo: "+c1.esTriangulo(num1, num2, num3));
        System.out.println("El primero numero esta en entre "+num2+" y "+num3+" -> "+c1.esIntervalo(num1, num2, num3));

        System.out.println("Introduce un numero entero o texto: ");
        String texto = sc.nextLine();
        System.out.println("El numero o texto introducido es simetrico -> "+c1.esSimetrico(texto));
    }

}
