public class RandomNumberExcludingNumber{

	public static void main (String... args){


	int[] numbers = {2,6,8,5,3,45,51,52,34,54,32,21,53};

	int randomNumber = getRandomExceptNumbers(numbers);
	System.out.print(randomNumber);

	
}
	

	public static int getRandomExceptNumber (int number){
		int randomNumber = (int)(Math.random() * 53) + 1;
		if(randomNumber < number)
			randomNumber = randomNumber;
		else
			randomNumber = randomNumber + 1;

		return randomNumber;
	
	}

	public static int getRandomExceptNumbers (int number[]){
		int random = (int)(Math.random() * 54) + 1;



		for(int count = 0; count < number.length; count++){
			if (random != number[count])
				return random ;
			else{
				while(random == number[count]){
					random =(int)(Math.random() * 54) + 1;
					
				}
			
				

			}

		}
		return random;


	}


}