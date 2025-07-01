import java.util.Scanner;

public class digit {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int b = s.nextInt();

        int ans = decimaltobase(n , b);
        System.out.println(ans);
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
