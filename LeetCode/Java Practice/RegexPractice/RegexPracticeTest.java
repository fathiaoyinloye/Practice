package RegexPractice;

import org.junit.jupiter.api.Test;

import static RegexPractice.RegexPractice.isValidMail;
import static RegexPractice.RegexPractice.isValidPhoneNumber;
import static org.junit.jupiter.api.Assertions.*;

class RegexPracticeTest {

    @Test
    void testThat_07048254250_IsAValidNumber(){
        String phonNumber = "07048254250";
        assertTrue(isValidPhoneNumber(phonNumber));
    }

    @Test
    void testThat_08048254250_IsAValidNumber(){
        String phonNumber = "08048254250";
        assertTrue(isValidPhoneNumber(phonNumber));
    }

    @Test
    void testThat_234_812435678_IsAValidNumber(){
        String phonNumber = "+234-8912435678";
        assertTrue(isValidPhoneNumber(phonNumber));
    }
    @Test
    void testThatSemicolonMail_IsAValidGMail(){
        String email = "o.oladeji@semicolon.africa";
        assertTrue(isValidMail(email));
    }


    @Test
    void testThat_2_IsAValidMail(){
        String email = "fathiaoyinloye21@gmail.com";
        assertTrue(isValidMail(email));
    }

    @Test
    void testThaSemicolonMailTwoIsAValidGMail(){
        String email = "-----------*@gmail.com";
        assertFalse(isValidMail(email));
    }

}