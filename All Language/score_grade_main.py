from score_grade import *
no_of_student = int(input("Enter the number of student: "))
no_of_subjects = int(input("Enter number of subjects: "))
total_students_scores = collect_no_of_student_space(no_of_student)
count = no_of_subjects
going = no_of_student + 1
index = 1;
counter = 0

for number in range(no_of_student):
	my_list = []
	
	while(count > 0):
		score = int(input(f"Enter Student{index} score: "))
		if (score < 0 or score > 100):
			print("Invalid Input, score can only be between 0 and 100")
		else:
			my_list.append(score)
			count = count - 1
		total_students_scores[number] = my_list
	count = no_of_subjects
	going = going - 1
	index += 1
	print(f"Above is the student{number + 1} scores")
	print()
print()

student_total =calculate_sum_of_scores_for_students(total_students_scores) 
student_averages = calculateAverageOfInnerList(total_students_scores)
position_list = getPosition(student_total)
total_of_subjects = get_total_of_all_subjects(total_students_scores,no_of_subjects,no_of_student)
new_scores_list = new_lists_of_scores_average_and_total(total_students_scores, student_total, student_averages, position_list)
all_subjects_list = get_total_list_of_all_subjects(total_students_scores,no_of_subjects,no_of_student)
highest_list = get_total_highest (all_subjects_list)
lowest_list = get_total_lowest(all_subjects_list)
position_highest_list = getPositionOfHighest(all_subjects_list, highest_list)
position_lowest_list = getPositionOfLowest(all_subjects_list, lowest_list)
average_of_each_subject = calculateAverageOfInnerList(all_subjects_list)
passed_and_failed = get_passed_failed_for_all_subjects(all_subjects_list, average_of_each_subject)
passess_and_failure = get_passess_and_fails(all_subjects_list, average_of_each_subject)
passess = passess_and_failure [0]
failure = passess_and_failure [1]
hardest = get_highest(failure)
index_of_hardest = failure.index(hardest) + 1
easiest = get_highest(passess)
index_of_easiest = passess.index(easiest) + 1
best_student = get_highest(student_total)
worst_student = get_lowest(student_total)
index_of_best = student_total.index(best_student) + 1
index_of_worst = student_total.index(worst_student) + 1
over_all_total_score =calculate_sum_of_scores(total_of_subjects)
over_all_average = calculateAverage(total_of_subjects)



over_all_highest = get_highest(highest_list)
subject_of_highest = 1 + highest_list.index(over_all_highest)
over_all_lowest = get_lowest(lowest_list)
subject_of_lowest = 1 + lowest_list.index(over_all_lowest)
print(print_output_one(no_of_subjects, new_scores_list))
print(print_summary(no_of_subjects,highest_list, lowest_list, position_highest_list,position_lowest_list,total_of_subjects , average_of_each_subject,passed_and_failed))
print(print_last_summary(subject_of_highest,over_all_highest, all_subjects_list, subject_of_lowest, over_all_lowest,index_of_hardest,hardest,index_of_easiest,easiest,index_of_best,best_student,index_of_worst,worst_student,over_all_total_score,over_all_average))
