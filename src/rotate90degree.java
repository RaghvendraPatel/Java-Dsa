import java.util.Scanner;

public class rotate90degree {

    public static void main(String [] args){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int [][]arr = new int[n][m];

        for(int i =0; i<arr.length ; i++){
            for (int j = 0; j<arr[0].length; j++){
                arr[i][j] = s.nextInt();
            }
        }

        //transpose
        for (int i = 0; i<arr.length; i++){
            for (int j = i; j<arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i]= temp;

            }
        }
        //reverse row

        for(int i = 0; i< arr.length; i++){
            int li = 0;
            int ri = arr.length -1;
            while (li<ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;



                li++;
                ri--;
            }

        }
        display(arr);



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
