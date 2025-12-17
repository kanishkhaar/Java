
//Q5.Java Program to find whether the given number is 3 digit number or not


import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
	if((n>=100 && n<=999)  || (n<=-100 && n>=-999)){
	    System.out.println("3-digit number");
	}
	else{
	    System.out.println("Not a 3-digit number");
	}
	}
}

