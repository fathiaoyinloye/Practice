public class SearchInsertPositionRefactored {

        public int searchInsert(int[] nums, int target) {
            int indexOfTarget = 0;
            if (nums[0] > target){indexOfTarget = 0;}
            else if(target > nums[nums.length - 1]) indexOfTarget = nums.length;
            else {
                for (int count = 0; count < nums.length; count++) {
                    if(nums[count] == target){indexOfTarget = count; break;}

                    for (int counter = count + 1; counter < nums.length; counter++) {
                        if (nums[count] < target && nums[counter] > target) {
                            indexOfTarget = count + 1;
                            break;
                        }
                    }
                }
            }

            return indexOfTarget;

        }
    }
