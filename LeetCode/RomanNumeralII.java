public class RomanNumeralII {
   /* Only I, X, and C can be used as the subtractive letter.
    I (1) can only precede V (5) and X (10).
    X (10) can only precede L (50) and C (100).
    C (100) can only precede D (500) and M (1000).
    if (temp == 'I' && romanNumeralCheck == 'V' ||temp == 'I' && romanNumeralCheck == 'X')
    else  if (temp == 'X' && romanNumeralCheck == 'L' ||temp == 'X' && romanNumeralCheck == 'C')
    else     if (temp == 'C' && romanNumeralCheck == 'D' ||temp == 'C' && romanNumeralCheck == 'M')
     if (s.length() < 3 && numberToCheck > temp) number -= temp + temp;
     2425
    */


    public static void main(String[] args) {
        System.out.println(romanToInt("MMCCCXCIX"));
    }


    public static int romanToInt(String s) {
        char[] romanNumeral = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] numbers = {1, 5, 10, 50, 100, 500, 1000};
        int number = 0;
        char romanNumeralCheck = ' ';
        char temp = ' ';
        int index = 0;
        for (int count = 0; count < s.length(); count++) {
            for (int counter = 0; counter < romanNumeral.length; counter++)
             if (s.charAt(count) == romanNumeral[counter]) {
                number += numbers[counter];
                romanNumeralCheck = romanNumeral[counter];
                if (temp == 'I' && romanNumeralCheck == 'V' ||temp == 'I' && romanNumeralCheck == 'X')number -= numbers[index] + numbers[index];
                    else  if (temp == 'X' && romanNumeralCheck == 'L' ||temp == 'X' && romanNumeralCheck == 'C') number -= numbers[index] + numbers[index];
                    else if (temp == 'C' && romanNumeralCheck == 'D' ||temp == 'C' && romanNumeralCheck == 'M') number -= numbers[index] + numbers[index];
                    temp = romanNumeral[counter];
                    index = counter;
                    System.out.println(number);

                break;
            }

    }

        return number;
}
}