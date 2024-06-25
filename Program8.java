import java.util.Scanner;

public class Program8 {
     public static void main(String[] args) {
            
                Scanner sc=new Scanner(System.in);
                System.out.println("enter the lower case character");
                String a=sc.nextLine();
                char b=a.charAt(0);
               int asciiValue = (int) b;
               sc.close();
               char l=(char)(b^32);
               System.out.println("uppercase character is"+l);
}
}
