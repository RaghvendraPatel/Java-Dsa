import java.util.Scanner;

public class inverseofanarray {

    public static void main(String [] args) {

        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int[] a = new int[n1];

        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
         int [] inv = inverse(a);
        for(int j = 0 ; j<a.length; j++){
            System.out.println(inv[j]);
        }



    }

    public static int[] inverse(int [] a){
        int[]inverse = new int[a.length];
       for(int i =0; i<a.length; i++) {
           int value = a[i];
           inverse[value] = i;

       }
       return inverse;
    }
}
