import java.util.Scanner;
public class Program7 {
        
            public static void main(String[] args) {
            
                Scanner sc=new Scanner(System.in);
                System.out.println("enter the character");
                String a=sc.nextLine();
                char b=a.charAt(0);
               int asciiValue = (int) b;
               sc.close();
           System.out.println("The ASCII value of '" + b + "' is: " + asciiValue);
            }
        }
    
    

