import java.util.*;
public class Neonnum {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp = 0;
        int sq = (int)Math.pow(a,2);
        while(sq!=0){
            int last = sq%10;
            sq/=10;
            temp+=last;
        }
        if(temp==a)System.out.println("Neon Number");
        else System.out.println("Not Neon Number");
    }
}