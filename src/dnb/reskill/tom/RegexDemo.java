package dnb.reskill.tom;

// ANDY: Can you delete this import statement?
import jdk.swing.interop.SwingInterOpUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {


    public static void main(String[] args) {

        // ANDY: Nice usage of Java API for RegExps, I'll go through all the details tomorrow morning (Tuesday). 
        //a series of regular expression tests
        System.out.println(isMatching(".x.a.","yxpar"));//test . which stands for any character (true)
        System.out.println(isMatching(".x.a.","yapar"));//test . which stands for any character (false)
        System.out.println(isMatching("[agh]?","a"));//test that ag or h occurs, but only once and one char (true)
        System.out.println(isMatching("[a]?","ag"));//test that a occurs, but only once and one char (false)
        System.out.println(isMatching("[a]+","aa"));//test that a occurs one or more then one time (true)
        System.out.println(isMatching("[a]+","h"));//test that a occurs one or more then one time (false)
        System.out.println(Pattern.matches("\\d","1")); //test for a digit (true)
        System.out.println(Pattern.matches("\\d","11")); //test for a digit (false)
        System.out.println(Pattern.matches("[\\d]{3}\\Dx?y?","188dy")); //test for a little more complex regex (true)



    }
    public static boolean isMatching(String regex, String stringToTest){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(stringToTest);
        return matcher.matches();
    }



}
