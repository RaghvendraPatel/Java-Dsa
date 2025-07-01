import java.util.Scanner;

public class rotatearray5 {

    public static void main(String [] args) {

        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int[] a = new int[n1];
        int k = s.nextInt();
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        rotate(a , k);
        for(int j = 0; j<a.length; j++){
            System.out.println(a[j]);
        }





    }

    public static void reverse(int[]a  , int i , int j ){
      int li = i;
      int ri = j;
      while (li < ri){
          int temp =a[li];
          a[li] = a[ri];
          a[ri] = temp;
          li++;
          ri--;
      }

    }

    public static void rotate(int []a , int k){
        k = k%a.length;
        if(k<0){
            k = k+a.length;
        }
//        part1
        reverse(a, 0, a.length -k - 1);
//        part2
        reverse(a, a.length- k , a.length-1);

//        all
        reverse(a, 0, a.length-1);
    }
}
