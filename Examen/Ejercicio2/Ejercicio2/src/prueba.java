public class prueba {
    public static void main(String[] args) {
        Password p1 = new Password();
        Password p2 = new Password(25);
        Password p3 = new Password(18,"555555555EEEEeeeee");

        System.out.println(p2.contrasena);

        System.out.println(p3.eForte());
    }
}
