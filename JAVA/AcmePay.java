import java.util.*;
public class AcmePay {
    public static void main(String[] args) throws Exception 
    {
        int choice = 0;
        int hours = 0;
        int retire = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter shift - 1 , 2 , or 3");
        int shift = input.nextInt();
        System.out.println("Please enter hours");
        hours = input.nextInt();

        if (shift == 2 || shift == 3)
        {
            System.out.println("Would you like to participate in the retirement plan? - 1 = yes, 2 = no" );
            choice = input.nextInt();
        }

        double rate = payRate(shift);
        double gross = grossPay(rate, hours);
        
        System.out.println("Hours worked is " + hours);
        System.out.println("Hourly pay rate is " + rate);
        hoursBreakdown(rate, hours);
        retirementPay(shift, retire, gross);
    }

    public static double payRate(int shift)
    {
        double shift_Rate = 0;
        switch (shift)
        {
            case 1:
                shift_Rate = 17;
            break;
            case 2:
                shift_Rate = 18.50;
            break;
            case 3:
                shift_Rate = 22;
            break;
        }
        return shift_Rate;
    }

    public static void hoursBreakdown(double rate, double hours)
    {
        
        if (hours >= 40) {
            double overtime_rate = rate * 1.5;
            rate = overtime_rate;
        }
    }

    public static double grossPay(double rate, double hours)
    {
        double gross = rate * hours;
      
        return gross;
    }

    public static void retirementPay(int shift ,int choice, double gross)
    {
        double retire = 0;
        if (shift == 2 || shift == 3 && choice == 1) {
            retire = gross*0.3;
        }
        double netPay = gross - retire;

        System.out.println("Retirment Deduction is " + retire);
        System.out.println("Net Pay is ...................." + netPay);
    }
}
