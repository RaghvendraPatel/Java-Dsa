import java.util.Scanner;

public class arrays4reverse {


    public static void main(String [] args) {

        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int[] a1 = new int[n1];

        for (int i = 0; i < a1.length; i++) {
            a1[i] = s.nextInt();
        }
        reverse(a1);
        int idx = 0;
        while (idx< a1.length){
            System.out.println(a1[idx]);
            idx++;
        }


    }
    public static void  reverse(int [] a1){

    int i = 0;
    int j = a1.length-1;
    while (i<j){
        int temp = a1[i];
        a1[i] = a1[j];
        a1[j] = temp;
        i++;
        j--;
    }


    }
}
