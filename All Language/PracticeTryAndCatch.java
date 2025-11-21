import java.util.Scanner;
import java.util.Random;
public class PracticeTryAndCatch{
	public static void main (String... args){
	
		Scanner scanner = new Scanner(System.in);
		
		for(int x = 0; x < 10; x++){
			try{
				System.out.print("Enter a number: ");
				int number = scanner.nextInt();
			}
			catch(Exception y){
			System.out.println("Incorrect Input");
			continue;
			}
		}
	
		



	}
}
