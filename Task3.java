import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        int[] nums = {2, 3, -7, 6, 8, 10, -10, 15};
        int pas = notContains(nums);
        System.out.println(pas);
    }
    public static int notContains(int[] array) {
        Set<Integer> distinctNums = Arrays.stream(array).boxed().collect(Collectors.toSet());
        int ans = 1;
        while(true) {
            if(!distinctNums.contains(ans)) {
                return ans;
            }
            else {
                ans++;
            }
        }
    }
}
