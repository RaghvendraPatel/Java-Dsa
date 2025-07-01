import java.util.Scanner;

public class pattern8 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int a = 0;
        int b =1;

        for(int i=0; i<=n; i++){
            for(int j =0; j<= i ; j++ ){
                System.out.print(a + "\t");
                int c = a+b;
                a = b;
                b = c;

            }
            System.out.println();

        }

    }
}
