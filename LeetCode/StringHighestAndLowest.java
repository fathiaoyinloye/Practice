import java.util.Arrays;
public class StringHighestAndLowest{
	public String findHighestAndLowest(String myStringOfNumbers){
		String[] myArray = myStringOfNumbers.split(" ");
		
		int[] numbers = new int[myArray.length];
		for(int count = 0; count < myArray.length; count++){
			numbers[count] = Integer.parseInt(myArray[count]);

		}
		int highest = 0;
		int lowest = numbers[0];
		for(int number : numbers){
			if (number > highest) highest = number;
			if (number < lowest) lowest = number;


		}
		String newString = highest + " " + lowest;
		return newString;

	}




	public int countPresentSheep(boolean [] myArray){
		int count = 0;
		for(boolean isPresent: myArray) if (isPresent == true) count++;


		return count;


	}


	public int[] createArrayOfIntegers(int number){
		int[] myArray = new int[number];
			for(int count = 0; count < myArray.length; count++){
				myArray[count] = number;
				number--;
			}
		return myArray;	

	}

	public String changeToNumbers(int[] numbers){
		String[] myArray = new String[numbers.length];
		for(int count = 0; count < numbers.length; count++){
			myArray[count] = String.valueOf(numbers[count]);
		}

		String phoneNumber = "(";
			int count = 0;
			for(String digit : myArray){
				phoneNumber += digit;
				if(count == 2) phoneNumber +=  ") ";
				if(count == 5) phoneNumber +=  "-";

				count++;

			}
		return phoneNumber;

	}



	public static void main (String... args){
		String myString = "1 2 3 4";
		boolean[] sheeps = {true, false, true};
		int[] numbers = {1,2,3,4,2,2,3,2,3,1};
		StringHighestAndLowest n = new StringHighestAndLowest();
		System.out.println(n.findHighestAndLowest(myString));
		System.out.println(n.countPresentSheep(sheeps));
		System.out.println(Arrays.toString(n.createArrayOfIntegers(6)));
		System.out.println(n.changeToNumbers(numbers));

	}
	
	
		




}