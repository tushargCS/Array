//Q2. Write a program to initialize an integer array with values and check if a given number is present in the array or not.
// If the number is not found, it will print -1 else it will print the index value of the given  number in the array.
//Example 1) If the Array elements are  {1,4,34,56,7} and the search element is 90, then the output expected is -1.
//Example 2)If the Array elements are  {1,4,34,56,7} and the search element is 56, then the output expected is 3.

import java.util.Scanner;

public class Array1 {
    int a,b,i;
    public void main(){
    int A[]= {2,4,5,67,56,66};
    Scanner obj= new Scanner(System.in);
        System.out.println("entre the no");
    a= obj.nextInt();
    for( i=0;i<A.length;i++){
        if(a==A[i]){
            System.out.println(i);
        break;}
    }
         if(A.length!=i){}
         else{
             System.out.println("-1");
         }
}
public static void main(String[] args) {
       Array1 obj= new Array1();
       obj.main();
    }
}
