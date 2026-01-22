import java.util.*;
public class Hashnum {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = a,temp = 0;
        while(a!=0){
            int last = a%10;
            a/=10;
            temp+=last;
        }
        if(x%temp==0)System.out.println("Hashard Number");
        else System.out.println("Not Hashard Number");
    }
}