import java.util.Scanner;

public class GestionaDVDCine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Título de la película");
        String titulo = sc.nextLine();
        System.out.print("Actores principales: ");
        String actores = sc.nextLine();
        System.out.print("Director: ");
        String director = sc.nextLine();
        System.out.print("Genero: ");
        String genero = sc.nextLine();
        System.out.print("Duración en minutos: ");
        int dura = sc.nextInt();
        sc.nextLine();
        System.out.println("Resumen:");
        String resumen = sc.nextLine();
        DVDCine peli = new DVDCine(titulo,
                director, actores, dura, resumen, genero);
        System.out.println(peli.muestraDVDCine());
        System.out.println(peli.esThriller()
                ? "Es un thriller" : "No es un thriller");
        if (peli.tieneResumen()) {
            System.out.println("La ficha tiene resumen");
        }else{
            System.out.println("La ficha no tiene resumen");
        }
    }
}
