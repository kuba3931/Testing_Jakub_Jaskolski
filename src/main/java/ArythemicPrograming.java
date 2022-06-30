import java.util.ArrayList;

public class ArythemicPrograming {

    public static Object[] GetMiddleNumbers(int[] x) {

        ArrayList<Integer> middled = new ArrayList<>();
        int i;

        if (x.length % 2 != 0){
            System.out.println("Wymagana tablica z parzysta iloscia elementow");
        }
        else {
            for (i = 0; i < x.length; i++) {
                if (x.length / 2 == i || x.length / 2 == i + 1) {
                    middled.add(x[i]);
                }
            }
        }
        return middled.toArray();
    }

    public static boolean IsEven(int a){

        if (a % 2 == 0){
            System.out.println("Liczba " + a + " jest parzysta");
            return true;
        }
        else{
            System.out.println("Liczba " + a + " jest nieparzysta");
            return false;
        }
    }

    public static int HowManyDividers(int a){

        ArrayList<Integer> dzielniki = new ArrayList<>();

        int i;

        for (i = 1 ; i <= a ; i++){

            if(a % i == 0){
                dzielniki.add(i);
            }
        }

        System.out.println("liczba " + a +" ma " + dzielniki.size() + " dzielniki");

        return dzielniki.size();
    }

    public static boolean IsCubed(int a){

        int n = (int) Math.cbrt(a);

        if ( n*n*n == a && n >= 0){
            System.out.println("Liczba " + a + " jest szescianem liczby " + n);
            return true;
        }
        else{
            System.out.println("Liczba " + a + " nie jest szescianem zadnej liczby naturalnej");
            return false;
        }
    }

    public static int AdvancedPowerCalculator(int a, int n){

        int i = 1;
        int b = a;

        if(n == 0){
            return 1;
        }
        else{

            while(i != n){
                a *= b;
                i++;
            }
            return a;
        }
    }

    public static boolean IsPrime(int a){

        int i = 2;

        if(a == 0 || a == 1){
            return false;
        }
        else{
            while(i != a){
               if(a % i == 0){
                   return false;
               }
               i++;
            }
            return true;
        }
    }
}
