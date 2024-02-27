
import java.util.Scanner;

public class CountWords
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); // initialize scanner scan
        System.out.println("Enter a sting: "); // user string prompt
        String str = scan.nextLine(); // scan for user input
        // we need to check for the following . , ; ? ! /
        str = str.toLowerCase(); // string is converted to lowercase
        int len = str.length(); // intitialize's length and creates variables for sets the count to zero
        int words = 0;
        int i = 0;
        while (i < len) //while loop begins that checks the string for punchtuation, when punctuation is found the word count increases
        {
            if (str.charAt(i) == '.' && str.charAt(i-1) != '.' && str.charAt(i-1) != ',' && str.charAt(i-1) != ';' && str.charAt(i-1) != '?' && str.charAt(i-1) != '!' && str.charAt(i-1) != '/')
            {
                words++;
                i++;
            }
            else if (str.charAt(i) == ',' && str.charAt(i-1) != '.' && str.charAt(i-1) != ',' && str.charAt(i-1) != ';' && str.charAt(i-1) != '?' && str.charAt(i-1) != '!' && str.charAt(i-1) != '/')
            {
                words++;
                i++;
            }
            else if (str.charAt(i) == ';' && str.charAt(i-1) != '.' && str.charAt(i-1) != ',' && str.charAt(i-1) != ';' && str.charAt(i-1) != '?' && str.charAt(i-1) != '!' && str.charAt(i-1) != '/')
            {
                words++;
                i++;
            }
            else if (str.charAt(i) == '?' && str.charAt(i-1) != '.' && str.charAt(i-1) != ',' && str.charAt(i-1) != ';' && str.charAt(i-1) != '?' && str.charAt(i-1) != '!' && str.charAt(i-1) != '/')
            {
                words++;
                i++;
            }
            else if (str.charAt(i) == '!' && str.charAt(i-1) != '.' && str.charAt(i-1) != ',' && str.charAt(i-1) != ';' && str.charAt(i-1) != '?' && str.charAt(i-1) != '!' && str.charAt(i-1) != '/' && str.charAt(i-1) != ' ')
            {
                words++;
                i++;
            }
            else if (str.charAt(i) == '!' && str.charAt(i-1) != '.' && str.charAt(i-1) != ',' && str.charAt(i-1) != ';' && str.charAt(i-1) != '?' && str.charAt(i-1) != '!' && str.charAt(i-1) != '/' && str.charAt(i-1) != ' ')
            {
                words++;
                i++;
            }
            else if (str.charAt(i) == '/' && str.charAt(i-1) != '.' && str.charAt(i-1) != ',' && str.charAt(i-1) != ';' && str.charAt(i-1) != '?' && str.charAt(i-1) != '!' && str.charAt(i-1) != '/' && str.charAt(i-1) != ' ')
            {
                words++;
                i++;
            }
            else if (str.charAt(i) == ' ' && str.charAt(i-1) != '.' && str.charAt(i-1) != ',' && str.charAt(i-1) != ';' && str.charAt(i-1) != '?' && str.charAt(i-1) != '!' && str.charAt(i-1) != '/' && str.charAt(i-1) != ' ')
            {
                words++;
                i++;
            }
            else
            {
                i++;
            }
        }
        System.out.println("there are " + words + " words"); //final output 
    }
}
