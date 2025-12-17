//Q1.Java Program to find greatest among two numbers


import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	if(a>b){
	    System.out.println(a+" is greater");
	}
	else if(b>a){
	    System.out.println(b+" is greater");
	}
	else{
	   System.out.println("equal");   
	}
	}
}
