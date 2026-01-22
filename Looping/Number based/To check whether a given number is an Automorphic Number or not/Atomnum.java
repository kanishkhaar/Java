import java.util.*;
public class Atomnum {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long sq = a*a;
        long count = 0,x = a;;
        while(x!=0){
            x/=10;
            count++;
        }
        int mod = (int)Math.pow(10,count);
        if(sq%mod==a)System.out.println("Atomorphic Number");
        else System.out.println("Not Atomorphic Number");
    }
}