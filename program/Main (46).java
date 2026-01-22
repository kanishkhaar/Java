//Q2.Java Program to find smallest among two numbers



import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
//	int b=sc.nextInt();
	if(n%2==0){
	    System.out.println("even");
	}
	else{
	    System.out.println("odd");
	}
	}
}

//without using (%) using bit wise.


import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if((n&1)==0){
	    System.out.println("even");
	}
	else{
	    System.out.println("odd");
	}
	}
}


