import java.util.Scanner;

public class saddlepoint {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();


        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                arr[i][j] = s.nextInt();
            }
        }

        for(int i  = 0; i<arr.length; i++){
            int svj = 0;
            for(int j =1 ; j<arr[0].length; j++){
                if(arr[i][svj] >arr[i][j]){
                    svj = j;
                }

            }
            boolean flag  = true;
            for(int k = 0 ; k<arr.length; k++){
                if(arr[k][svj] >arr[i][svj]){
                    flag = false;
                    break;
                }
        }
            if(flag == true){
                System.out.println(arr[i][svj]);
                return;
            }

        }
        System.out.println("Invalid input");

    }
}
