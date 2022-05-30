public class coche {
    final String marca;
    String color;
    int km;

    public coche(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public int getKm() {
        return km;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void addKm (int km){
        if( km < 0) {
            System.out.println(" ERROR! Km menor que cero");
        }else{
           this.km += km;
        }
    }


}
