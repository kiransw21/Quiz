import java.util.Scanner;
public class Program4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values of principle,time ,rate of interest");
        int principle=sc.nextInt();
        int time=sc.nextInt();
        int interest=sc.nextInt();

        double simple=principle*time*interest/100;
        System.out.println("simple interest is"+simple);

    }
}
