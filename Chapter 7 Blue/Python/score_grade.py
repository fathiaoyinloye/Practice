def getGrade(score):
		if(score <= 40):
			grade = 'D';

		elif (score <= 60):
			grade = 'C';

		elif (score <= 80):
			grade = 'C';
	
		elif (score <= 100):
			grade = 'A';

		return grade;


	



scores = [46,98,12,76,55,65,56];
count = 0;
for score in scores:
	grade = getGrade(score);
	print("Student ",count  ," scored ", score , " and grade is ",  grade);
	count += 1

		



