import java.util.Arrays;
public class SeperateDigit{
  public static void main (String... args){
    System.out.println(Arrays.toString(searateDigit(3457)));
  }  

    public static int getNumberOfDigit(int number){
       String numberInString = String.valueOf(number);
       int numberOfDigit = numberInString.length();
       return numberOfDigit;
    }
    
    
    public static int [] searateDigit(int number){
    int numberOfDigit = getNumberOfDigit(number);
     int[] sepearatedDigit =  new int[numberOfDigit];
      for(int count = numberOfDigit - 1; number > 0; count--){
        sepearatedDigit[count] = number % 10;
        number /= 10;
   
      }  
      return sepearatedDigit;
   }
   
}
