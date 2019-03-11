package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {

        String[] wave = new String[str.length()];

//        char[] temp = str.toCharArray();
//        int count = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//
//            for (Character c : temp) {
//                if(Character.isLetter(c))
//            }
//            StringBuilder temp = new StringBuilder();
//
//        }




        for (int i = 0; i < str.length(); i++) {
            String p1 = str.substring(0, i).toLowerCase();
            String p2 = str.substring(i,i+1).toUpperCase();
            String p3 = str.substring(i+1).toLowerCase();


            wave[i] = p1 + p2 + p3;
        }

        return wave;
    }
}
