import java.util.Scanner;

public class subarray {

    public static void main(String [] args) {

        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int[] a = new int[n1];

        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        subarray(a);

    }
    public static void subarray(int[] a){

        for(int i = 0; i<a.length; i++){
            for(int j = i; j<a.length;j++){
                for (int k = i; k<j; k++){
                    System.out.print(a[k] + "\t");
                }
                System.out.println();
            }

        }
    }
}
