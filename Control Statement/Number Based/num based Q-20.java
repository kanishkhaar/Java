

//Q20.Java Program to check whether the ASCII value of a character is even or odd.



import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int ascii = (int) ch;// Convert character to ASCII value
        if (ascii % 2 == 0) {
            System.out.println(ch + " is " + ascii + " and it is Even");
        } else {
            System.out.println(ch + " is " + ascii + " and it is Odd");
        }
    }
}
