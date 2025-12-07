class Solution {
   public static void main (String[] args) {
        System.out.println(romanToInt("MMCDXXV"));
    }
    public static int romanToInt(String s) {
        char[] romanNumeral = {'I','V','X','L','C','D','M'};
        int[] numbers = {1,5,10,50,100,500,1000};
        int number = 0;
        int numberToCheck = 0;
        int temp = 0;
        int checkers = 0;
        for(int count = 0; count < s.length(); count++){
            for(int counter = 0; counter < romanNumeral.length; counter ++)
                if(s.charAt(count) == romanNumeral[counter]){
                    number += numbers[counter];
                    numberToCheck = numbers[counter];
                    if(s.length() < 3 && numberToCheck > temp) number -= temp +  temp;

                    else if(numberToCheck > temp && checkers == 2){
                        number -= temp + temp;
                        //checkers = 0;
                    }
                    temp = numbers[counter];

                    break;
                }
            if (checkers == 2) checkers = 0;
            checkers += 1;
System.out.println(number);
        }

        return number;
    }
}