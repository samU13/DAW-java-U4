public class Grupo {
    private String nombre;
    private Alumno al[] = new Alumno[100];
    static int numElements = 0;

    public Grupo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void matricular(Alumno al) {
        if (estaInscrito(al)) {
            System.out.println(al.getNombre() + " ya esta inscrito");
            return;
        }
        this.al[numElements] = al;
        numElements++;
    }
    public boolean estaInscrito(Alumno al) {
        for (int i = 0; i < numElements; i++) {
            if (al == this.al[i]) {
                return true;
            }
        }
        return false;
    }

    public boolean eliminar(Alumno al){
        for (int i = 0; i < numElements; i++){
            if(al==this.al[i]){
                this.al[i]=null;
                return true;
            }
        }
        return false;
    }
    public void imprimir(){
        for(int i=0;i<numElements;i++){
            if(al[i]!=null){
                System.out.println(al[i].getId()+" "+al[i].getNombre()+" "+al[i].getPromedio());
            }
        }
    }
}
