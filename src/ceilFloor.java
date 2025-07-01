import java.util.Scanner;

public class ceilFloor {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i =0; i<a.length; i++){
            a[i] = s.nextInt();
        }

        int data = s.nextInt();
        int l = 0;
        int h = a.length - 1;
        int ceil = 0;
        int floor = 0;
        for(int j = 0; j<a.length; j++){
            int m = (l+h)/2;
            if(data > a[m]){
                l = m+1;
               floor = a[m];
            }else if(data<a[m]){
                h = m - 1;
                ceil = a[m];
            }else {
              ceil = a[m];
              floor = a[m];
              break;
            }

        }
        System.out.println(ceil);
        System.out.println(floor);

    }
}
