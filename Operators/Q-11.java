

//Write a Java Program to print the middle digit of a 3-digit number.



import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
    int	middle=(num/10)%10;                     
		System.out.println(middle);    
		
	}
}
