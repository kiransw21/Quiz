import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Program40
 {
    

        public static void main(String[] args) {
          String line = "This website is aw3som3.";
          int vowels = 0, consonants = 0;
      
          line = line.toLowerCase();
          for (int i = 0; i < line.length(); ++i) {
            char ch = line.charAt(i);
      
            // check if character is any of a, e, i, o, u
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
              ++vowels;
            }
      
            // check if character is in between a to z
            else if ((ch >= 'a' && ch <= 'z')) {
              ++consonants;
            }
    
           
}
          System.out.println(vowels);
            System.out.println(consonants);
 }
}