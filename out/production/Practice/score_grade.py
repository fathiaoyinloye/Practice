
def collect_no_of_student_space(number_of_student):
	student_space = []
	for number in range(number_of_student):
		student_space.append(0)
	return student_space

	
def calculate_sum_of_scores(scores):
	total = 0
	for num in scores:
		total += num
	return total

def calculate_sum_of_scores_for_students(scores_of_students):
	total_of_all_student = []
	for scores in scores_of_students:
		sum_inner_list = calculate_sum_of_scores(scores)
		total_of_all_student.append(sum_inner_list)
	return total_of_all_student


def calculateAverage(scores):
	total = calculate_sum_of_scores(scores)
	average_string = f"{total/len(scores): .2f}"
	average = float(average_string )
	
	return average

def calculateAverageOfInnerList(scores_of_students):
	average_of_all_student = []
	for scores in scores_of_students:
		sum_inner_list = calculateAverage(scores)
		average_of_all_student.append(sum_inner_list)
	return average_of_all_student




def print_output_one (subjects, my_list):
	print("Student", end = "	")
	for sub in range (1,subjects + 4):
		if sub <= subjects:
			print(f"sub{sub}", end = "	")
		elif sub == subjects + 1:
			print("Total", end = "	")
		elif sub == subjects + 2:
			print("Average", end = "	")
		else:
			print("Position", end = "	")



	print()
	count = 1
	for numbers in my_list:
		print(f"Student{count}", end = "  ")
		for number in numbers:
			print(number, end="	")

		print()
		count += 1
	return ""


def new_lists_of_scores_average_and_total(my_scores, total, average,positions):
	my_new_list = my_scores
	count = 0
	for scores in my_new_list:
		scores.append(total[count])
		scores.append(average[count])
		scores.append(positions[count])
		count += 1
	
	return my_new_list

def getPosition(my_list):
	position_list = sorted(my_list, reverse = True)
	new_list = []
	for number in my_list:
		new_list.append(position_list.index(number) + 1)
	return new_list

def get_total_of_a_subject(my_list,count,no_of_student):
	total = 0
	for number in range(no_of_student):
		total += my_list[number][count]
	return total

def  get_total_of_all_subjects(my_list,subjects,students):
	sum_of_same_index = []
	count = 0
	for numbers in range (subjects):
		total = get_total_of_a_subject(my_list,count,students) 
		sum_of_same_index.append(total)
		count += 1
	return sum_of_same_index



def get_list_of_a_subject(my_list,count,no_of_student):
	new_list_subjects = []
	for number in range(no_of_student):
		 new_list_subjects.append(my_list[number][count])
	return new_list_subjects


def  get_total_list_of_all_subjects(my_list,subjects,students):
	total_list_of_subjects = []
	for numbers in range (subjects):
		list_of_subjects = get_list_of_a_subject(my_list,numbers,students) 
		total_list_of_subjects.append(list_of_subjects )
	return total_list_of_subjects



def get_highest(my_list):
	highest = my_list[0]
	for number in my_list:
		if number > highest:
			highest = number
	return highest



def get_lowest(my_list):
	lowest = my_list[0]
	for number in my_list:
		if number < lowest:
			lowest = number
	return lowest


def get_total_highest(my_list):
	new_list = []
	for numbers in my_list:
		new_list.append(get_highest(numbers))
	return new_list

def get_total_lowest(my_list):
	new_list = []
	for numbers in my_list:
		new_list.append(get_lowest(numbers))
	return new_list

def getPositionOfHighest(total_list, highest_list):
	new_list = []
	count = 0
	for numbers in total_list:
		new_list.append(numbers.index(highest_list[count]) + 1)
		count += 1

	return new_list

def getPositionOfLowest(total_list, lowest_list):
	new_list = []
	count = 0
	for numbers in total_list:
		new_list.append(numbers.index(lowest_list[count]) + 1)
		count += 1

	return new_list


def print_summary(subjects,highest, lowest, position_of_highest, position_of_lowest,total, average, get_passed_and_failed):
	for number in range (0, subjects):
		print(f"Subject{number + 1}")
		print("Highest scoring student is: Student",position_of_highest[number], "scoring: ", highest[number])
		print("Lowest scoring student is: Student",position_of_lowest[number], "scoring: ", lowest[number])
		print("Total score is: ",total[number]) 
		print("Average score is: ", average[number])
		print("Number of passed: ",get_passed_and_failed[number][0])
		print("Number of failed: ",get_passed_and_failed[number][1])
		print()
		print("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
	return ""


def get_passed_and_failed(my_list, average):
	passed = 0
	failed = 0
	for number in my_list:
		if number > average:
			passed += 1
		else:
			failed += 1
	return (passed, failed)

def get_passed_failed_for_all_subjects(my_list, my_list_of_average):
	my_pass_and_fail_list = []
	count = 0
	for number in my_list:
		my_pass_and_fail_list.append(get_passed_and_failed(number, my_list_of_average[count]))
		count += 1
	return my_pass_and_fail_list



def get_student_of_highest(my_list, highest):
	for numbers in my_list:
		for number in numbers:
			if number == highest:
				return numbers.index(number) + 1



def print_last_summary(subject_of_highest,highest,my_list,subject_of_lowest,lowest, index_of_fail, failure,index_of_easiest, easiest,index_of_best, best_graduate,index_of_worst,worst_graduate,total_score,average ):
	result = f"""
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

The hardest Subject is Subject{index_of_fail} with {failure} failures
The easiest Subject is Subject{index_of_easiest} with {easiest} easiest
The overall Highest score is by Student {get_student_of_highest(my_list, highest)} " in subject",{subject_of_highest}, "scoring", {highest}
The overall Lowest score is by Student {get_student_of_highest(my_list, lowest)} in subject{subject_of_lowest} scoring {lowest}
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


CLASS SUMMARY
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
Best Graduating student is: Student{index_of_best} scoring {best_graduate}

<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
Worst Graduating student is: Student{index_of_worst} scoring {worst_graduate}
!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
Class Total Score is {total_score}
Class Average is {average}

<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	"""
	
	return result

def get_passess_and_fails(my_list, my_list_of_average):
	student_pass = []
	student_fail = []
	count = 0
	for number in my_list:
		result = get_passed_and_failed(number, my_list_of_average[count])
		student_pass.append(result[0])
		student_fail.append(result[1])
		count += 1
	return student_pass,student_fail


	




