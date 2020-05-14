
/**
 * Write a description of class Palindrome here.
 *
 * @author Tim Northrop
 * @version 05.11.20
 */
public class Palindrome
{
    public static String reverseString(String str){
        String result = "";
        for (int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }
        return result;
    }
    
    public static void palindromeChecker(String str){
        String nospace = str.removeSpaces();
        if(reverseString(nospace) == nospace){
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}
