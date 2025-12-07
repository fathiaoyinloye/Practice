import java.util.Arrays;
public class MedianOfSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4};
        System.out.print(findMedianSortedArrays(arr1, arr2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] newArray = new int[nums1.length + nums2.length];
        int check = 0;
        for (int count = 0; count < newArray.length; count++) {
           if (count >=  nums1.length){
                newArray[count] = nums2[check];
                check++;
            }if(count < nums1.length)
           newArray[count] = nums1[count];
        }

        for (int count = 0; count < newArray.length; count++) {
            for (int counter = count + 1; counter < newArray.length; counter++) {
                if (newArray[count] > newArray[counter]) {
                    int temp = newArray[count];
                    newArray[count] = newArray[counter];
                    newArray[counter] = temp;
                }
            }
        }

        double median = 0;
        if (newArray.length % 2 == 0)
        median = (newArray[newArray.length / 2] + newArray[newArray.length / 2 -1] * 1.0) / 2;

        else median = newArray[newArray.length / 2];
        return median;
    }

}
