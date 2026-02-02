import java.util.Arrays;
public class FindMedian{
public static int[] sortArray(int[] numbers){
    int counter = 0;
    for(int count = 1; count< numbers.length; count++){
        if(numbers[counter] < numbers[count]){
            int temp = numbers[counter];
            numbers[counter] = numbers[count];
            numbers[count] = temp;

        }
        if(count == numbers.length - 1){
            counter += 1;
            count = counter + 1;
        }
        if(counter == numbers.length) break;

    }
    return numbers;
}

public static int findMedianSortedArrays(int[] numbers){
    int[] newNumbers = sortArray(numbers);
    int median;
    if (numbers.length % 2 != 0){
        median = newNumbers[numbers.length/2] + newNumbers[numbers.length/2 + 1];
         median = median/2;

    }
    else

        median = newNumbers[numbers.length / 2];
                    System.out.println(numbers.length / 2 );
    return median;
}

public static void main(String... args){
    int[] numbers = {1,2,4,3};
        System.out.println(findMedianSortedArrays(numbers));

}

}

