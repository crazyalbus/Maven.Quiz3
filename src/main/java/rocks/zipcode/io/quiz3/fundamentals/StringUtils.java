package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {

            String p1 = str.substring(0, indexToCapitalize);
            String p2 = str.substring(indexToCapitalize,indexToCapitalize+1).toUpperCase();
            String p3 = str.substring(indexToCapitalize+1);

        return p1 + p2 + p3;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {

        char[] baseToArray = baseString.toCharArray();

        boolean result = false;

        for (Character letter : baseToArray
             ) {
            if(letter.equals(characterToCheckFor)) {
                result = true;
            }
        }

        return result;
    }

    public static String[] getAllSubStrings(String string) {

        List<String> substrings = new ArrayList<>();

        for (int i = 0; i < string.length()+1; i++) {
            for (int j = i+1; j < string.length()+1; j++) {
                String temp = string.substring(i,j);
                if(!substrings.contains(temp)) {
                    substrings.add(temp);
                }
            }
        }

        return substrings.toArray(new String[substrings.size()]);
    }

    public static Integer getNumberOfSubStrings(String input){

        return getAllSubStrings(input).length;
    }
}
