import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int sp = 2*n - 3;
        int number = 1;

        for(int i =1; i<=n; i++){
            int num = 1;
            for(int j =1; j<=number; j++){
             System.out.print(num + "\t");
             num++;
            }

            for(int k =1; k <=sp; k++){
                System.out.print("\t");

            }
            if(i ==n ){
                number--;
                num--;
            }

            for(int j =1; j<=number; j++){

               num--;
                System.out.print(num + "\t");
            }

            number++;
            sp-=2;

            System.out.println();



        }
    }
}
