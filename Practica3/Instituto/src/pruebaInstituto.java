public class pruebaInstituto {
    public static void main(String[] args) {
        Alumno al1 = new Alumno(1, "ALFA", 6.5);
        Alumno al2 = new Alumno(2, "BETA", 4.5);
        Alumno al3 = new Alumno(3, "GAMMA", 5.5);

        Grupo grup = new Grupo("ASIR");
        System.out.println("Listado de alumnos en "+grup.getNombre()+":\n");
        grup.imprimir();

        grup.matricular(al1);
        grup.matricular(al2);
        grup.matricular(al3);

        System.out.println("Listado de alumnos en "+grup.getNombre()+":\n");
        grup.imprimir();
        System.out.println();
        if (grup.estaInscrito(al2))
            System.out.println(al2.getNombre()+" está inscrito");
        else
            System.out.println(al2.getNombre()+" no está inscrito");
        if (grup.estaInscrito(al3))
            System.out.println(al3.getNombre()+" está inscrito");
        else
            System.out.println(al3.getNombre()+" no está inscrito");

        if(grup.eliminar(al2))
            System.out.println(al2.getNombre()+" ha sido eliminado");
        else
            System.out.println(al2.getNombre()+" no ha podido eliminarse");

        System.out.println("Listado de alumnos en "+grup.getNombre()+":\n");
        grup.imprimir();

    }



}

