import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        for (int i = n1; i <= n2; i++) {
            int count = 0;
            for (int div = 2; div * div <= n2; div++) {
                if (i % div == 0) {
                    count++;
                    break;
                }


            }
            if (count == 0) {
                System.out.println("prime");

            }else{
                System.out.println("not prime");
            }
        }
    }
}

