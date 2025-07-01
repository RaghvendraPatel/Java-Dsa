import java.util.Scanner;

public class firstidexlastidex {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        int data = s.nextInt();
        int l = 0;
        int h = a.length-1;
        int fi = -1;
        for(int j = 0; j<a.length;j++){
           int m = (l+h)/2;
            if(data>a[m]){
                l = m+1;
            }else if(data<a[m]){
                h = m-1;
            }else{
                fi = m;
                h = m -1;
            }
        }
        System.out.println(fi);

        l = 0;
        h = a.length-1;
        int li = -1;
        for(int j = 0; j<a.length;j++){
            int m = (l+h)/2;
            if(data>a[m]){
                l = m+1;
            }else if(data<a[m]){
                h = m-1;
            }else{
                li = m;
                l = m +1;
            }
        }
        System.out.println(li);
    }
}
