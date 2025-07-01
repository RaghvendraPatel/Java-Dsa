import java.util.Scanner;

public class anybasetodeci {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int b1 = s.nextInt();
        int b2 = s.nextInt();
        int d = atoa(n,b1,b2);
        System.out.println(d);

    }
    public static int atoa(int n , int b1  , int b2){
        int dtoa = basetodeci(n, b1);
        int btod = decimaltobase(dtoa, b2);
         return btod;
    }
    public static int basetodeci(int b, int d) {

        int rv = 0;
        int p = 1;

        while (b > 0) {
            int dig = b % d;
            b = b / 10;
            rv += dig * p;
            p = p * 8;
        }
        return rv;
    }

    public static int decimaltobase(int n , int b){

        int rv = 0;
        int p = 1;
        while(n > 0){
            int dig  = n % b;
            n = n/b;
            rv  += dig*p;
            p = p*10;
        }
        return rv;
        }
}
