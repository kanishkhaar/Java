import java.util.*;
public class Pow3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x==0){
            System.out.println("Power of 3");
            return;
        }
        if(x%3==0){
            while(x>3){
                x=x/3;
            }
        }
        if(x==3)System.out.println("Power of 3");
        else System.out.println("Not Power of 3");
    }
}