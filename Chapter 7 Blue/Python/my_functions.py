def element_is_palindrome(my_element):
	new_element= my_element
	count = 0
	for elements in my_element:
		palindrome = ""
		for element in elements:
			palindrome = element + palindrome

		if elements == palindrome:
			new_element[count] = True;
		else:
			new_element[count] = False;
		count+=1
	return new_element
	



	

