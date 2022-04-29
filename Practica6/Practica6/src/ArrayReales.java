
public class ArrayReales implements Estadisticas{
    double[]valor;

    public void asignar(){
        for (int i = 0; i < valor.length; i++){
            valor[i]= Math.random();

        }
    }
    public double minimo(){
        double menor = valor[0];
        for (double v : valor) {
            if (menor > v) {
                menor = v;
            }
        }
        return menor;
    }

    public double maximo(){
        double mayor = valor[0];
        for (double v : valor) {
            if (mayor < v) {
                mayor = v;
            }
        }
        return mayor;
    }

    public double sumatorio(){
        double suma=0.0;
        for (double v : valor) {
            suma += v;
        }
        return suma;
    }

    public void imprimir() {
        for (int i = 0; i < valor.length; i++) {
            System.out.println("x[" + i + "]=" + valor[i]);
        }
    }
}
