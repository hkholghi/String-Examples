import java.util.Scanner;
/**
 * This program reverses a string text.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringExample3 {

    public static void main(String[] args){
        System.out.print("\f");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = scan.nextLine();
        String revText = reverse(text);
        System.out.println(revText);
    }
    public static String reverse(String s){
        String r = "";
        for(int i=s.length()-1; i>=0; i--){
            r = r + s.charAt(i);
        }
        return r;
    }
}
