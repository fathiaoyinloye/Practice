package RegexPractice;

public class CapitalizeEachWord {
    public static StringBuilder capitalizeWords(String words){
        StringBuilder result = new StringBuilder();
        result.append(Character.toUpperCase(words.charAt(0)));
        for(int index = 1; index < words.length(); index++){
            if(words.charAt(index) ==' '){
                result.append(words.charAt(index));
                result.append(Character.toUpperCase(words.charAt(index + 1)));
                index += 1;
            }
            else  result.append(words.charAt(index));


        }
        return result;
    }
    public static void main (String... args){
        System.out.println(capitalizeWords("this is a tree"));
    }
}
