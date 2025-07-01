import java.util.Scanner;

public class twodarraymulti {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int r1 = s.nextInt();
        int c1 = s.nextInt();
        int[][] one = new int[r1][c1];
        for (int i = 0; i < one.length; i++) {
            for (int j = 0; j < one[i].length; j++) {

                one[i][j] = s.nextInt();
            }
        }

        int r2 = s.nextInt();
        int c2 = s.nextInt();
        int[][] two = new int[r2][c2];
        for (int i = 0; i < two.length; i++) {
            for (int j =
                 0; j < two[i].length; j++) {

                two[i][j] = s.nextInt();
            }
        }
        if (c1 != r2) {
            System.out.println("invalid input");
            return;
        }

        int[][] prd = new int[r1][c2];
        for (int i = 0; i < prd.length; i++) {
            for (int j = 0; j < prd[i].length; j++) {
                for (int k = 0; k < c1; k++) {
                    prd[i][j] += one[i][k] * two[k][j];
                }
            }
        }
        for (int i = 0; i < prd.length; i++) {
            for (int j = 0; j < prd[i].length; j++) {

                System.out.print(prd[i][j] + " ");
            }
            System.out.println();
        }
    }

}
