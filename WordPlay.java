
/**
 * Write a description of WordPlay here.
 * 
 * @Damilare Oyediran (your name) 
 * @version (a version number or a date)
 */

import edu.duke.*;
import java.io.*;
import java.util.*;
import org.apache.commons.csv.*;


public class WordPlay {
    /**
    * isVowel: accept a single parameter "character"
    * return true if the character argument is a vowel and false if it is a consonant
    */
    public boolean isVowel(char ch){
        String vowel = "aeiou";
        ch = Character.toLowerCase(ch);
        for(int i = 0; i < vowel.length(); i++){
            char curChar = vowel.charAt(i);
            if(curChar == ch){
                return true;
            }
        }
        return false;
    }
    // Test case for method isVowel.
    public void testIsVowel(char testChar){
        boolean output = isVowel(testChar);
        System.out.println(output);
    }
}
