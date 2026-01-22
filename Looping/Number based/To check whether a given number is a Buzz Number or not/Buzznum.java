import java.util.*;
public class Buzznum {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int last = a%10;
        if(a%7==0 || last==7)System.out.println("Buzz Number");
        else System.out.println("Not Buzz Number");
    }
}