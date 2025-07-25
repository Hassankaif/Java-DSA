/*
1. Write a program to print whether a number is even or odd, also takeinput from the user.
2. Take name as input and print a greeting message for that particular name.
3. Write a program to input principal, time, and rate (P, T, R) from the user andfind Simple Interest.
4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
5. Take 2 numbers as input and print the largest number.
6. Input currency in rupees and output in USD.
7. To calculate Fibonacci Series up to n numbers.
8. To find out whether the given String is Palindrome or not.
9. To find Armstrong Number between two given number.
 */

 package a1;

 import java.util.Scanner;
 public class Assignment2{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //odd even
        System.out.println("ENTER A NUMBER: ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("EVEN");;
        }else{System.out.println("ODD");}

        //greet name
        System.out.println("Enter your name: ");
        String str1 =sc.next();
        System.out.println("good morning, Mr."+ str1);
        
        //simple interest

        System.out.println("enter Principal \n enter time \n enter rate");
        int p=sc.nextInt();
        int t=sc.nextInt();
        int r=sc.nextInt();
        int si=(p*t*r)/100;
        System.out.println("simple interest is "+si);

        System.out.println("enter num 1: \n num 2: \n operator:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        char op=sc.next().charAt(0);

        if(op=='+'){
            System.out.println(num1+num2);
        }else if(op=='-'){
            System.out.println(num1-num2);
        }else if(op=='*'){
            System.out.println(num1*num2);
        }else if(op=='/'){
            System.out.println(num1/num2);
        }

        System.out.println("enter 2 numbers: ");
        int lar1=sc.nextInt();
        int lar2=sc.nextInt();
        if(lar1>=lar2){ System.out.println("Largest num is "+lar1);}
        else;{ System.out.println("Largest num is "+lar2); }

    }
 }
