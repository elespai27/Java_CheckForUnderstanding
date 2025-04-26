package StandardImputandFileHandling;

import java.rmi.ServerError;
import java.util.Scanner;

public class StandardInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sentence;
        System.out.println("Please write a sentence of a few words");
        sentence = scanner.nextLine();
        int count = 0;

        Scanner wordScanner = new Scanner(sentence);

     while (wordScanner.hasNext()){
         String word = wordScanner.next();
         if (word.isEmpty()) continue;
         char firstChar = Character.toLowerCase(word.charAt(0));
         if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u'){
             count++;
             System.out.println("The number of words that start with vowel is: " + "(" + word + ")" + " number " + count);
         } else {
             System.err.println("Skipping word: " + word + " do not start with vowel");
         }
     }


     scanner.close();
     wordScanner.close();
    }


}
