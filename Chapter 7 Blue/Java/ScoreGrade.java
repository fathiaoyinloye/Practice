public class ScoreGrade{

	public static void main (String... args){

	int [] scores = {46,98,12,76,55,65,56};
	for(int count = 0; count < scores.length; count++){
		char grade = getGrade(scores[count]);
		

		System.out.println("Student " + count  + " scored " + scores[count] + " and grade is " + grade);
	}
		

	}
public static char getGrade(int score){
		char grade = 'A';

		if(score <= 40)
			grade = 'D';

		else if (score <= 60)
			grade = 'C';

		else if (score <= 80)
			grade = 'C';
	
		else if (score <= 100)
			grade = 'A';

		return grade;

	}
	


}