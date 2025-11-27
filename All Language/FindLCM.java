public class FindLCM{
	public static void main (String... args){
		int[] numbers = {2,9,5,6,6};
	try{
		
		System.out.println(findLCMOfMoreThanTwoNumbers(numbers));
	}
		
	catch(Exception exception){
		System.out.println("None of the numbers can be lesser than one");

		}


	}





	public static int findGCDOfTwoNumbers(int numberOne, int numberTwo){
		int gcd = 0;
		int minimum = numberOne;
		if(numberTwo < minimum)	minimum = numberTwo;


		for(int count = minimum;  count >= 1; count--){
			if( numberTwo % count == 0 && numberOne % count == 0 ){
				gcd = count;
				break;
			}

		}
		return gcd;

	}
	
	public static int findGCDForMoreThanTwoNumbers(int[] numbers){

		int gcd = findGCDOfTwoNumbers(numbers[0], numbers[1]);
		for(int index = 2; index < numbers.length;  index++){
			gcd = findGCDOfTwoNumbers(gcd, numbers[index]);
		
		}

		return gcd;

	}
	public static int findLCMOfTwoNumbers(int numberOne, int numberTwo){
		int multiples = numberOne * numberTwo;
		int lcm = multiples/findGCDOfTwoNumbers(numberOne, numberTwo);
		return lcm;
	}
	
	public static int findLCMOfMoreThanTwoNumbers(int[] numbers){
		
		for(int number : numbers) if (number < 1) throw new IllegalArgumentException("Number cannot be lower than 1");
		int lcm = findLCMOfTwoNumbers(numbers[0], numbers[1]);
		for(int index = 2; index < numbers.length;  index++){
			lcm = findLCMOfTwoNumbers(lcm, numbers[index]);
		
		}

		return lcm;


	}


}