public class GCDOfNumbers{

	public static void main (String... args){

	int[] numbers = {18,36,9};
	
		
System.out.print(gcdOFMultiplesNumbers(numbers));

	
	}

	public static int gcdOFTwoNumbers(int numberOne, int numberTwo){
		int gcd = 0;
		int minimum = numberOne;
		int maximum = numberTwo;
			if(numberTwo < minimum){
				minimum = numberTwo;
				maximum = numberOne;
			}

		for(int count = minimum; count >= 1; count--){
			if(minimum % count == 0 && maximum % count == 0){
				gcd = count;
				break;
			}
		}
	
		return gcd;

	}
	public static int gcdOFMultiplesNumbers(int... numbers){
		int result = gcdOFTwoNumbers(numbers[0], numbers[1]);
		for(int count = 2; count < numbers.length; count++){
			result = gcdOFTwoNumbers(result, numbers[count]);
				

		}


		return result;


	}




}