public class Cronometro {

    long start;
    long end;

    Cronometro(){

    }
    Cronometro(long start, long end){
        this.start=start;
        this.end=end;
    }

    public long sStart(){
        return System.currentTimeMillis();
    }

    public long sEnd(){
        return System.currentTimeMillis();
    }

    public long esTiempo(long start, long end){
        return end-start;
    }





}
