import java.util.Scanner;

public class FactorsNum {
    public static void main(String[] args) {
        //23. Input a number and print all the factors of that number (use loops).
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        for(int i=1;i<num+1;i++){
            if(num%i==0){
                System.out.print(i+", ");
            }
        }
    }
}
