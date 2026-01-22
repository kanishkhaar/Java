import java.util.*;
public class Stronum {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = a;
        int temp = 0;
        while(a!=0){
            int last=a%10;
            int fact = 1;
            for(int i=1;i<=last;i++){
                fact = fact*i;
            }
            temp=fact+temp;
            a/=10;
        }
        if(temp==x)System.out.println("Strong Number");
        else System.out.println("Not Strong Number");
    }
}