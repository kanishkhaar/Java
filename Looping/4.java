

//Q4. Write a Java program to print the product of digits of a given number.

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       int product=1;
       if(num==0){
           product=0;
       } 
       else{
           while(num!=0){
               product=product*num%10;
               num=num/10;
           }
       }
       System.out.println(product);
    }
}