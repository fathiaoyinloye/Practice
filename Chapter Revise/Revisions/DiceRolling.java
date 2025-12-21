package Revisions;

import java.util.Random;

public class DiceRolling{
    public static int getRandomNumber(){
        Random random = new Random();
        return random.nextInt(1, 7);
    }
    public static int getSumOfTwoRandomNumber(){

        int numberOne = getRandomNumber();
        int numberTwo = getRandomNumber();
        return numberOne + numberTwo;
    }

    public static int[] getfrequencyOfOccurrence(){
        int[] possibleOutcome = {2,3,4,5,6,7,8,9,10,11,12};
        int[] outcome = new int[11];

        for(int count = 0; count < 100; count++){
            int sum =getSumOfTwoRandomNumber();
            for(int counter = 0; counter < possibleOutcome.length; counter++ ){
                if(sum == possibleOutcome[counter]) outcome[counter] += 1;
            }
        }
        return outcome;
    }
public static void printDiceRolled(){
    int[] possibleOutcome = {2,3,4,5,6,7,8,9,10,11,12};
    int[] outcome = getfrequencyOfOccurrence();
        System.out.printf("%-7s%-14s%n", "Rolled Dice", "Occurrence");
       for(int count = 0; count < 11; count++){
           System.out.printf("%-7d%-14d%n", possibleOutcome[count], outcome[count]);
       }
}

}