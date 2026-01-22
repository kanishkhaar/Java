//Q2.Java Program to find smallest among two numbers



import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	if(a<b){
	    System.out.println(a+" is smallest");
	}
	else if(b<a){
	    System.out.println(b+" is smallest");
	}
	else{
	   System.out.println("equal");   
	}
	}
}

