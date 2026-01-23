import java.util.ArrayList;
import java.util.Arrays;
public class Factors{
  public static int findLowest(int[] numbers){
    int lowest = numbers[0];
    for(int number: numbers){
        if(number < lowest) lowest = number;
    }
    return lowest;
  }
    public static int[] covertArray(int []numbers, int number){
      for(int count = 0; count < numbers.length; count++){
        numbers[count] = numbers[count] / number;
      }
      return numbers;
   }

	public static ArrayList<Integer> findFactorOfTwoNumbers(int[] numbers){
	  ArrayList<Integer> divisible = new ArrayList<>();
		int lowest = findLowest(numbers);
		for(int count = 2; count <=lowest; count++){
		  int check = 0;
		  for(int counter = 0; counter < numbers.length; counter++){
		  		    		  //System.out.println(count);
		    if(numbers[counter] % count == 0){check++;}
		    		
		  }
		  if(check == numbers.length) {
		  divisible.add(count); 
		  numbers = covertArray(numbers, count); 
		  count = 1; 
		  lowest = findLowest(numbers);
		  }
		}
	  return divisible;
	}
	public static void main (String... args){
	int[] numbers = {14,7,28};
	System.out.println(findFactorOfTwoNumbers(numbers));
	}
}
