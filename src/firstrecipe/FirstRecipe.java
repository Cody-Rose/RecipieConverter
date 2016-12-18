package firstrecipe;
import java.util.Scanner;

/**
 This program uses the MesurementConverter class to convert one of 3 amounts into
 another of 3 amounts. The three types are: 1 ounces, 2 grams, 3 UnitsOfMessure.
 When converting grams or ounces to UnitsOfMessure there are multiple static methods
 for a specific UnitOfMeasure.
 
 Note: I have not added in all exceptions to ensure against user error yet. Soon to come.
  
  Author: Cody Rose. Email: codytrose@gmail.com. Date 12/17/2016.
*/
public class FirstRecipe 
{
    public static void main(String[] args) 
    {
        //initilize all variables.
        Scanner keyboard = new Scanner(System.in);
        String exit = "a";
        String answer = "a";
        String finalAnswer = "a";
        int specificUnit = 0;
        
        //set into a loop for user to convert multiple units.
        while(!(exit.equalsIgnoreCase("end")))
        {
            System.out.println("Please enter the amount, in number, of your ingredient:");
            double number = keyboard.nextDouble();
            
            System.out.println("");
            System.out.println("What mesurement is it:");
            System.out.println("1 for ounces, 2 for grams, 3 for units"
                    + "(note: units are like cups)");
            int unit = keyboard.nextInt();
            System.out.println("");
            
            //user has to enter 1-3.
            while (!((unit <= 3) && (unit > 0)))
            {
                System.out.println("Error! Entry is not an option.");
                System.out.println("What is the unit type please type:");
                System.out.println("1 for ounces, 2 for grams, 3 for units"
                        + "(note: units are cups, gallons and their like)");
                unit = keyboard.nextInt();
            }
            
            //determins what unit it is
            switch(unit)
            {
                case 1:
                    System.out.println("What would you like to convert it to?");
                    System.out.println("Enter: 1 for grams, 2 for units.");
                    int conversion = keyboard.nextInt();
                    
                    //determins what to convert to.
                    switch(conversion)
                    {
                        case 1:
                            double newNumber = MesurementConverter.convertOuncesToGrams(number);
                            newNumber = Math.floor(newNumber * 10) / 10;
                            finalAnswer = newNumber + " grams";
                            break;
                        case 2:
                            String newNumber1 = MesurementConverter.convertOuncesToUnitsOfMessure(number);
                            finalAnswer = "\n" + newNumber1;
                            break;
                            
                    }
                    break;
                case 2:
                    System.out.println("What would you like to convert it to?");
                    System.out.println("Enter: 1 for ounces, 2 for units.");
                    conversion = keyboard.nextInt();
                    
                    //determins what to convert to.
                    switch(conversion)
                    {
                        case 1:
                            double newNumber = MesurementConverter.convertGramsToOunces(number);
                            newNumber = Math.floor(newNumber * 10) / 10;
                            finalAnswer = newNumber + " ounces";
                            break;
                        case 2:
                            String newNumber1 = MesurementConverter.convertGramsToUnitsOfMessure(number);
                            finalAnswer = "\n" + newNumber1;
                            break;
                    }
                    break;
                case 3:
                    System.out.println("What kind of unit is it?");
                    System.out.println("Enter: 1 for gallons, 2 for quarts, 3 for pints\n" +
                            "4 for cups, 5 for 3/4 cups, 6 for 1/2 cups, 7 for 1/4 cups\n" +
                            "8 for 1/8 cups, 9 for tablespoons, 10 for teaspoons.");
                    specificUnit = keyboard.nextInt();
                    
                    //determins what kind of specific unit(i.e. cups or gallons...)
                    switch(specificUnit)
                    {
                        case 1:
                            System.out.println("What would you like to convert it to?");
                            System.out.println("Enter 1 for ounces, 2 for grams");
                            conversion = keyboard.nextInt();
                            
                            //determins what to convert to.
                            switch(conversion)
                            {
                                case 1:
                                    double newNumber = MesurementConverter.gallonsToOunces(number);
                                    newNumber = Math.floor(newNumber * 10) / 10;
                                    finalAnswer = newNumber + " ounces";
                                    break;
                                case 2:
                                    newNumber = MesurementConverter.gallonsToGrams(number);
                                    newNumber = Math.floor(newNumber * 10) / 10;
                                    finalAnswer = newNumber + " grams";
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("What would you like to convert it to?");
                            System.out.println("Enter 1 for ounces, 2 for grams");
                            conversion = keyboard.nextInt();
                            
                            //determins what to convert to.
                            switch(conversion)
                            {
                                case 1:
                                    double newNumber = MesurementConverter.quartsToOunces(number);
                                    newNumber = Math.floor(newNumber * 10) / 10;
                                    finalAnswer = newNumber + " ounces";
                                    break;
                                case 2:
                                    newNumber = MesurementConverter.quartsToGrams(number);
                                    newNumber = Math.floor(newNumber * 10) / 10;
                                    finalAnswer = newNumber + " grams";
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("What would you like to convert it to?");
                            System.out.println("Enter 1 for ounces, 2 for grams");
                            conversion = keyboard.nextInt();
                            
                            //determins what to convert to.
                            switch(conversion)
                            {
                                case 1:
                                    double newNumber = MesurementConverter.pintsToOunces(number);
                                    newNumber = Math.floor(newNumber * 10) / 10;
                                    finalAnswer = newNumber + " ounces";
                                    break;
                                case 2:
                                    newNumber = MesurementConverter.pintsToGrams(number);
                                    newNumber = Math.floor(newNumber * 10) / 10;
                                    finalAnswer = newNumber + " grams";
                                    break;
                            }
                            break;
                        case 4:
                            System.out.println("What would you like to convert it to?");
                            System.out.println("Enter 1 for ounces, 2 for grams");
                            conversion = keyboard.nextInt();
                            
                            //determins what to convert to.
                            switch(conversion)
                            {
                                case 1:
                                    double newNumber = MesurementConverter.cupsToOunces(number);
                                    newNumber = Math.floor(newNumber * 10) / 10;
                                    finalAnswer = newNumber + " ounces";
                                    break;
                                case 2:
                                    newNumber = MesurementConverter.cupsToGrams(number);
                                    newNumber = Math.floor(newNumber * 10) / 10;
                                    finalAnswer = newNumber + " grams";
                                    break;
                            }
                            break;
                        case 5:
                            System.out.println("What would you like to convert it to?");
                            System.out.println("Enter 1 for ounces, 2 for grams");
                            conversion = keyboard.nextInt();
                            
                            //determins what to convert to.
                            switch(conversion)
                            {
                                case 1:
                                    double newNumber = MesurementConverter.threeQuarterCupsToOunces(number);
                                    newNumber = Math.floor(newNumber * 10) / 10;
                                    finalAnswer = newNumber + " ounces";
                                    break;
                                case 2:
                                    newNumber = MesurementConverter.threeQuarterCupsToGrams(number);
                                    newNumber = Math.floor(newNumber * 10) / 10;
                                    finalAnswer = newNumber + " grams";
                                    break;
                            }
                            break;
                        case 6:
                            System.out.println("What would you like to convert it to?");
                            System.out.println("Enter 1 for ounces, 2 for grams");
                            conversion = keyboard.nextInt();
                            
                            //determins what to convert to.
                            switch(conversion)
                            {
                                case 1:
                                    double newNumber = MesurementConverter.halfCupsToOunces(number);
                                    newNumber = Math.floor(newNumber * 10) / 10;
                                    finalAnswer = newNumber + " ounces";
                                    break;
                                case 2:
                                    newNumber = MesurementConverter.halfCupsToGrams(number);
                                    newNumber = Math.floor(newNumber * 10) / 10;
                                    finalAnswer = newNumber + " grams";
                                    break;
                            }
                            break;
                        case 7:
                            System.out.println("What would you like to convert it to?");
                            System.out.println("Enter 1 for ounces, 2 for grams");
                            conversion = keyboard.nextInt();
                            
                            //determins what to convert to.
                            switch(conversion)
                            {
                                case 1:
                                    double newNumber = MesurementConverter.quarterCupsToOunces(number);
                                    newNumber = Math.floor(newNumber * 10) / 10;
                                    finalAnswer = newNumber + " ounces";
                                    break;
                                case 2:
                                    newNumber = MesurementConverter.quarterCupsToGrams(number);
                                    newNumber = Math.floor(newNumber * 10) / 10;
                                    finalAnswer = newNumber + " grams";
                                    break;
                            }
                            break;
                        case 8:
                            System.out.println("What would you like to convert it to?");
                            System.out.println("Enter 1 for ounces, 2 for grams");
                            conversion = keyboard.nextInt();
                            
                            //determins what to convert to.
                            switch(conversion)
                            {
                                case 1:
                                    double newNumber = MesurementConverter.eigthCupsToOunces(number);
                                    newNumber = Math.floor(newNumber * 10) / 10;
                                    finalAnswer = newNumber + " ounces";
                                    break;
                                case 2:
                                    newNumber = MesurementConverter.eigthCupsToGrams(number);
                                    newNumber = Math.floor(newNumber * 10) / 10;
                                    finalAnswer = newNumber + " grams";
                                    break;
                            }
                            break;
                        case 9:
                            System.out.println("What would you like to convert it to?");
                            System.out.println("Enter 1 for ounces, 2 for grams");
                            conversion = keyboard.nextInt();
                            
                            //determins what to convert to.
                            switch(conversion)
                            {
                                case 1:
                                    double newNumber = MesurementConverter.tablespoonsToOunces(number);
                                    newNumber = Math.floor(newNumber * 10) / 10;
                                    finalAnswer = newNumber + " ounces";
                                    break;
                                case 2:
                                    newNumber = MesurementConverter.tablespoonsToGrams(number);
                                    newNumber = Math.floor(newNumber * 10) / 10;
                                    finalAnswer = newNumber + " grams";
                                    break;
                            }
                            break;
                        case 10:
                            System.out.println("What would you like to convert it to?");
                            System.out.println("Enter 1 for ounces, 2 for grams");
                            conversion = keyboard.nextInt();
                            
                            //determins what to convert to.
                            switch(conversion)
                            {
                                case 1:
                                    double newNumber = MesurementConverter.teaspoonsToOunces(number);
                                    newNumber = Math.floor(newNumber * 10) / 10;
                                    finalAnswer = newNumber + " ounces";
                                    break;
                                case 2:
                                    newNumber = MesurementConverter.teaspoonsToGrams(number);
                                    newNumber = Math.floor(newNumber * 10) / 10;
                                    finalAnswer = newNumber + " grams";
                                    break;
                            }
                            break;    
                    }
                    break;
            }
            
            //sets the origonal unit to a string.
            if(unit == 1)
            {
                answer = " ounces";
            }
            else if(unit == 2)
            {
                answer = " grams";
            }
            else if(unit == 3)
            {
                //determins what kind of specific unit(i.e. cups or gallons...)
                switch(specificUnit)
                {
                    case 1:
                        answer = " gallons";
                        break;
                    case 2:
                        answer = " quarts";
                        break;
                    case 3:
                        answer = " pints";
                        break;
                    case 4:
                        answer = " cups";
                        break;
                    case 5:
                        answer = " 3/4 cups";
                        break;
                    case 6:
                        answer = " 1/2 cups";
                        break;
                    case 7:
                        answer = " 1/4 cups";
                        break;
                    case 8:
                        answer = " 1/8 cups";
                        break;
                    case 9:
                        answer = " tablespoons";
                        break;
                    case 10:
                        answer = " teaspoons";
                        break;            
                }
            }

            //Prints out before unit and after its conversion.
            System.out.println("");
            System.out.println("Your ingredint of " + number + answer + " converts to " + finalAnswer);
            System.out.println("");
            
            //asks if user is done or not.
            System.out.println("Would you like to convert another ingredient?");
            System.out.println("Enter yes or no:");
            String choice = keyboard.next();
            
            //User can only enter yes or no.
            while (!((choice.equalsIgnoreCase("yes")||(choice.equalsIgnoreCase("no")))))
            {
                System.out.println("");
                System.out.println("Error! Could not recognize your answer." +
                        "Please try again.");
                System.out.println("Would you like to convert another ingredient?");
                System.out.println("Enter yes or no");
                choice = keyboard.nextLine();
            }
            
            //if the user enters no end the program.
            if(choice.equalsIgnoreCase("no"))
            {
                exit = "end";
            }
            
            System.out.println("");
            
        }
        //Always say thank you.
        System.out.println("Thank you!");
    }
    
}