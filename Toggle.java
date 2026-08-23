import java.util.*;

public class Toggle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";

        for (int i = 0; i < str.length(); i++) { 
            char ch = str.charAt(i);
            
            if (Character.isLowerCase(ch)) {
                result = result + Character.toUpperCase(ch);
            } else if (Character.isUpperCase(ch)) {
                result = result + Character.toLowerCase(ch);
            } else {
                result = result + ch;
            }
        }
        
          System.out.println(result); 
        
        sc.close(); 
    }
}
