

//	Write a Java Program to print the sum of the first and last digit of a 3-digit number.






import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	
int	first=num/100;            //7
int	last=num%10;                      //3
	int	sum=first+last;
		System.out.println(sum);     //7+3=10
		
	}
}
