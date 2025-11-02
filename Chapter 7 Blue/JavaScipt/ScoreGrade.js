function getGrade(score){
		let grade = 'A';

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
	



let scores = [46,98,12,76,55,65,56];
	for(let count = 0; count < scores.length; count++){
		let grade = getGrade(scores[count]);
		

		console.log("Student " + count  + " scored " + scores[count] + " and grade is " + grade);
	}
		



