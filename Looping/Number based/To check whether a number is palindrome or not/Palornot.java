import java.util.*;
public class Palornot
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = n;
		int rev = 0;
		while(n!=0){
		    int last = n%10;
		    rev = rev*10+last;
		    n /= 10;
		}
		if(rev==m) {
		    System.out.println("Palindrome");
		}else {
		    System.out.println("Not Palindrome");
		}
	}
}
