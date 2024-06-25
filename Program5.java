import java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter principle rate of interest");
        int principle=sc.nextInt();
        int interest=sc.nextInt();
        double Compound=principle*(1+interest/100);
        System.out.println("compound interest is"+Compound);
    }
    
}
