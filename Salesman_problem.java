import java.util.Scanner;

public class Salesman_problem {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Company arr[]= new Company[5];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the sales of 3 items sold by salesman "+i+":");
            arr[i]=new Company(sc.nextInt(),sc.nextInt(),sc.nextInt());
        }
        int sum1=0,sum2=0,sum3=0;
        for(int i=0;i<arr.length;i++){
            int s=arr[i].product1+arr[i].product2+arr[i].product3;
            sum1=sum1+arr[i].product1;
            sum2=sum2+arr[i].product2;
            sum3=sum3+arr[i].product3;
            System.out.println("Total Sales By Salesman"+i+"is "+s);
        }
        System.out.println("Total sales of item 1 = " +sum1+"\n"+
                "Total sales of item 2 = " +sum2+"\n"+
                "Total sales of item 3 ="+sum3);

    }
}
class Company{
    int product1,product2,product3;
    public Company(int one,int two,int three){
     product1=one;
     product2=two;
     product3=three;
    }

}
