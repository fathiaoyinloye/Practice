public class LongestPrefix{
    public static void main(String... args){
        String[] words = {"dsug", "tdsfdfghjk", "dsfg"};
        System.out.print(getLongestCommonPrefix(words));
    }



    public static int findLengthOfShortestWord(String[] words){
        int shortestLength = words[0].length();
        for(String word : words){
            if (shortestLength > word.length() ) shortestLength = word.length();
        }
        return shortestLength;
    }

    public static String getLongestCommonPrefix(String[] words){
        String result = "";
        int shortestLength = findLengthOfShortestWord(words);
        for(int count = 0; count < shortestLength; count++){
            int index = 0;
            int check = 0;
            for(int counter = 0; counter < words.length; counter++){
                if(words[index].charAt(count) == words[counter].charAt(count)){
                  check++;
                
                }
            }
                    if(check == words.length){
                result += words[index].charAt(count);

              index++;
            }
            
        }
        if (result == "") result = "\"\"";

        return result;
    }
}
