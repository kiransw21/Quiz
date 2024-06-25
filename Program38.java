import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class Program38 {
    public static void main(String[] args) {
       /*  Scanner sc=new Scanner(System.in);
        
        String str="kiran gittula";
         str=str.replace(" ","");
        System.out.println(str);
    }
    */
    String a="kiran guttula";
    String b="";
    for(int i=0;i<a.length();i++){
        char ch=a.charAt(i);
        if(!Character.isWhitespace(ch)){
           b+=ch;
        }
    }
    System.out.println(b);
}}
