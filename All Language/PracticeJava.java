import java.util.Scanner;
import java.util.Random;
public class PracticeJava{
	public static void main (String... args){
	Random random = new Random();


int[] count = {0,0,0,0,0,0,0,0,0,0};	
	for(int i = 0; i < 100; i++){
		int generatedRandom = random.nextInt(0,10);
		switch (generatedRandom){
			case 0 -> count[0] += 1;
			case 1 -> count[1] += 1;
			case 2 -> count[2] += 1;
			case 3 -> count[3] += 1;
			case 4 -> count[4] += 1;
			case 5 -> count[5] += 1;
			case 6 -> count[6] += 1;
			case 7 -> count[7] += 1;
			case 8 -> count[8] += 1;
			case 9 -> count[9] += 1;


		}
	


	}

	for(int index = 0; index < count.length; index++){

		//System.out.println(index + " occured: " + count[index]);

	}
		Scanner scanner = new Scanner(System.in);
		
		try{
			
			System.out.print("Enter a number: ");
			int number = scanner.nextInt();
		}

		catch(Exception input){
			System.out.println("Incorrect Input");


		}
	}

}
// chars[i] = RandomCharacter.getRandomLowerCaseLetter();
