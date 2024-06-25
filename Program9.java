public class Program9 {
    public static void main(String args[]){
        method1();
        method2();
        method1();
   
    }
    public static void method1(){
        int a=12;
        int b=13;
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
    public static void method2(){
        int x=12,y=34;
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println(x);
        System.out.println(y);
    }
}
