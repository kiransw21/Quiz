import java.util.Scanner;
public class Program3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius of a circle");
        int radius=sc.nextInt();
        double area=3.14*radius*radius;
        System.out.println("area of acircle"+area);

    }
}
