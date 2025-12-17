
//Q9.Write a java program to check if withdrawal amount ≤ balance and is a multiple of 100 (ATM Withdrawal Validation).


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
		int WD=sc.nextInt();
		int balance=sc.nextInt();
	if(WD<=balance && WD%100==0){
	    System.out.println("Withdraw Successfull");
	}
	else{
	    	    System.out.println("Withdraw failed");
	    if(WD>balance){
	        	    System.out.println("Insufficient");

	    }
	    if(WD%100!=0){
	        	    System.out.println("multiple by 100");

	    }
	    
	}
	}
}
