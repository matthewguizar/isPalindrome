import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main{
    public static void main(String[] args){
        System.out.println(palindrome("word"));
        System.out.println(palindrome("racecar"));

    }
        //using loop
    public static boolean isPalindrome(String word){
        int length = word.length();

        for (int i = 0; i < word.length()/2; i++) {
            //checking if the first letter is not equal to the last letter
            if (word.charAt(i) != word.charAt(length -1 - i)){
                return false;
            }
        }

        return true;
    }
//using string builder and built in methods to reverse and check if word is equal to argument passed in
    public static boolean palindrome(String word){
        return word.equals(new StringBuilder(word).reverse().toString());
       
    }
}