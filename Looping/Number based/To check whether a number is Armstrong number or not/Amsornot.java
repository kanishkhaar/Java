import java.util.*;
public class Amsornot
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = n;
		int ams = 0;
		int i = 0;
		while(n!=0){
		    n=n/10;
		    i++;
		}
		n=m;
		while(n!=0){
		    int last = n%10;
		    n /= 10;
		    ams = ams+(int)Math.pow(last,i);
		    
		}
		if(ams==m) {
		    System.out.println("Armstrong");
		}else {
		    System.out.println("Not Armstrong");
		}
	}
}
