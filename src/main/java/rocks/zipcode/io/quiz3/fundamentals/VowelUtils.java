package rocks.zipcode.io.quiz3.fundamentals;

import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {

        boolean status = false;

        for (int i = 0; i < word.length(); i++) {
            if(isVowel(word.charAt(i))) {
                status = true;
                break;
            }
        }
        return status;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        Integer index = null;

        for (int i = 0; i < word.length(); i++) {
            if(isVowel(word.charAt(i))) {
                index = i;
                break;
            }
        }
        return index;
    }


    public static Boolean startsWithVowel(String word) {
        return isVowel(word.charAt(0));
    }

    public static Boolean isVowel(char letter) {
        char letterConverted = Character.toLowerCase(letter);
        String lettertostring = Character.toString(letterConverted);
        String[] vowels = new String[]{"a", "e", "i", "o", "u"};
        List<String> vowelList = Arrays.asList(vowels);

        return vowelList.contains(lettertostring);
    }

}
