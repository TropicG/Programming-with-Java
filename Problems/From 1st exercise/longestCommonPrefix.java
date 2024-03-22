import java.util.Arrays;

public class longestCommonPrefix {
    public static void main(String[] args) {

        StringBuilder prefix = new StringBuilder();

        prefix = getLongestCommonPrefix(new String[]{"flower", "flow", "flight"});
        System.out.println(prefix); // "fl"

        prefix = getLongestCommonPrefix(new String[]{"dog", "racecar", "car"});
        System.out.println(prefix); // empty

        prefix = getLongestCommonPrefix(new String[]{"cat"});
        System.out.println(prefix); // cat
    }


    public static StringBuilder getLongestCommonPrefix(String[] words){

        StringBuilder prefix = new StringBuilder();
        prefix.append(words[0]);

        if(words.length == 1) {
            return prefix;
        }

        //gets the common prefix of every two strings in order
        for (int i = 0; i < words.length - 1; i++) {

            prefix = getPrefix(words[i], words[i+1]);
        }

        //at the end is return the common prefix of all of the strings
        return prefix;
    }

    public static StringBuilder getPrefix(String str1, String str2){

        //getting the common prefix of the two arguments

        int smallerLength = Math.min(str1.length(), str2.length());

        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < smallerLength; i++) {

            if(str1.charAt(i) == str2.charAt(i)) { prefix.append(str1.charAt(i)); }
            else return prefix;
        }

        return prefix;
    }
}
