import java.util.*;
public class Persq {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int perfec = (int)Math.sqrt(a);
        perfec = perfec*perfec;
        if(a==perfec) {
            System.out.println("Perfect Square");
        }else {
            System.out.println("Not Perfect Square");
        }
    }
}