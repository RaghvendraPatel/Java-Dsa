import java.util.Scanner;

public class pattern5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i =1; i<=n; i++){

            for(int j =1; j<=n; j++){
                if(i+j == n+1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }

            }
            System.out.println();
        }
      }
    }
