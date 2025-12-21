package tests;


import Revisions.DiceRolling;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;
import static org.testng.AssertJUnit.assertTrue;

public class DiceRollingTest {
    @Test
    public void testThatRandomNumberBetween1_6_CanBeGenerated(){
        int actual = DiceRolling.getRandomNumber();
        assertTrue(actual > 0 && actual < 7);
    }

    @Test
    public void testThatRandomNumberBetween1_6_CanBeGeneratedAndSumedUp(){
        int actual = DiceRolling.getSumOfTwoRandomNumber();
        assertTrue(actual > 1 && actual < 13);
    }
    @Test
    public void playPlayTest(){
        DiceRolling.printDiceRolled();

    }
}
