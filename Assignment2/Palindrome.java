package a1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter text: ");
        String text=sc.next();
        boolean flag=true;
        int left=0, right=text.length()-1;
        while(left<right){
            if(text.charAt(left) != text.charAt(right)){
                flag=false;
                break;
            }
            left++;
            right--;
        }
        if (flag) {
            System.out.println("Palindrome ✅");
        } else {
            System.out.println("Not a palindrome ❌");
        }
    }
}
