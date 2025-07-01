import java.util.Scanner;

public class pattern13 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sp = 0;
        int st = n;
        int is = 0;
        for(int i =1; i<=n; i++){
          for(int j =1; j<=sp; j++){
              System.out.print("\t");
          }
          for(int k =1; k<=st; k++){
              if(i>1 && i<=n/2 && k>1 && k<st ){
                  System.out.print("\t");
              }else{
                  System.out.print("*\t");
              }

          }



          if(i  <= n/2){
              sp++;
              st-=2;
          }else{
              sp--;
              st+=2;
          }



            System.out.println();
        }

    }
}
