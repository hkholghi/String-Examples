
/**
 * Write a description of StringExample2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringExample2 {

    public static void main(String[] args){
        System.out.print("\f");
        String fruit = "banana";
        for(int i=0; i<fruit.length(); i++){
            char letter = fruit.charAt(i);
            System.out.println(letter);
        }
        
        System.out.println("------------------------------");
        char[] letters = fruit.toCharArray();
        for(char c : letters){
            System.out.println(c);
        }
        
    }
}
