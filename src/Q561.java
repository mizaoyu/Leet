import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Misky on 9/25/2017.
 */
public class Q561 {

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i=0;i<nums.length;i+=2){
            count += nums[i];
        }
        return count;
    }

    public void entry(){
        int [] input = {1,4,3,2};
        System.out.println(arrayPairSum(input));
    }
}
