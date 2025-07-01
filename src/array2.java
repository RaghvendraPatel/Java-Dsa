import java.util.Scanner;

public class array2 {

    public static void main(String [] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int n1 = s.nextInt();
        int [] arr1 = new int[n1];
        for(int j = 0 ; j<arr1.length; j++){
            arr1[j] = s.nextInt();
        }
        int [] sum = new int[n>n1 ? n : n1];
        int c =0 ;

        int i = arr.length -1;
        int j = arr1.length - 1;
        int k = sum.length - 1;

        while (k >=0){
              int d = c;
            if(i>= 0){
                d +=arr[i];

            }
            if(j>= 0){
                d += arr1[j];

            }
            c = d/10;
            d= d%10;
            sum[k] = d;
            i--;
            j--;
            k--;

        }
        if(c != 0){
            System.out.println(c);
        }
        for( int value : sum){
            System.out.println(value);
        }


    }
}
