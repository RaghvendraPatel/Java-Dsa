import java.util.Scanner;

public class anybaseaddition {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        int n1 = s.nextInt();
        int n2 = s.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);

    }

    public static int getProduct(int b , int n1, int n2){
        int rv = 0;
        int p = 1 ;
        while (n2 > 0 ){
            int d2 = n2%10;
            n2 = n2/10;

            int sprv = getSingleProduct(b, n1 ,d2);
            rv = getSum(b, rv, sprv*p);

            p = p*10;
        }
       return rv;

    }
    public static int getSingleProduct(int b , int n1 , int d2){


        int rv = 0;
        int c = 0;
        int p = 1;
        while (n1>0 || c>0){
          int d1 = n1%10;
          n1 = n1/10;

          int d = d1*d2+c;
          c = d/b;
          d = d%b;
          rv += d *p;
          p = p*10;

        }
        return rv;
    }
public static int getSum(int b, int n1, int n2){
        int rv = 0;
        int c = 0;
        int p = 1;
      while (n1 >0 || n2 > 0 || c>0) {
          int d1 = n1 % 10;
          int d2 = n2 % 10;
          n1 = n1 / 10;
          n2 = n2 / 10;
          int d = d1 + d2 + c;
          c = d / b;
          d = d % b;
          rv += d * p;
          p = p * 10;
      }
    return rv;
}

//    public static int getSub(int b, int n1, int n2) {
//        int rv = 0;
//        int c = 0;
//        int p = 1;
//        while (n2 > 0) {
//
//            int d1 = n1 % 10;
//            n1 = n1 / 10;
//            int d2 = n2 % 10;
//
//
//            n2 = n2 / 10;
//
//            int d = 0;
//            d2 = d2 + c;
//            if (d2 >= d1) {
//                c = 0;
//                d = d2 - d1;
//            } else {
//                c = -1;
//                d = d2 + b - d1;
//            }
//            rv = rv + d * p;
//            p = p * 10;
//        }
//        return rv;
//    }
}

