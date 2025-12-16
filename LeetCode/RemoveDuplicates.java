import java.util.Arrays;
public class RemoveDuplicates {
    public static void removeDuplicates(int[] nums) {
        int[] newArray = new int[nums.length];

        int counter = 0;
        for (int index = 0; index < nums.length; index++) {
            int number =  nums[index];
            for(int count = 0; count < nums.length; count++){
                if(number == newArray[count]) number = 0;
            }
           if(number != 0){ newArray[index] = number;counter++;}
        }
        int check = 0;
        int[] arrayOfNoDuplicate = new int[counter];
            for(int count = 0; count < newArray.length; count++){
               if(newArray[count] != 0){
                   arrayOfNoDuplicate[check] = newArray[count];
                   check++;

               }
            }
        }

    public static void main(String[] args) {
        int[] array = {1,1,2,3,1,4,2,3,5};
        removeDuplicates(array);

    }
}

