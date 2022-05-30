public class EmisoraFM {
    double frecuencia = 80;
    double salto = 0.5;

    public double getFrecuencia() {
        return frecuencia;
    }

    public void up(){
        if(frecuencia<108){
            frecuencia+=salto;
        }else{
            frecuencia=80;
        }
    }

    public void down(){
        if(frecuencia>80){
            frecuencia-=salto;
        }else{
            frecuencia=108;
        }
    }



}
