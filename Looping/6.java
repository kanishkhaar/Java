
//Q6. Write a Java program to check whether a number is palindrome or not.

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      int original =n;
       int rev=0;
       while(n!=0){
           int a=n%10;
           rev=rev*10+a;
           n/=10;
       }
       if(original==rev){
       System.out.println("number is palindrome");
       }
       else{
      System.out.println("number is not palindrome");
       }
    }
}