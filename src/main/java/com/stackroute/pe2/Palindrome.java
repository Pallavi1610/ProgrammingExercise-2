package main.java.com.stackroute.pe2;

public class Palindrome {

    public String palindromeCheck(String input)
    {
        char[] reverse = input.toCharArray();
        String reverseword = "";
        for (int i = reverse.length-1; i>=0; i--)
            reverseword = reverseword + reverse[i];

        if(reverseword.equals(input))
        {
            return "Palindrome";
        }
        else
            return "Not a Palindrome";
    }
}
