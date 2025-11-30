public class MaximumSubArraySum {
    public static int maxSubArray(int[] numbers, int number) {
        int newLength = 0;
        int sum = 0;
        for(int check = numbers.length;check >= 1;check--){
            if(check % number ==0){
                newLength = check;
                break;
            }
        }
        for(int index = 0; index < newLength; index++){
            sum += numbers[index];

        }
        return sum;
    }
    public static void main(String[] args) {
        int[] numbers = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(numbers, 2));
    }
}
