public class Comprobaciones {


    public boolean esPrimo(int num){

        if(num == 0 || num== 1 || num == 4){
            return false;
        }
        for(int x = 2; x < num /2; x++){
            if (num % x == 0)
                return false;
        }
    return true;
    }

    public boolean esAntiguo(int num){
        if(num <= 1900){
            return true;
        }else{
            return false;
        }
    }

    public boolean esPar(int num){
        if(num%2==0){
            return true;
        }else{
            return false;
        }
    }

    public boolean esPositivo(int num){
        if(num>0){
            return true;
        }else{
            return false;
        }
    }

    public boolean esBisiesto(int num){
        if((num % 4 == 0) && ((num % 100 != 0) || (num% 400 == 0))){
            return true;
        }else{
            return false;
        }
    }

    public boolean esCapicua(int num){
        int falta=num;
        int resto=0;
        int numInvertido=0;
        while(falta!=0){
            resto=falta%10;
            numInvertido=numInvertido*10+resto;
            falta=falta/10;
        }
        if(numInvertido==num){
            return true;
        }else{
            return false;
        }
    }

    public boolean esIntervalo(int num1, int num2, int num3){
        if(num1>num2 && num1<num3){
            return true;
        }else{
            return false;
        }
    }

    public boolean esTriangulo(int num1, int num2, int num3){
        if(num1>=(num2+num3) || num2>=(num1+num3) || num3>=(num1+num2)){
            return false;
        }else{
            return true;
        }
    }
}
