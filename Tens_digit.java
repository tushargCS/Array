//Q8 Write a program that finds the tens digit in a non-negative integer N (0 ≤ N ≤ 1000000).
//        Take a look at the examples:
//        If N is 264, the tens digit is 6.
//
//        If N is 4136, the tens digit is 3.
//
//        If N is 101, the tens digit is 0.
//        Report a typo
//        Sample Input 1:
//        173
//        Sample Output 1:
//        7

import java.util.Scanner;

public class TensDigit {
    public void main(){
        int c=0;
        Scanner obj= new Scanner(System.in);
        int A= obj.nextInt();
        c= A/10;
        c=c%10;
        System.out.println(c);
    }

    public static void main(String[] args) {
        TensDigit ob= new TensDigit();
        ob.main();
    }
}
