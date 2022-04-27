public class Alimentos {
    String nombre;
    int lipidos;
    int hidratos;
    int proteinas;
    boolean animal;
    String vitaminas;
    String minerales;

    Alimentos(String nombre) {
        this.nombre = nombre;
    }

    Alimentos(String nombre,int lipidos, int hidratos, int proteinas, boolean animal, String vitaminas, String minerales) {
        this.nombre = nombre;
        this.lipidos = lipidos;
        this.hidratos = hidratos;
        this.proteinas = proteinas;
        this.animal = animal;
        this.vitaminas = vitaminas;
        this.minerales = minerales;
    }

    public String getNombre() {
        return nombre;
    }

    public int getLipidos() {
        return lipidos;
    }

    public int getHidratos() {
        return hidratos;
    }

    public int getProteinas() {
        return proteinas;
    }

    public boolean isAnimal() {
        return animal;
    }

    public String getVitaminas() {
        return vitaminas;
    }

    public String getMinerales() {
        return minerales;
    }

    public boolean esDietetico(){
        int lipidos=getLipidos();
        String vitaminas=getVitaminas();
        return lipidos<20&&!vitaminas.equals("B");
    }

    public double calculoContenidoEnergetico(){
        double lipidos = getLipidos();
        double proteinas = getProteinas();
        double hidratos= getHidratos();
        return ((lipidos/10)*9.4)+((proteinas/10)*5.3)+((hidratos/10)*4.1);
    }

    public boolean esParaDeportistas(){
        int proteinas=getProteinas();
        int hidratos=getHidratos();
        int lipidos=getLipidos();
        return ((proteinas >= 10) && (proteinas <= 15))
                && ((lipidos >= 30) && (lipidos <= 35))
                && ((hidratos >= 55) && (hidratos <= 65));
    }
    public String codigoV(){
        if(getVitaminas().equals("A")||getVitaminas().equals("a")){
            return "Alto";
        }if(getVitaminas().equals("B")||getVitaminas().equals("b")){
            return "Bajo";
        }else{
            return "Medio";
        }

    }
    public String codigoM(){
        if(getMinerales().equals("A")||getMinerales().equals("a")){
            return "Alto";
        }if(getMinerales().equals("B")||getMinerales().equals("b")){
            return "Bajo";
        }else{
            return "Medio";
        }
    }

    public String muestraAlimento() {
        if (isAnimal()) {
            return "El " + getNombre() + " es un alimento que tiene un " + getLipidos() + "% de lipidos, un " + getProteinas() + "% de" +
                    " proteinas y un " + getHidratos() + "% de hidratos. Asi mismo tiene un " + codigoV() + " contenido en" +
                    " vitaminas y un " + codigoM() + " contenido en minerales. Ademas es de origen animal";
        } else {
            return "El " + getNombre() + " es un alimento que tiene un " + getLipidos() + "% de lipidos, un " + getProteinas() + "% de" +
                    " proteinas y un " + getHidratos() + "% de hidratos. Asi mismo tiene un " + codigoV() + " contenido en" +
                    " vitaminas y un " + codigoM() + " contenido en minerales. No es de origen animal";
        }
    }
}
