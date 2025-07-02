import java.util.Scanner;

public class diagonalTraversal {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();


        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                arr[i][j] = s.nextInt();
            }
        }
        for(int g = 0; g<arr.length; g++){
            for(int i =0 , j = g; j<arr.length; i++ , j++){
                System.out.println(arr[i][j] + " ");
            }
        }
    }
}
