public class EddyTask{
	public static void divisible(){
	int total = 0;
		for(int count = 77; count >= 7; total += count, count-=3){
			System.out.println(count);
			if(count == 8) System.out.println("The total is: " + total);

		}
	}
	public static void main (String... args){
	  divisible();
	}

}
