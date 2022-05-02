
/*
To compile, first right click on the filename and choose "Open in Terminal":
to compile:
javac Filename.java
to run:
java Filename
*/
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class Yahtzee 
{
    
    public static int getUpperScore(int[] diceValues, int category)
    {
        int count = 0;
        for(int i = 0; i < diceValues.length; i++)
        {
            if(diceValues[i] == category)
            {
                count ++;
            }
        }
        return count*category;
    }
    
    public static int total(int[] diceValues)
    {
        int count = 0;
        for(int i = 0; i < diceValues.length; i++)
        {
            count += diceValues[i];
        }
        return count;
    }

    public static int getThreeOfAKindScore(int[] diceValues)
    {
        int counter = 0;
        int pointCount = 0;
        for(int i = 0; i< 5; i++)
        {
            counter = 0;
            for(int j = 0; j<5; j++)
            {
                if(diceValues[i]== diceValues[j])
                {
                    counter++;
                }
                if(counter == 3)
                {
                    pointCount = total(diceValues);
                    return pointCount;
                }
            }
        }
        return 0;
    }

    public static int getFourOfAKindScore(int[] diceValues)
    {

        int counter = 0;
        int pointCount = 0;
        for(int i = 0; i< 5; i++)
        {
            counter = 0;
            for(int j = 0; j<5; j++)
            {
                if(diceValues[i]== diceValues[j])
                {
                    counter++;
                }
                if(counter == 4)
                {
                    pointCount = total(diceValues);
                    return pointCount;
                }
            }
        }
        return 0;
    }
    public static int getFullHouseScore(int[] diceValues)
    {
        int sum = 0;
        Arrays.sort(diceValues);
        if ((((diceValues[0] == diceValues[1]) && (diceValues[1] == diceValues[2])) && (diceValues[3] == diceValues[4]) &&(diceValues[2] != diceValues[3]) || ((diceValues[0] == diceValues[1]) && ((diceValues[2] == diceValues[3]) && (diceValues[3] == diceValues[4])) && (diceValues[1] != diceValues[2])))){
            sum = 25;
        }
        return sum;
    }
    public static int getYahtzeeScore(int[] diceValues)
    {
        int baseNum = diceValues[0];
        for(int i = 0; i < 5; i++)
        {
            if(baseNum != diceValues[i])
            {
                return 0;
            }
        }
        return 50;
    }

    public static int getSmallStraightScore(int[] diceValues)
    {
        // Loops through to see if there is a one and if there is it will see if there is a "1,2,3,4"
        for(int i = 0; i <5; i++)
        {
            if(diceValues[i]== 1)
            {
                for(int j = 0; j <5; j++)
                {
                    if(diceValues[j] == 2)
                    {
                        for(int k = 0; k <5; k++)
                        {
                            if(diceValues[k] == 3)
                            {
                                for(int l = 0; l <5; l++)
                                {
                                    if(diceValues[l] == 4)
                                    {
                                        return 30;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        // Loops through to see if there is a one and if there is it will see if there is a "2,3,4,5"
        for(int i = 0; i <5; i++)
        {
            if(diceValues[i]== 2)
            {
                for(int j = 0; j <5; j++)
                {
                    if(diceValues[j] == 3)
                    {
                        for(int k = 0; k <5; k++)
                        {
                            if(diceValues[k] == 4)
                            {
                                for(int l = 0; l <5; l++)
                                {
                                    if(diceValues[l] == 5)
                                    {
                                        return 30;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        // Loops through to see if there is a one and if there is it will see if there is a "3,4,5,6"
        for(int i = 0; i <5; i++)
        {
            if(diceValues[i]== 3)
            {
                for(int j = 0; j <5; j++)
                {
                    if(diceValues[j] == 4)
                    {
                        for(int k = 0; k <5; k++)
                        {
                            if(diceValues[k] == 5)
                            {
                                for(int l = 0; l <5; l++)
                                {
                                    if(diceValues[l] == 6)
                                    {
                                        return 30;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }
    public static int getLargeStraightScore(int[] diceValues)
    {
        // Loops through to see if there is a one and if there is it will see if there is a "1,2,3,4,5"
        for(int i = 0; i <5; i++)
        {
            if(diceValues[i]== 1)
            {
                for(int j = 0; j <5; j++)
                {
                    if(diceValues[j] == 2)
                    {
                        for(int k = 0; k <5; k++)
                        {
                            if(diceValues[k] == 3)
                            {
                                for(int l = 0; l <5; l++)
                                {
                                    if(diceValues[l] == 4)
                                    {
                                        for(int m = 0; m <5; m++)
                                        {
                                            if(diceValues[m] == 5)
                                            {
                                                return 40;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        // Loops through to see if there is a one and if there is it will see if there is a "2,3,4,5,6"
        for(int i = 0; i <5; i++)
        {
            if(diceValues[i]== 2)
            {
                for(int j = 0; j <5; j++)
                {
                    if(diceValues[j] == 3)
                    {
                        for(int k = 0; k <5; k++)
                        {
                            if(diceValues[k] == 4)
                            {
                                for(int l = 0; l <5; l++)
                                {
                                    if(diceValues[l] == 5)
                                    {
                                        for(int m = 0; m <5; m++)
                                        {
                                            if(diceValues[m] == 6)
                                            {
                                                return 40;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args)
    {
        int[] diceValues = {1, 2, 3, 4, 5};
        System.out.println(getLargeStraightScore(diceValues));


    }
}