package Assignment2 ;
import java.util.Scanner;

 public class Fibonacci {
    public static void main(String[] args) {
        int n1=0,n2=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no of terms: ");
        int n=sc.nextInt();
        System.out.print(n1+" "+n2);
        for(int i=2;i<n;i++){
            int temp=n1+n2;
            System.out.print(" "+temp);
            n1=n2;
            n2=temp;
        }

    }
}
