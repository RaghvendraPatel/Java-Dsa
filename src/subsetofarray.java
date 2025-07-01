import java.util.Scanner;

public class subsetofarray {

    public static void main(String [] args) {

        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int[] a = new int[n1];

        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        int limit = (int)Math.pow(2 , a.length);
        for(int i= 0; i<limit; i++){
            String set = " ";
            int temp = i;
            for(int j= a.length-1; j>=0; j--){

                int r = temp%2;
                temp = temp /2;
                if(r == 0){
                    set = "_\t" + set;

                }else{
                    set = a[j] + " \t" +set;
                }
            }
            System.out.println(set);
        }
    }
}
