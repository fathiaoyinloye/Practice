def findLowest(numbers):
	lowest = numbers[0]
	for number in numbers:
		if number < lowest:
			lowest = number
	return lowest
	
def findFactors(numbers):
	divisible = []
	lowest = findLowest(numbers)
	for index in range(2, lowest):
		check = 0;
		for number in numbers:
			if(number % index == 0):
				check+=1;
		if check == len(numbers):
			divisible.append(index)
	return divisible;
	
print("123")
print(findLowest([6,18,12]))
print(findFactors([6,18,12]))
