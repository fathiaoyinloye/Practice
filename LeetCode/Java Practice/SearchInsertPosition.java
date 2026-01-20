public class SearchInsertPosition {
        public int searchInsert(int[] nums, int target) {
            int indexOfTarget = 0;
            boolean found = false;
            for(int count = 0; count < nums.length; count++){
                if( nums[count] == target){ indexOfTarget = count;
                    found = true;}

            }
            if (found == false){
                for(int count = 0; count < nums.length; count++){
                    for(int counter = count + 1; counter < nums.length; counter++ ){
                        if (nums[count] < target && nums[counter] > target){indexOfTarget = count + 1;found = true; break; }
                    }
                }
            }
            if(found == false && target > nums[nums.length - 1]) indexOfTarget = nums.length;
            else if (found == false && target < nums[0]) indexOfTarget = 0;

            return indexOfTarget;

        }
    }
