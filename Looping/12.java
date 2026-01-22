
//Q12. Write a Java program to find the sum of all factors of a given number.


import java.util.Scanner;

class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
	    int sum=0;
	for(int i=1;i<=num;i++){
	    if(num%i==0){
	        sum=sum+i;  //12 //12346 12 =28
	    }
	} 
	System.out.print(sum);
	}
}
