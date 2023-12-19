/* This class accepts a letter grade A-F
   and a numeric grade 0 - 4 and converts
   the letter grade to a numeric grade and
   the numeric grade to a letter grade.
*/

public class Grade
{
	// Instance fields
	private String origLetter;
	private double newNumeric;
	
	private double origNumeric;
	private String newLetter;
	
	// Default constructor
	public Grade()
	{
		origLetter = "";
		origNumeric = 0;
		newLetter = "";
		newNumeric = 0;
	}
	
	// Parametric constructor
	public Grade(String oldLetter, double oldNumeric)
	{
		origLetter = oldLetter;
		origNumeric = oldNumeric;
		
		setNewNumeric();
		setNewLetter();
	}
	
	// Mutator method for new numeric grade
	private void setNewNumeric()
	{
		if (origLetter.substring(0, 1).equals("A"))
		{
			newNumeric = 4;
		}
		else if (origLetter.substring(0, 1).equals("B"))
		{
			newNumeric = 3;
		}
		else if (origLetter.substring(0, 1).equals("C"))
		{
			newNumeric = 2;
		}
		else if (origLetter.substring(0, 1).equals("D"))
		{
			newNumeric = 1;
		}
		else
		{
			newNumeric = 0;
		}
	}
		
      //Complete the other cases
	
	// Mutator method for new letter grade
	private void setNewLetter()
	{
		if (origNumeric == 4)
		{
			newLetter = "A+";
		}
		else if (origNumeric < 4 && origNumeric >= 3.7)
		{
			newLetter = "A";
		}
		else if (origNumeric < 3.7 && origNumeric >= 3.3)
		{
			newLetter = "A-";
		}
		else if (origNumeric < 3.3 && origNumeric >= 3)
		{
			newLetter = "B+";
		}
		else if (origNumeric < 3 && origNumeric >=2.7)
		{
			newLetter = "B";
		}
		else if (origNumeric < 2.7 && origNumeric >= 2.3)
		{
			newLetter = "B-";
		}
		else if (origNumeric < 2.3 && origNumeric >= 2)
		{
			newLetter = "C+";
		}
		else if (origNumeric < 2 && origNumeric >= 1.7)
		{
			newLetter = "C";
		}
		else if (origNumeric < 1.7 && origNumeric >= 1.3)
		{
			newLetter = "C-";
		}
		else if (origNumeric < 1.3 && origNumeric >= 1)
		{
			newLetter = "D+";
		}
		else if (origNumeric < 1 && origNumeric >= 0.7)
		{
			newLetter = "D";
		}
		else if (origNumeric < 0.7 && origNumeric >= 0.3)
		{
			newLetter = "D-";
		}
		else if (origNumeric < 0.3 && origNumeric == 0)
		{
			newLetter = "F";
		}
	}
		  //Complete the other cases
	
	// Accessor method for new numeric grade
	public double getNewNumeric()
	{
		return newNumeric;
	}
	
	// Accessor method for new letter grade
	public String getNewLetter()
	{
		return newLetter;
	}
}
