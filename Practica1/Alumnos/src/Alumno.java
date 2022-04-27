public class Alumno {
    int matricula;
    String nombre;
    double nota1, nota2;

    Alumno(int matricula, String nombre){
        this.matricula=matricula;
        this.nombre=nombre;
    }

    public void setNota ( double nota1, double nota2){
        this.nota1=nota1;
        this.nota2=nota2;
    }

    public double getMedia(){
        return (nota1+nota2)/2;
    }

    public String muestraAlumno(){
        return "Matricula del alumno: "+matricula+"\r\n"+"Nombre: "+nombre+"\r\n"+"Nota media del alumno: "+getMedia();
    }

}
