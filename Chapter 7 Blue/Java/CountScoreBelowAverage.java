public class CountScoreBelowAverage{

	public static void main (String... args){

		int [] scores = {46,98,12,76,55,65,56};
			int belowAverage = 0;
		for(int count = 0; count < scores.length; count++){
			int average = getAverage(scores);
			if (scores[count] < average)
				belowAverage += 1;
	
		}
		System.out.print(belowAverage);

	}
	

	public static int getSum(int[] scores){
		int total = 0;
		for(int count = 0; count < scores.length; count++){
			total+= scores[count];
		}

		return total;		

	}

	public static int getAverage(int[] scores){
		int total = getSum(scores);
		int average = total / scores.length;

		return average;		

	}


}