import java.util.Scanner;

public class shellRotation {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                arr[i][j] = s.nextInt();
            }
        }
        int shell = s.nextInt();
        int r = s.nextInt();
        rotateShell(arr , shell ,r);
        display(arr);

    }





   public static void rotateShell(int[][]arr  ,int  shell , int r){
        int []oned = fillOnedFromShell(arr, shell);
        rotate(oned ,r);
        fillShellFromOned(arr ,shell , oned);
   }
   public static int [] fillOnedFromShell(int [][] arr , int shell){
        int minr = shell -1;
        int minc = shell -1;
        int maxr = arr.length - shell;
        int maxc = arr[0].length - shell;
        int sz =  2 *(maxr + maxc - minr - minc);
        int[] oned = new int[sz];
        //lw
       int idx = 0;
       for(int i = minr , j = minc ; i<=maxr; i++){
           oned[idx] = arr[i][j];
           idx++;

       }
       //bw
       for(int i = maxr , j= minc+1 ; j<= maxc; j++){
           oned[idx] = arr[i][j];
           idx++;

       }
//       rw
       for(int i = maxr-1, j= maxc; i>= minr; i--){
           oned[idx] = arr[i][j];
           idx++;
       }
//       tw
       for(int i = minr , j = maxc-1; j>= minc+1; j--){
           oned[idx] = arr[i][j];
           idx++;
       }
       return oned;
   }

   public static void fillShellFromOned(int[][]arr , int shell , int []oned){
       int minr = shell -1;
       int minc = shell -1;
       int maxr = arr.length - shell;
       int maxc = arr[0].length - shell;

       //lw
       int idx = 0;
       for(int i = minr , j = minc ; i<=maxr; i++){
           arr[i][j]  = oned[idx];
           idx++;

       }
       //bw
       for(int i = maxr , j= minc+1 ; j<= maxc; j++){
           arr[i][j]  =  oned[idx] ;
           idx++;

       }
//       rw
       for(int i = maxr-1, j= maxc; i>= minr; i--){
           arr[i][j]  = oned[idx] ;
           idx++;
       }
//       tw
       for(int i = minr , j = maxc-1; j>= minc+1; j--){
           arr[i][j]  = oned[idx] ;
           idx++;
       }
   }

   public static void rotate(int []oned , int r){

        r = r% oned.length;
        if(r<0){
            r = r + oned.length;
        }

        reverse(oned , 0, oned.length-r - 1);
        reverse(oned , oned.length - r , oned.length-1 );
        reverse(oned , 0 , oned.length - 1);
   }

   public static void reverse(int [] oned , int li , int ri){
        while (li<ri){
            int temp = oned[li];
            oned[li] = oned[ri];
            oned[ri] = temp;

            li++;
            ri--;
        }

   }

   public static void display(int[][] arr){
        for(int i =0; i<arr.length ; i++){
            for (int j = 0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
