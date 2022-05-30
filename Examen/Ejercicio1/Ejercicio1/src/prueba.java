public class prueba {
    public static void main(String[] args) {
        coche c1=new coche("ford","rojo");

        c1.addKm(22);

        c1.addKm(-22);

        System.out.println(c1.color+c1.marca+c1.getKm());


    }
}
