import java.util.Arrays;
import java.util.ArrayList;

public class DistinctNumbers{

	public static void main(String... args){

		int[] numbers = {1,2,3,2,1,6,3,5,2,4};
		int[] newNumbers = numbers;
			for(int count = 0; count < numbers.length; count++){
				for(int counter = count + 1; counter< numbers.length; counter++){
					if(numbers[count] == numbers[counter])
						newNumbers[counter] = 0;
						
					
				}
				

			}
		ArrayList <Integer>  distinctNumbers = new ArrayList <Integer>();

			for (int count = 0; count< numbers.length; count++){

				if(newNumbers[count] != 0)
					distinctNumbers.add(numbers[count]);

			}
		
			System.out.print(distinctNumbers);

	}

	

}