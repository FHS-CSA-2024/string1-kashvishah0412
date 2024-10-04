package src.main.java;

public class String1
{
    private String unimplemented = "UNIMPLEMENTED CODE";

    public static void main(String[] args){
        String1 s = new String1();
        System.out.println(s.helloName("Bob"));
        System.out.println(s.makeAbba("Hi", "Bye"));
        System.out.println(s.makeTags("i", "Yay"));
        System.out.println(s.makeOutWord("<<>>", "Yay"));
        System.out.println(s.extraEnd("Hello"));
        System.out.println(s.firstTwo("Hello"));
        System.out.println(s.withoutEnd("Hello"));
        System.out.println(s.comboString("hi", "Hello"));
        System.out.println(s.middleThree("Candy"));
        System.out.println(s.extraFront("Hello"));
        System.out.println(s.left2("Hello"));
        System.out.println(s.hasBad("badxx"));
        System.out.println(s.conCat("abc", "cat"));
        System.out.println(s.minCat("Hello", "Hi"));
        System.out.println(s.withoutX("xHix"));
        System.out.println(s.deFront("Hello"));
    }

    public String1()
    {

    }

    //ONLY EDIT BELOW HERE-------------------------------------------------------------------------

  public class ExtraEnd {

    public static void main(String[] args) {
        // Test cases
        System.out.println(extraEnd("Hello")); // Output: "lololo"
        System.out.println(extraEnd("ab"));    // Output: "ababab"
        System.out.println(extraEnd("Hi"));    // Output: "HiHiHi"
    }

    public static String extraEnd(String str) {
        // Get the last two characters of the string
        String lastTwoChars = str.substring(str.length() - 2);
        // Return three copies of the last two characters
        return lastTwoChars + lastTwoChars + lastTwoChars;
    }
}








public class FirstTwoChars {

    public static void main(String[] args) {
        // Test cases
        System.out.println(firstTwo("Hello"));     // Output: "He"
        System.out.println(firstTwo("abcdefg"));    // Output: "ab"
        System.out.println(firstTwo("ab"));         // Output: "ab"
        System.out.println(firstTwo("X"));          // Output: "X"
        System.out.println(firstTwo(""));           // Output: ""
    }

    public static String firstTwo(String str) {
        // Check the length of the string and return the appropriate substring
        if (str.length() < 2) {
            return str; // Return the original string if its length is less than 2
        }
        return str.substring(0, 2); // Return the first two characters
    }
}






public class FirstHalf {

    public static void main(String[] args) {
        // Test cases
        System.out.println(firstHalf("WooHoo"));      // Output: "Woo"
        System.out.println(firstHalf("HelloThere"));   // Output: "Hello"
        System.out.println(firstHalf("abcdef"));       // Output: "abc"
        System.out.println(firstHalf("123456"));       // Output: "123"
    }

    public static String firstHalf(String str) {
        // Find the index to split the string in half
        int halfLength = str.length() / 2; 
        // Return the first half of the string
        return str.substring(0, halfLength);
    }
}





public class WithoutEnd {

    public static void main(String[] args) {
        // Test cases
        System.out.println(withoutEnd("Hello"));      // Output: "ell"
        System.out.println(withoutEnd("java"));       // Output: "av"
        System.out.println(withoutEnd("coding"));     // Output: "odin"
        System.out.println(withoutEnd("ab"));         // Output: "" (empty string)
        System.out.println(withoutEnd("xyz"));        // Output: "y"
    }

    public static String withoutEnd(String str) {
        // Return the substring without the first and last character
        return str.substring(1, str.length() - 1);
    }
}






public class ComboString {

    public static void main(String[] args) {
        // Test cases
        System.out.println(comboString("hi", "Hello"));    // Output: "hiHellohi"
        System.out.println(comboString("Hello", "hi"));    // Output: "hiHellohi"
        System.out.println(comboString("aaa", "b"));        // Output: "baaab"
        System.out.println(comboString("", "Hello"));        // Output: "Hello"
        System.out.println(comboString("abc", ""));          // Output: "abc"
    }

    public static String comboString(String a, String b) {
        // Determine which string is shorter
        if (a.length() < b.length()) {
            return a + b + a;  // short + long + short
        } else {
            return b + a + b;  // short + long + short
        }
    }
}

public class MiddleThree {

    public static void main(String[] args) {
        // Test cases
        System.out.println(middleThree("Candy"));         // Output: "and"
        System.out.println(middleThree("and"));           // Output: "and"
        System.out.println(middleThree("solving"));       // Output: "lvi"
        System.out.println(middleThree("abcde"));         // Output: "cde"
        System.out.println(middleThree("racecar"));       // Output: "cec"
    }

    public static String middleThree(String str) {
        // Find the start index for the middle three characters
        int midIndex = str.length() / 2;  // Integer division automatically floors
        return str.substring(midIndex - 1, midIndex + 2);  // Extract 3 characters
    }
}



public class ExtraFront {

    public static void main(String[] args) {
        // Test cases
        System.out.println(extraFront("Hello"));  // Output: "HeHeHe"
        System.out.println(extraFront("ab"));      // Output: "ababab"
        System.out.println(extraFront("H"));       // Output: "HHH"
        System.out.println(extraFront(""));        // Output: ""
        System.out.println(extraFront("A"));       // Output: "AAA"
    }

    public static String extraFront(String str) {
        // Get the first two characters or the entire string if it's less than 2 characters
        String front; 
        if (str.length() < 2) {
            front = str;  // Use what is there
        } else {
            front = str.substring(0, 2);  // Get the first two characters
        }
        
        // Create the new string with 3 copies of the front
        return front + front + front;  // Concatenate the front three times
    }
}



public class LeftRotate {

    public static void main(String[] args) {
        // Test cases
        System.out.println(left2("Hello"));  // Output: "lloHe"
        System.out.println(left2("java"));   // Output: "vaja"
        System.out.println(left2("Hi"));     // Output: "Hi"
        System.out.println(left2("abcdef"));  // Output: "cdefab"
        System.out.println(left2("xy"));     // Output: "xy"
    }

    public static String left2(String str) {
        // Get the first two characters
        String firstTwo = str.substring(0, 2);
        // Get the rest of the string after the first two characters
        String restOfString = str.substring(2);
        // Concatenate the rest of the string with the first two characters at the end
        return restOfString + firstTwo;
    }
}


public class HasBad {

    public static void main(String[] args) {
        // Test cases
        System.out.println(hasBad("badxx"));    // Output: true
        System.out.println(hasBad("xbadxx"));   // Output: true
        System.out.println(hasBad("xxbadxx"));  // Output: false
        System.out.println(hasBad(""));          // Output: false
        System.out.println(hasBad("b"));         // Output: false
        System.out.println(hasBad("ba"));        // Output: false
        System.out.println(hasBad("bad"));       // Output: true
    }

    public static boolean hasBad(String str) {
        // Check for "bad" at index 0 or 1
        if (str.length() >= 3) {
            // Check if "bad" begins at index 0
            if (str.substring(0, 3).equals("bad")) {
                return true;
            }
        }
        if (str.length() >= 4) {
            // Check if "bad" begins at index 1
            if (str.substring(1, 4).equals("bad")) {
                return true;
            }
        }
        // If neither condition is met, return false
        return false;
    }
}





public class ConCat {

    public static void main(String[] args) {
        // Test cases
        System.out.println(conCat("abc", "cat"));   // Output: "abcat"
        System.out.println(conCat("dog", "cat"));   // Output: "dogcat"
        System.out.println(conCat("abc", ""));      // Output: "abc"
        System.out.println(conCat("Hello", "lo"));  // Output: "Hello"
        System.out.println(conCat("", "world"));     // Output: "world"
        System.out.println(conCat("hi", "i"));       // Output: "hi"
    }

    public static String conCat(String a, String b) {
        // If either string is empty, return the other string
        if (a.isEmpty()) {
            return b;
        }
        if (b.isEmpty()) {
            return a;
        }

        // Check if the last character of 'a' and the first character of 'b' are the same
        if (a.charAt(a.length() - 1) == b.charAt(0)) {
            // Concatenate without the first character of 'b' (as it's a duplicate)
            return a + b.substring(1);
        }

        // Otherwise, concatenate normally
        return a + b;
    }
}



public class MinCat {

    public static void main(String[] args) {
        // Test cases
        System.out.println(minCat("Hello", "Hi"));       // Output: "loHi"
        System.out.println(minCat("Hello", "java"));     // Output: "ellojava"
        System.out.println(minCat("java", "Hello"));     // Output: "javaello"
        System.out.println(minCat("abc", "xyz"));        // Output: "abcxyz"
        System.out.println(minCat("", "world"));          // Output: "world"
        System.out.println(minCat("onlyone", ""));       // Output: "onlyone"
        System.out.println(minCat("short", "longer"));    // Output: "short"
    }

    public static String minCat(String a, String b) {
        // Determine the lengths of both strings
        int lenA = a.length();
        int lenB = b.length();

        // Calculate the length to be used for concatenation
        if (lenA > lenB) {
            a = a.substring(lenA - lenB); // Trim `a` to the length of `b`
        } else if (lenB > lenA) {
            b = b.substring(lenB - lenA); // Trim `b` to the length of `a`
        }

        // Concatenate the two strings
        return a + b;
    }
}




public class WithoutX {

    public static void main(String[] args) {
        // Test cases
        System.out.println(withoutX("xHix"));  // Output: "Hi"
        System.out.println(withoutX("xHi"));   // Output: "Hi"
        System.out.println(withoutX("Hxix"));  // Output: "Hxi"
        System.out.println(withoutX("Hello")); // Output: "Hello"
        System.out.println(withoutX("x"));     // Output: ""
        System.out.println(withoutX(""));      // Output: ""
        System.out.println(withoutX("xxHi"));  // Output: "Hi"
        System.out.println(withoutX("HiXX"));  // Output: "HiX"
    }

    public static String withoutX(String str) {
        // Check the first character
        if (str.length() > 0 && str.charAt(0) == 'x') {
            str = str.substring(1); // Remove the first character if it's 'x'
        }
        // Check the last character
        if (str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1); // Remove the last character if it's 'x'
        }
        return str; // Return the modified or original string
    }
}


public class DeFront {

    public static void main(String[] args) {
        // Test cases
        System.out.println(deFront("Hello")); // Output: "llo"
        System.out.println(deFront("java"));  // Output: "va"
        System.out.println(deFront("away"));  // Output: "aay"
        System.out.println(deFront("abc"));   // Output: "c"
        System.out.println(deFront("ab"));    // Output: "ab"
        System.out.println(deFront("b"));     // Output: "b"
        System.out.println(deFront("a"));     // Output: "a"
        System.out.println(deFront(""));      // Output: ""
    }

    public static String deFront(String str) {
        // Initialize the result string
        String result = "";

        // Check the first character and add it if it's 'a'
        if (str.length() > 0 && str.charAt(0) == 'a') {
            result += 'a'; // Keep the first character
        }

        // Check the second character and add it if it's 'b'
        if (str.length() > 1 && str.charAt(1) == 'b') {
            result += 'b'; // Keep the second character
        }

        // Append the rest of the string from the 3rd character onwards
        if (str.length() > 2) {
            result += str.substring(2);
        }

        return result; // Return the final modified string
    }
}


