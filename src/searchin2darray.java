import java.util.Scanner;

public class searchin2darray {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();


        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                arr[i][j] = s.nextInt();
            }
        }
        int x = s.nextInt();
        int i = 0;
        int j = arr[0].length - 1;
        while (i<arr.length && j>= 0){

            if(arr[i][j] == x){
                System.out.println(i);
                System.out.println(j);
                break;
            }else if(arr[i][j] > x){
                j--;
            }else{
                i++;
            }
        }
        System.out.println("Not Found");
    }
}
