//Q8.Write a java program to check if an entered PIN matches the stored ATM PIN before allowing withdrawal.



import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	int storedpin=1234;
	int enteredpin=sc.nextInt();
	if(enteredpin==storedpin){
	    System.out.println("Verified succesfully");
	    System.out.println("You may proceed with withdrawal.");
	}
	else{
	                System.out.println("Invalid pin");
	                System.out.println("Transaction not proceed");


	}
	}
}
