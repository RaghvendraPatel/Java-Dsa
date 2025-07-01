package no;

import java.util.Scanner;

public class ofdigit {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
//        int dig = 0;
//      while( n!= 0){
//          n = n/10;
//          dig++;
//      }
//      System.out.println(dig); //no. of digit
//        int dig = 0;
//        int temp = n;
//while( temp != 0 ) {
//    temp = temp / 10;
//    dig++;
//}

    int div = (int)Math.pow(10 , 1);

//    while(div !=  0) {
        while(n != 0){
        int q = n % div;
        System.out.println(q);
        n = n /10;
//        div = div / 10;
//        div = div *10;
    }





    }
}
