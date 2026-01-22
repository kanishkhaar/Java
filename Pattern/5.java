

//Q5.Write a Java program to print a reverse right angle triangle pattern.


import java.util.Scanner;
class Main{
    public static void main (String args[]){
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i+j<=n+1 ){
                System.out.print("* ");
            }
            else{
             System.out.print("  ");
            }
            }
            System.out.println();
        }
    }
}

/*
* 
* * 
* * * 
* * * * 
* * * * * 


*/



