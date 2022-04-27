public class Comprobaciones {
    public boolean esPrimo(int num) {
        for (int x = 2; x < num / 2; x++) {
            if (num % x == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean esAntiguo(int num) {
        return num <= 1900;
    }

    public boolean esPar(int num) {
        return num % 2 == 0;
    }

    public boolean esPositivo(int num) {
        return num > 0;
    }

    public boolean esBisiesto(int num) {
        return (num % 4 == 0 && num % 100 != 0) || (num % 400 == 0);
    }

    public boolean esCapicua(int num) {
        int falta = num;
        int resto = 0;
        int numInvertido = 0;
        while (falta != 0) {
            resto = falta % 10;
            numInvertido = numInvertido * 10 + resto;
            falta = falta / 10;
        }
        return numInvertido == num;
    }

    public boolean esIntervalo(int num1, int num2, int num3) {
        return num1 > num2 && num1 < num3;
    }

    public boolean esTriangulo(int num1, int num2, int num3) {
        return num1 >= (num2 + num3) || num2 >= (num1 + num3) || num3 >= (num1 + num2);

    }
    public boolean esSimetrico(String texto) {
        for (int i = 0; i < texto.length()/2; i++) {
            if (texto.charAt(i) != texto.charAt(texto.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
