import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMaxCalculation {
    public static void main(String[] args) {
        cal(Arrays.asList(2,0,4,7,8,12,1));
    }

    public static void cal(List<Integer> nums) {
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        System.out.println("min value: " + min);
        System.out.println("max value: " + max);
    }
}