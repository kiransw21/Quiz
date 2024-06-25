import java.util.Scanner;
public class Program6 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the Fahrenheit to get the celsius value");
    int Fahrenheit=sc.nextInt();
    double celsius=(Fahrenheit-32)*(5/9);
    System.out.println("cesius value"+celsius);
    System.out.println("enter the celsius to get the Fahreheit");
    int cel=sc.nextInt();
    double fah=cel*9/5+32;
    System.out.println(" Fahrenheit"+fah );
}
}

