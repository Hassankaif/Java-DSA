import java.util.ArrayList;
import java.util.Scanner;

public class Sumofnums {
    //24. Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
    //25. Take integer inputs till the user enters 0 and print the largest number from all.
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int sum=0;
        int num;
        ArrayList<Integer> arr=new ArrayList<>();
        do {
            num=sc.nextInt();
            if(num!=0){
                arr.add(num);
                sum+=num;
            }
        }while (num!=0);
        System.out.println("Sum is : "+sum);
        System.out.println("Max is : " + arr.stream().max(Integer::compare).get());



    }
}
