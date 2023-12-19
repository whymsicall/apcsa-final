import java.util.Scanner;

public class CountWords
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sting: ");
        String str = scan.nextLine();
        // we need to check for the following . , ; ? ! /
        str = str.toLowerCase();
        int len = str.length();
        int words = 0;
        int i = 0;
        while (i < len)
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
        System.out.println("there are " + words + " words");
    }
}
