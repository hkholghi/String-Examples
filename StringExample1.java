
/**
 * Write a description of StringExamples here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringExample1 {

    public static void main(String[] args){
        System.out.print("\f");
        String fruit = "banana";
        char letter = fruit.charAt(0);
        System.out.println(letter);
        
        String name = "Alan Turing";
        String upperName = name.toUpperCase();
        System.out.println(upperName);
        String lowerName = name.toLowerCase();
        System.out.println(lowerName);
        
        String text = "Computer Science is fun!";
        text = text.replace("Computer Science", "CS");
        System.out.println(text);
        
        String sample = "this i s a simple test";
        String sentence = sample.replaceAll(" ",",");
        System.out.println(sentence);
        
    }
}
