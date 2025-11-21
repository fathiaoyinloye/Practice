import unittest
from my_functions import *

class TestMyFunctions(unittest.TestCase):
	def test_that_element_is_palindrome_will_return_a_list(self):
		my_element = ["fathia", "madam", "12321"]
		result = element_is_palindrome(my_element)
		actual = type(result)
		self.assertEqual(actual,list)


	def test_that_element_that_are_not_palindrome_will_return_false(self):
		my_element = ["fathia", "madam", "12321"]
		result = element_is_palindrome(my_element)
		actual = result[0]
		self.assertEqual(actual,False)


	def test_that_element_that_are_palindrome_will_return_true(self):
		my_element = ["fathia", "madam", "12321"]
		result = element_is_palindrome(my_element)
		actual = result[1]
		self.assertEqual(actual,True)