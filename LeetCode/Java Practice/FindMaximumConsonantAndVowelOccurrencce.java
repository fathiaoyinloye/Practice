public class FindMaximumConsonantAndVowelOccurrencce {
    public static int maxFreqSum(String s) {
        String uniqueLetter = "" + s.charAt(0);
        for (int index = 1; index < s.length(); index++){
                            int check = 0;

            for(int counter = 0; counter < uniqueLetter.length(); counter++){
                if (s.charAt(index) == uniqueLetter.charAt(counter)) check++;
            }
            if (check == 0 ) uniqueLetter += s.charAt (index);     
        }

        int[] uniqueLetterCount = new int[uniqueLetter.length()];
        for(int counter = 0; counter < uniqueLetterCount.length; counter++){
         for(int count = 0; count < s.length(); count ++){
            if(s.charAt(count) == uniqueLetter.charAt(counter)) uniqueLetterCount[counter] += 1;

         }

        }


        String vowels = "aeiou";
        String checkLetter = "";
        for(int count = 0; count < uniqueLetter.length(); count++){
            int check = 0;
            for (int counter = 0; counter < vowels.length(); counter++){
                    if(uniqueLetter.charAt(count) == vowels.charAt(counter)) {check++;break;}
            }
            if(check == 0) checkLetter += "c";
            else checkLetter += "v";
        }

        int highestVowel =  0;
        int highestConsonat = 0;
        for(int count = 0; count < uniqueLetter.length(); count++){
            if(checkLetter.charAt(count) == 'c' && highestConsonat < uniqueLetterCount[count] )highestConsonat = uniqueLetterCount[count];
             if(checkLetter.charAt(count) == 'v' && highestVowel < uniqueLetterCount[count] )highestVowel = uniqueLetterCount[count];
        }
        return highestVowel  + highestConsonat;
       
    }
    
    
    public static void main(String... args){
    	System.out.println(maxFreqSum("fathia"));
    }
    

}
