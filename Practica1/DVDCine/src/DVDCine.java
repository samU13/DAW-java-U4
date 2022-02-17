public class DVDCine {

    String titulo;
    String director;
    String actores;
    int duracion;
    String resumen;
    String genero;

    DVDCine( String titulo, String director, String actores, int duracion, String resumen, String
            genero){
        this.titulo = titulo;
        this.director = director;
        this.actores = actores;
        this.duracion= duracion;
        this.resumen=resumen;
        this.genero=genero;
    }
    boolean esThriller(){
        return genero.equals("Thriller") || genero.equals("thriller");
    }

    boolean tieneResumen() { return resumen.length()>0;}

    String muestraDuracion() { return duracion + " min.";}

    String muestraDVDCine() {
        return titulo.toUpperCase()
                + "\nDe: " + director + "\nCon: " + actores
                + "\n" + genero + "-" + muestraDuracion()
                + "\nResumen:\n" + resumen;
    }
}


