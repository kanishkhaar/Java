

// Q3.Write a Java Program to check whether a person is eligible for senior citizen benefits (age ≥ 60)

    
    
    
    
    import java.util.Scanner;
    class Main{
        public static void main (String args[]){
            Scanner sc=new Scanner(System.in);
            int age=sc.nextInt();
            if(age>=60){
                System.out.println("eligible for senior citizen");
            }
            else if(age>=0){
                               System.out.println(" Not eligible for senior citizen");  

            }
            else{
               System.out.println(" Invalid");  
            }
        }
    }