import java.util.Scanner;
public class Program37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=10;
        int key=13;
        int a[]=new int[20];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
         
        }
        System.out.println("element found at ");
        for(int i=0;i<n;i++){
            if(a[i]==key){
                System.out.println(+i);
               
            }
            else{
                System.out.println("element not found");
            }
        }
    }
    
}
