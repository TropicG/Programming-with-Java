import java.util.Arrays;

public class IntroToJava {

    //equevelent of C++ main function
    public static void main(String[] args) {
        exploreString();
        exploreStringBuilder();
        exploreArray();
    }

    public static void exploreString(){

        String literalOne = "FMI"; // goes to the string pool
        String literalTwo = "FMI"; // since there is "FMI" in the string pool literalTwo gets the reference from literalOne

        System.out.println(literalOne == literalTwo); // true since literalOne and literalTwo points to the same string in the string pool

        String newString = new String("FMI"); // creates a new string in the heap

        System.out.println(literalOne == newString); // false since literalOne is in string pool while newString is inside heap
        System.out.println(literalOne.equals(newString)); // true since when we compare them with each other they are equal

        String intern = newString.intern(); // moves newString to the string pool and we return a new reference
        //but since "FMI" is already there we return the original reference from literalOne

        System.out.println(literalOne == newString); //false
        System.out.println(intern == literalOne); // true


        //--------------------------------

        int year = 2022;
        String message = "Current year is: "; // this string is immutable
        message += 2022 + "."; // now we have new string which is "Current year is: 2022." and the old string is left to be collected from the garbage collector

        String[] words = message.split(" "); // words = ("Current", "year", "is", ".")

        // ----------------------------------

        String example = "Example";
        char secondChar = example.charAt(1); // secondChar is now 'x'
        char[] chars = example.toCharArray(); // now chars is an array of the chars in example

        //iterrating with for loop
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i] + " ");
        }

        //iterating with for each loop
        for (char current :chars) {
            System.out.println(current);
        }

        //----------------------------------

        String backToStr1 = String.valueOf(chars); // converts chars to string
        String backToStr2 = Arrays.toString(chars); // does the same as above

        //-------------------------------------------

        String lower = "WHatEver".toLowerCase(); // "whatever"
        String upper = "WHatEver".toUpperCase(); // "WHATEVER"

        // 1st it creates a stringBuilder object 2nd it used the reverse function from StringBuilder and we convert it to String
        String reverse = new StringBuilder(lower).reverse().toString();

        //-------------------------------------------

        String replaced = "cut".replace('c','p'); // "put"
        String substring = "Anaconda".substring(2,6); // "acon"
        boolean containsCo = substring.contains("co"); // true
        boolean startsWithA = substring.startsWith("b"); // false
        boolean endsWithOn = substring.endsWith("da"); // true

        int index_of_N = "Coconut".indexOf("n"); // 4
        int length = "Coconut".length();// 7

        String strippedWithSpaces = "      some whitespaces we want to stip ".strip(); // "some whitespaces we want to stip"
        String intendentText = "Indent this".indent(4); // "    Indent this"

        //-------------------------------------------

        boolean isEmpty = "".isEmpty(); // true
        boolean isNotEmpty = !"".isEmpty(); // true
        boolean isBlank = " ".isBlank();  // true
        boolean equalIgnoringCapitalization = "Java".equalsIgnoreCase("JAVa"); // true
    }

    public static void exploreStringBuilder(){

        //adds all the odd numbers from 0 to 20 in oddNumbers
        StringBuilder oddNumbers = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            if(i % 2 != 0){
                oddNumbers.append(i).append(" ");
            }
        }

        System.out.println(oddNumbers);

        //getting the palindrome of the string
        StringBuilder word = new StringBuilder("racecar");
        boolean isPalindrome = word.equals(word.reverse());
    }

    public static void exploreArray(){

        int[] array; // just declaration - no memory initialization
        array = new int[5]; // allocating memory - now we have array = {0,0,0,0,0}

        String[] stringArray = {"apple", "banana", "cherry" }; // string array with 3 elements is initialzed and declared
        char[] charArray = new char[] {'a', 'b'}; // this is valid as well
        int length = stringArray.length;

        long[][] longMatrix = new long[10][10]; // creating a 2d matrix
        double[][] doubleMatrix = new double[100][]; // array with 100 rows, but all rows still uninitialized

        for (int i = 0; i < 100; i++) {
            doubleMatrix[i] = new double[10]; // now we have initialized everything
        }

        int[] intArray = {1,6,7,3};
        Arrays.sort(intArray); // 1,3,6,7

        int index = Arrays.binarySearch(intArray, 7);// 3

        int[] copy = Arrays.copyOf(intArray, intArray.length); // copy
        boolean areEqual = Arrays.equals(intArray, copy); // true

        System.out.println(Arrays.toString(copy));

        char[][] currentBoard = {{'X','0','X'}, {'X','0','0'}, {'X','X','0'}};
        char[][] winningBoard = {{'X','0','X'}, {'X','0','0'}, {'X','X','0'}};
        boolean isWining = Arrays.deepEquals(currentBoard, winningBoard); // true
    }


}
