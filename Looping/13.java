
//Q13. Write a Java program to check whether a given integer is a perfect square or not.

import java.util.Scanner;

class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
	
	   int a = (int) Math.sqrt(num);

if(a*a==num){
      System.out.println("Perfect Square");
}
        else
            System.out.println("Not a Perfect Square");
    }
}