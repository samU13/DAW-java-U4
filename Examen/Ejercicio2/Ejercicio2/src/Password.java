public class Password {
    int longitud=8;
    String contrasena;

    public Password() {
    }


    public Password(int longitud) {
        this.longitud = longitud;
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
        String password = "";
        for (int i = 0; i < longitud; i++){
            password+=(letras.charAt((int)(Math.random()*letras.length())));
        }
        this.contrasena=password;
    }


    public Password(int longitud, String contrasena) {
        this.longitud = longitud;
        this.contrasena = contrasena;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public boolean eForte(){
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        int contMayusculas=0;
        int contMinusculas=0;
        int contNumeros=0;
        for(int i = 0; i < longitud; i++){
            if(mayusculas.contains("" + (contrasena.charAt(i)))){
                contMayusculas++;
            }
            else if(minusculas.contains("" + (contrasena.charAt(i)))){
                contMinusculas++;
            }
            else if(numeros.contains("" + (contrasena.charAt(i)))){
                contNumeros++;
            }
        }
        System.out.println(contMayusculas+" "+contMinusculas + " "+contNumeros);
        if ( contMayusculas>2 && contMinusculas>1 && contNumeros>5) {
            return true;
        }
        return false;
    }
}
