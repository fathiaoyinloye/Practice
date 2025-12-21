public class BeautifyString{
	public static String addFullStop(String sentence){
	  String newSentence;
		if (sentence.charAt(sentence.length() -1) != '.'){
		  newSentence = sentence.substring(0,sentence.length() -2) + ".";
		  return sentence + ".";
		}
		return sentence;
	}
	
	
	public static String capitalLetter(String sentence){
		  String newSentence;
		if (Character.isLowerCase(sentence.charAt(0))){
		    String firstCharacter = sentence.substring(0, 1); 
				newSentence = firstCharacter.toUpperCase() + sentence.substring(1,sentence.length());
				return newSentence;
			}
		return sentence;
	}
	
	public static String goodSentence(String sentence){
	  String newString = addFullStop(sentence);
	  String betterString = capitalLetter(newString);
	  return betterString;
	
	}
	public static void main (String... args){
	  String sentence = "i am a girl.";
	  System.out.println(goodSentence(sentence));
	}

}
