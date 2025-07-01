import java.util.Scanner;

public class digit_frequency {

    public static int df(int n ,  int d){
        int f =0;

        while( n > 0){
            int num  = n%10;
            if(num == d){
                f++;
            }
            n = n/10;


        }
        return f;
    };
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int d = s.nextInt();
        int freq= df(n , d);

        System.out.println(freq);

    }
}
