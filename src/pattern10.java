import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
         int sp = n/2;
         int number = 1;
         int num = 1;
        for(int i = 1; i<=n; i++){

          for(int j =1; j<=sp; j++){
              System.out.print("\t");

          }
           int num1 = num;
          for(int k =1; k<=number; k++){
              System.out.print(num1+"\t");


                if(k<= number/2){
                    num1++;
                }else{
                    num1--;
                }
          }


            if(i<=n/2){
                sp--;
                number+=2;
                num++;
            }else{
                sp++;
                number-=2;
                num--;
            }
            System.out.println();
        }

        }
    }
