import java.util.Arrays;
import java.util.ArrayList;
public class CountNumberOcurrence{

	public static void main (String... args){
	int [] array = {100, 45,100, 67,23,45,45,5};
	int [] array2 = array;

		ArrayList <Integer> y = new ArrayList <Integer>();
	 	y = getDistinctNumber(array);
	
	System.out.println(y);
	System.out.print(Arrays.toString(array));

	}



	public static ArrayList <Integer> getDistinctNumber(int[] newNumbers){
		ArrayList <Integer> distinctNumbers = new ArrayList <Integer>();
		int[] numbers = newNumbers;
		numbers = distinctNumberNotSorted(numbers);
		
		for(int count = 0; count < numbers.length; count++){
			if(numbers[count] != 0)
				distinctNumbers.add(numbers[count]);
		
		}
		return distinctNumbers;


	}



	public static int[] distinctNumberNotSorted (int[] newNumber){
		int [] numbers = newNumber;
		for(int count = 0; count < numbers.length; count++){

			for(int counter = count + 1; counter < numbers.length; counter++){
				if(numbers[count] == numbers[counter])
					numbers[counter] = 0;
					
				

			}

		}
			return numbers;

	}
	public static	int[] getOccurrenceCount (int[] numbers){
		ArrayList <Integer> distinctNumbers = new ArrayList <Integer>();
		distinctNumbers = getDistinctNumber(numbers);
		System.out.print(Arrays.toString(numbers));
		int[] countOccurrence = new int[distinctNumbers.size()];
		for (int count = 0; count < distinctNumbers.size(); count++){
			for(int counter = 0; counter < numbers.length; counter++){
				if(distinctNumbers.get(count) == numbers[counter])
					countOccurrence[count] += 1;
			}
		}
		return countOccurrence;
	}

}