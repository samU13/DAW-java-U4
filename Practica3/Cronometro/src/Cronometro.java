    public class Cronometro {
        Cronometro(){}
        public long sStart(){return System.currentTimeMillis();}
        public long sEnd(){return System.currentTimeMillis();}
        public long esTiempo(long start, long end){ return end-start;}
    }


