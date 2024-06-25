import java.util.Scanner;
public class  Program20{

public static void main(String args[]) {
    int counter;
Scanner sc=new Scanner (System.in);
System.out.println("enter the number ");
int n=sc.nextInt();
for(int i=2;i<=n;i++){
    counter=0;
    for(int j=1;j<=i;j++){
        if(i%j==0){
            counter ++;
        }

    }
if(counter==2)
         System.out.print(i +" ");
        }

    
    
}

}
