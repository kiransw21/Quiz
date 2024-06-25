import java.util.Scanner;

public class Program22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        int a=sc.nextInt();
        System.out.println("enter b");
        int b=sc.nextInt();
        System.out.println("enter characters (+,-,*,/) only arithmetic operators are allowed");
        char ch=sc.next().charAt(0);
       
        switch (ch) {
            case '+':
          System.out.println("Addition is"+(a+b));
            break;
            case '*':
           System.out.println("multiplication"+(a*b));
            break;
            case '-':
            System.out.println("substraction"+(a-b));
            break;
            case '/':
            System.out.println("Division"+(a/b));
            break;
             
          }


    
}
}
