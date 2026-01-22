import java.util.*;
public class Magnum {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = a;
        while(sum>9){
            int temp = sum;
            sum = 0;
            while(temp!=0){
                int last = temp%10;
                sum+=last;
                last/=10;
            }
        }
        if(sum==1)System.out.println("Magic Number");
        else System.out.println("Not Magic Number");
    }
}