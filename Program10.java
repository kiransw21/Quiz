/*8.Calculate gross salary of an employee . Gross salary= basic+hra+da, da=basic*da/100, hra=basic*hra/100
 */
import java.util.Scanner;
public class Program10 {
    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the basic salary of an employee");
        int basic=sc.nextInt();
        int da=sc.nextInt();
        int hra=sc.nextInt();
       da=basic*da/100;
       hra=basic*hra/100;
       int grosssalary=basic+hra+da;
       System.out.println("gross salary of an employee is" +grosssalary);
    }
    
}
