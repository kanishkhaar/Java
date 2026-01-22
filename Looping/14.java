
//Q14. Write a Java program to check whether a given number is a Strong Number or not.

import java.util.Scanner;

class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	   int num=sc.nextInt();
	   int sum=0;
	   int temp=num;
	   while(temp>0){      //  145>0
	     int  digit=temp%10;    //5%10
	       int fact=1;
	       for(int i=1;i<=digit;i++){
	           fact=fact*i;       //120*1
	       }
	   sum=sum+fact;      //120+24+1=145
	   temp=temp/10; // 14/10
	   }
	     if (sum == num)
            System.out.println("Strong Number");
        else
            System.out.println("Not a Strong Number");
    
	}
}
