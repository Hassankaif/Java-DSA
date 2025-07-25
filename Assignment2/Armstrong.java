package a1;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("start:");
        int start=sc.nextInt();
        System.out.println("end:");
        int end=sc.nextInt();
        System.out.println("Armstrong num between start and end is...");
        for(int i=start; i<end;i++){
            int original=i;
            int temp=i;
            double sum=0;
            int digits=String.valueOf(i).length();
            while(temp>0){
                int digit=temp%10;
                sum+= Math.pow(digit,digits);
                temp/=10;
            }
            if(Math.round(sum) == original) {
                System.out.print(original+" ");
            }
        }
    }
}
