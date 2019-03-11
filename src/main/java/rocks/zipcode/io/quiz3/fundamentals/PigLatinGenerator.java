package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {

        String[] strAsArray = str.split(" ");

        StringBuilder newString = new StringBuilder();

        String translated = "";

        if (strAsArray == null) {
            translated = translateWord(str);
        } else {
            for (String word : strAsArray) {
                String newWord = word;
                newWord = translateWord(word) + " ";
                newString.append(newWord);
            }
        }

        translated = newString.toString();

        return translated.substring(0, translated.length() - 1);
        }


    public String translateWord(String word) {
            String newWord = word;
            if (VowelUtils.isVowel(word.charAt(0))) {
                newWord = word + "way";
            } else if (!VowelUtils.hasVowels(word)) {
                newWord = word + "ay";
            } else {
                while (!VowelUtils.isVowel(newWord.charAt(0))) {
                    String s1 = newWord.substring(1);
                    String s2 = newWord.substring(0, 1);
                    newWord = s1 + s2;
                }
                newWord += "ay";
            }
            return newWord;
        }


}
