package firstrecipe;

/**
 This class uses static methods to convert a recipes mesurements from one of three
 types to the other type. The three types are: 1 ounces, 2 grams, 3 UnitsOfMessure.
 When converting grams or ounces to UnitsOfMessure there are multiple static methods
 for a specific UnitOfMeasure.
  
 Author: Cody Rose. Email: codytrose@gmail.com. Date 12/17/2016.
*/
public class MesurementConverter 
{
    public static final double GRAMS_PER_OUNCE = 28.35;
    public static final double OUNCES_PER_GALLON = 128;
    public static final double OUNCES_PER_QUART = 32;
    public static final double OUNCES_PER_PINT = 16;
    public static final double OUNCES_PER_CUP = 8;
    public static final double OUNCES_PER_THREEQUARTERCUP = 6;
    public static final double OUNCES_PER_HALFCUP = 4;
    public static final double OUNCES_PER_QUARTERCUP = 2;
    public static final double OUNCES_PER_EIGTHCUP = 1;
    public static final double OUNCES_PER_TABLESPOON = 0.5;
    public static final double OUNCES_PER_TEASPOON = 0.16;
    
    public static double convertGramsToOunces(double grams)
    {
        double ounces = grams / GRAMS_PER_OUNCE;
        return ounces;
    }
    
    public static double convertOuncesToGrams(double ounces)
    {
        double grams = ounces * GRAMS_PER_OUNCE;
        return grams;
    }
    
    /**
     This method converts ounces into the unitsOfMesure, which are gallons, cups 
     and tbs and so on.
    */
    public static String convertOuncesToUnitsOfMessure(double user)
    {        
        //Converts user to a usable integer.
        user = user * 100;
        int ounces = (int)user;
        
        //initialize all needed arguments.
        int amount, gallon, quart, pint, cup, cup3to4, cup1to2, cup1to4;
        int cup1to8, tbs, tsp, tsp1to2, tsp1to4;
        String Ounces, measurement;
        String answer = "";
        
        System.out.println("");
        
        if(ounces > 0)//Needs conversion
        {   
            //One spot for each unit of mesure
            String[] unit = new String[11];
            String empty = "empty";//For array
            int count = 0;//For array
            
            for(count = 0; count < 11; count++)//fills array with empty.
            {
                unit[count] = empty;
            }
            count = 0;
            
            //Actual conversion process. Will set non-used arguments as 0.
            amount = ounces;
            gallon = amount / 12800;
            amount = amount % 12800;
            quart = amount / 3200;
            amount = amount % 3200;
            pint = amount / 1600;
            amount = amount % 1600;
            cup = amount / 800;
            amount = amount % 800;
            cup3to4 = amount / 600;
            amount = amount % 600;
            cup1to2 = amount / 400;
            amount = amount % 400;
            cup1to4 = amount / 200;
            amount = amount % 200;
            cup1to8 = amount / 100;
            amount = amount % 100;
            tbs = amount / 60;
            amount = amount % 60;
            tsp = amount / 20;
            amount = amount % 20;
            tsp1to2 = amount / 10;
            amount = amount % 10;
            tsp1to4 = amount / 5;
            
            /**
             This series of if then will decide if any of the integers used in the 
             previous conversion process is > 0. If it is it will add it to the array
             then move to the next spot.
            */
            if(gallon > 0)
            {
                measurement = Integer.toString(gallon);
                measurement = measurement + " gallons ";
                unit[count] = measurement;
                count++;
            }
            if(quart > 0)
            {
                measurement = Integer.toString(quart);
                measurement = measurement + " quarts ";
                unit[count] = measurement;
                count++;
            }
            if(pint > 0)
            {
                measurement = Integer.toString(pint);
                measurement = measurement + " pints ";
                unit[count] = measurement;
                count++;
            }
            if(cup > 0)
            {
                measurement = Integer.toString(cup);
                measurement = measurement + " cups ";
                unit[count] = measurement;
                count++;
            }
            if(cup3to4 > 0)
            {
                measurement = Integer.toString(cup3to4);
                measurement = measurement + " 3/4Cups ";
                unit[count] = measurement;
                count++;
            }
            if(cup1to2 > 0)
            {
                measurement = Integer.toString(cup1to2);
                measurement = measurement + " 1/2Cups ";
                unit[count] = measurement;
                count++;
            }
            if(cup1to4 > 0)
            {
                measurement = Integer.toString(cup1to4);
                measurement = measurement + " 1/4Cups ";
                unit[count] = measurement;
                count++;
            }
            if(cup1to8 > 0)
            {
                measurement = Integer.toString(cup1to8);
                measurement = measurement + " 1/8Cups ";
                unit[count] = measurement;
                count++;
            }
            if(tsp > 0)
            {
                measurement = Integer.toString(tsp);
                measurement = measurement + " teaspoons ";
                unit[count] = measurement;
                count++;
            }
            /**
            if(tsp1to2 > 0)
            {
                measurement = Integer.toString(tsp1to2);
                measurement = measurement + " 1/2Teaspoons ";
                unit[count] = measurement;
                count++;
            }
            if(tsp1to4 > 0)
            {
                measurement = Integer.toString(tsp1to4);
                measurement = measurement + " 1/4Teaspoons ";
                unit[count] = measurement;
                count++;
            }
            */
            count = 0;
            
            while(!(empty.equals(unit[count])))//Will add everything in the array
            {                                  //except the "empty" instances to 
                answer = answer + unit[count]; //the String answer.
                count++;
            }
            
        }
        else//Doesnt need conversion
        {
            answer = "Pinch";
        }
        
        return answer;//Returns converted item or not converted.
    }
    
    /**
     This method converts grams into the unitsOfMesure, which are gallons, cups 
     and tbs and so on.
    */
    public static String convertGramsToUnitsOfMessure(double user)
    {        
        //Needs to convert user to ounces first.
        user = MesurementConverter.convertGramsToOunces(user);
        
        //Converts user to a usable integer.
        user = user * 100;
        int ounces = (int)user;
        
        //initialize all needed arguments.
        int amount, gallon, quart, pint, cup, cup3to4, cup1to2, cup1to4;
        int cup1to8, tbs, tsp, tsp1to2, tsp1to4;
        String Ounces, measurement;
        String answer = "";
        
        System.out.println("");
        
        if(ounces > 0)//Needs conversion
        {   
            //One spot for each unit of mesure
            String[] unit = new String[11];
            String empty = "empty";//For array
            int count = 0;//For array
            
            for(count = 0; count < 11; count++)//fills array with empty.
            {
                unit[count] = empty;
            }
            count = 0;
            
            //Actual conversion process. Will set non-used arguments as 0.
            amount = ounces;
            gallon = amount / 12800;
            amount = amount % 12800;
            quart = amount / 3200;
            amount = amount % 3200;
            pint = amount / 1600;
            amount = amount % 1600;
            cup = amount / 800;
            amount = amount % 800;
            cup3to4 = amount / 600;
            amount = amount % 600;
            cup1to2 = amount / 400;
            amount = amount % 400;
            cup1to4 = amount / 200;
            amount = amount % 200;
            cup1to8 = amount / 100;
            amount = amount % 100;
            tbs = amount / 60;
            amount = amount % 60;
            tsp = amount / 20;
            amount = amount % 20;
            tsp1to2 = amount / 10;
            amount = amount % 10;
            tsp1to4 = amount / 5;
            
            /**
             This series of if then will decide if any of the integers used in the 
             previous conversion process is > 0. If it is it will add it to the array
             then move to the next spot.
            */
            if(gallon > 0)
            {
                measurement = Integer.toString(gallon);
                measurement = measurement + " gallons ";
                unit[count] = measurement;
                count++;
            }
            if(quart > 0)
            {
                measurement = Integer.toString(quart);
                measurement = measurement + " quarts ";
                unit[count] = measurement;
                count++;
            }
            if(pint > 0)
            {
                measurement = Integer.toString(pint);
                measurement = measurement + " pints ";
                unit[count] = measurement;
                count++;
            }
            if(cup > 0)
            {
                measurement = Integer.toString(cup);
                measurement = measurement + " cups ";
                unit[count] = measurement;
                count++;
            }
            if(cup3to4 > 0)
            {
                measurement = Integer.toString(cup3to4);
                measurement = measurement + " 3/4Cups ";
                unit[count] = measurement;
                count++;
            }
            if(cup1to2 > 0)
            {
                measurement = Integer.toString(cup1to2);
                measurement = measurement + " 1/2Cups ";
                unit[count] = measurement;
                count++;
            }
            if(cup1to4 > 0)
            {
                measurement = Integer.toString(cup1to4);
                measurement = measurement + " 1/4Cups ";
                unit[count] = measurement;
                count++;
            }
            if(cup1to8 > 0)
            {
                measurement = Integer.toString(cup1to8);
                measurement = measurement + " 1/8Cups ";
                unit[count] = measurement;
                count++;
            }
            if(tbs > 0)
            {
                measurement = Integer.toString(tbs);
                measurement = measurement + " tablespoons ";
                unit[count] = measurement;
                count++;
            }
            if(tsp > 0)
            {
                measurement = Integer.toString(tsp);
                measurement = measurement + " teaspoons ";
                unit[count] = measurement;
                count++;
            }
            if(tsp1to2 > 0)
            {
                measurement = Integer.toString(tsp1to2);
                measurement = measurement + " 1/2Teaspoons ";
                unit[count] = measurement;
                count++;
            }
            if(tsp1to4 > 0)
            {
                measurement = Integer.toString(tsp1to4);
                measurement = measurement + " 1/4Teaspoons ";
                unit[count] = measurement;
                count++;
            }
            count = 0;
            
            while(!(empty.equals(unit[count])))//Will add everything in the array
            {                                  //except the "empty" instances to 
                answer = answer + unit[count]; //the String answer.
                count++;
            }
            
        }
        else//Doesnt need conversion
        {
            answer = "Pinch";
        }
        
        return answer;//Returns converted item or not converted.
    }
    
    /**
     From here on is a lot of the same methods. All of these methods convert either
     grams or ounces to a unit of measure you want.
    */
    
    public static double gallonsToOunces(double user)
    {
        double answer = user * OUNCES_PER_GALLON;
        return answer; 
    }
    
    public static double quartsToOunces(double user)
    {
        double answer = user * OUNCES_PER_QUART;
        return answer; 
    }
    
    public static double pintsToOunces(double user)
    {
        double answer = user * OUNCES_PER_PINT;
        return answer; 
    }
    
    public static double cupsToOunces(double user)
    {
        double answer = user * OUNCES_PER_CUP;
        return answer; 
    }
    
    public static double threeQuarterCupsToOunces(double user)
    {
        double answer = user * OUNCES_PER_THREEQUARTERCUP;
        return answer; 
    }
    
    public static double halfCupsToOunces(double user)
    {
        double answer = user * OUNCES_PER_HALFCUP;
        return answer; 
    }
    
    public static double quarterCupsToOunces(double user)
    {
        double answer = user * OUNCES_PER_QUARTERCUP;
        return answer; 
    }
    
    public static double eigthCupsToOunces(double user)
    {
        double answer = user * OUNCES_PER_EIGTHCUP;
        return answer; 
    }
    
    public static double tablespoonsToOunces(double user)
    {
        double answer = user * OUNCES_PER_TABLESPOON;
        return answer; 
    }
    
    public static double teaspoonsToOunces(double user)
    {
        double answer = user * OUNCES_PER_TEASPOON;
        return answer; 
    }
    
    public static double gallonsToGrams(double user)
    {
        double answer = user * OUNCES_PER_GALLON;
        answer = answer * GRAMS_PER_OUNCE;
        return answer; 
    }
    
    public static double quartsToGrams(double user)
    {
        double answer = user * OUNCES_PER_QUART;
        answer = answer * GRAMS_PER_OUNCE;
        return answer; 
    }
    
    public static double pintsToGrams(double user)
    {
        double answer = user * OUNCES_PER_PINT;
        answer = answer * GRAMS_PER_OUNCE;
        return answer; 
    }
    
    public static double cupsToGrams(double user)
    {
        double answer = user * OUNCES_PER_CUP;
        answer = answer * GRAMS_PER_OUNCE;
        return answer; 
    }
    
    public static double threeQuarterCupsToGrams(double user)
    {
        double answer = user * OUNCES_PER_THREEQUARTERCUP;
        answer = answer * GRAMS_PER_OUNCE;
        return answer; 
    }
    
    public static double halfCupsToGrams(double user)
    {
        double answer = user * OUNCES_PER_HALFCUP;
        answer = answer * GRAMS_PER_OUNCE;
        return answer; 
    }
    
    public static double quarterCupsToGrams(double user)
    {
        double answer = user * OUNCES_PER_QUARTERCUP;
        answer = answer * GRAMS_PER_OUNCE;
        return answer; 
    }
    
    public static double eigthCupsToGrams(double user)
    {
        double answer = user * OUNCES_PER_EIGTHCUP;
        answer = answer * GRAMS_PER_OUNCE;
        return answer; 
    }
    
    public static double tablespoonsToGrams(double user)
    {
        double answer = user * OUNCES_PER_TABLESPOON;
        answer = answer * GRAMS_PER_OUNCE;
        return answer; 
    }
    
    public static double teaspoonsToGrams(double user)
    {
        double answer = user * OUNCES_PER_TEASPOON;
        answer = answer * GRAMS_PER_OUNCE;
        return answer; 
    }
}