//I completed this in one session so there were no changes made when originally submitted

import java.util.Scanner;
public class Rock
{
  public static void main(String[] args)
  {
    String personPlay; //User's play -- "R", "P", or "S"
    String computerPlay = "U"; //Computer's play -- "R", "P", or "S"
    int computerInt; //Randomly generated number for computer play
    int rounds = 1;
    int wins = 0;
    int lost = 0;
    int ties = 0;
    while (rounds != 11)
    {
      System.out.println("Round " + rounds);
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter your play: R, P, or S");
      personPlay = scan.nextLine(); //Get player's play -- note that this is stored as a string
      personPlay = personPlay.substring(0,2);
      personPlay = personPlay.toUpperCase(); //Make player's play uppercase for ease of comparison
      if (!(personPlay.equals("RO")||personPlay.equals("PA")||personPlay.equals("SC")))
      {
        while (!(personPlay.equals("RO")||personPlay.equals("PA")||personPlay.equals("SC")))
        {
          System.out.println("Incorrect entry! Please try again.");
          personPlay = scan.nextLine();
          personPlay = personPlay.substring(0,2);
          personPlay = personPlay.toUpperCase();
        }
      }
      computerInt = (int)(Math.random() * 3); //Generate computer's play (0,1,2). Use the Math.random() method
      System.out.println(computerInt);
      switch (computerInt + 1) //Translate computer's randomly generated play to string
      {
        case 1:
          computerPlay = "R";
          break;
        case 2:
          computerPlay = "P";
          break;
        case 3:
          computerPlay = "S";
          break;
      }
      System.out.println("Computer play is " + computerPlay);

      if (personPlay.equals("RO"))
      {
        if (computerInt == 1)
        {
          System.out.println("Paper Beats Rock. Computer Wins!");
          lost++;
        }
        else if (computerInt == 2)
        {
          System.out.println("Rock Beats scissors. You win!");
          wins++;
        }
        else
        {
          System.out.println("It's a tie!");
          ties++;
        }
      }
    
      else if (personPlay.equals("PA"))
      {
        if (computerInt == 2)
        {
          System.out.println("Scissors beat Paper. Computer Wins!");
          lost++;
        }
        else if (computerInt == 0)
        {
          System.out.println("Paper Beats Rock. You win!");
          wins++;
        }
        else
        {
          System.out.println("It's a tie!");
          ties++;
        }
      }
      else if (personPlay.equals("SC"))
      {
        if (computerInt == 0)
        {
          System.out.println("Rock beat Scissors. Computer Wins!");
          lost++;
        }
        else if (computerInt == 1)
        {
          System.out.println("Scissors Beats Paper. You win!");
          wins++;
        }
        else
        {
          System.out.println("It's a tie!");
          ties++;
        }
      }
      rounds++;
    }
    System.out.println("You have won: " + wins + " Games.\nThe computer won: " + lost + " Games.\nAnd you tied: " + ties + " Games.");
  }
}
