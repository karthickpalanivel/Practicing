import java.util.*;

public class BinarySearch {
    public static void main(String args[]) {
        int[] num = { 1, 23, 6, 87, 93, 38 };
        System.out.println(binary1(num, 87));
    }
    
    public static int binary1(int [] nums, int targets){
        int low = 0;
        int high = nums.length - 1;
        
        while (low <= high) {
            int mid = (high + low) / 2;
            int midNum = nums[mid];

            if (targets == midNum) {
                return mid;
            } else if (targets < midNum) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
