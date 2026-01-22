import java.util.*;
public class Proofdig
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pro = 1;
		while(n!=0){
		    int last = n%10;
		    n /= 10;
		    pro*=last;
		}
		System.out.println(pro);
	}
}
