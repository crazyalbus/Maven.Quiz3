package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {

//        List<String> waveList = new ArrayList<>();
//
//        char[] letters = str.toCharArray();
//
//        int waveLetter = 0;
//        int charCounted = 0;
//
//        while (charCounted < str.length()) {
//            int lettersCounted = 0;
//            StringBuilder temp = new StringBuilder();
//            if(!Character.isLetter(letters[charCounted])) {
//                charCounted++;
//                System.out.println("skipped");
//            } else {
//                for (Character c : letters) {
//                    if (Character.isLetter(c)) {
//                        if (waveLetter == lettersCounted) {
//                            temp.append(Character.toUpperCase(c));
//                            lettersCounted++;
//
//                        } else {
//                            temp.append(Character.toLowerCase(c));
//                            lettersCounted++;
//                        }
//                    } else {
//                        temp.append(c);
//                        lettersCounted++;
//                    }
//                }
//                waveLetter++;
//                charCounted++;
//                waveList.add(temp.toString());
//            }
//        }


        String[] wave = new String[str.length()];


        for (int i = 0; i < str.length(); i++) {
            String p1 = str.substring(0, i).toLowerCase();
            String p2 = str.substring(i,i+1).toUpperCase();
            String p3 = str.substring(i+1).toLowerCase();


            wave[i] = p1 + p2 + p3;
        }

        return wave;
    }
}
