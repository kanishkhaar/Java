//Q1. Write a Java program to print the factorial of a given number N.



import java.util.Scanner;
class Main{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long fact=1;
        for(int i=1;i<=n;i++){
            fact =fact*i;
        }
        System.out.println( fact );
      
    }
}