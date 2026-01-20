
"""
Input: x = 2, y = 7, z = 4

Output: 1

Explanation:

Person 1 is at position 2 and can reach Person 3 (at position 4) in 2 steps.
Person 2 is at position 7 and can reach Person 3 in 3 steps.
Since Person 1 reaches Person 3 first, the output is 1.

Example 2:

Input: x = 2, y = 5, z = 6

Output: 2

Explanation:

Person 1 is at position 2 and can reach Person 3 (at position 6) in 4 steps.
Person 2 is at position 5 and can reach Person 3 in 1 step.
Since Person 2 reaches Person 3 first, the output is 2.
"""

def findClosest(x, y, z):
    checkX = 0;
	checkY = 0;
    if(x > z):
        	checkX  = x - z;
    else:
        	checkX = z - x;
    if(y > z):
                checkY  = y - z;
    else:    
        	checkY = z - y;
    if(checkX < checkY):
        	return 1;
    elif (checkX > checkY):
        	return 2;
    else:
        	return 0;


  print(Closest.findClosest(1,2,5));

