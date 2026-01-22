
//Q18. Java Program to check whether a number is a single-digit, two-digit, or three-digit number



import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
   if (num>=0&&num<=9||num<=-1&&num>=-9) {
            System.out.println("It is a single-digit number.");
        } else if (num >= 10 && num <=99||num<=-10&&num>=-99) {
            System.out.println("It is a two-digit number.");
        } else if (num>=100&&num<=999||num<=-100&& num >= -999) {
            System.out.println("It is a three-digit number.");
        } else {
            System.out.println("It is more than three digits.");
        }
    }
}