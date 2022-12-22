import java.util.ArrayList;
import java.util.List;

public class SubsetsOfSet {
        public static void main(String[] args) {
            int[] input = {1, 2, 3};
            System.out.println(subsets(input));
        }

        public static List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();

            int n = nums.length;
            int powSize = (int) Math.pow(2, n);

            for (int i = 0; i < powSize; i++) {
                List<Integer> val = new ArrayList<>();

                for (int j = 0; j < n; j++) {
                    if ((i & (1 << j)) != 0) {
                        val.add(nums[j]);
                    }
                }
                result.add(val);
            }

            return result;
        }
    }

