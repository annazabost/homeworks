import java.util.ArrayList;

public class EvenNumbers {

    public static int[] noOdds(int[] nums) {

        ArrayList<Integer> table = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 == 0) {
                table.add(nums[i]);
            }
        }
        int[] result = new int[table.size()];

        for (int i = 0; i < table.size(); i++) {
            result[i] = table.get(i);

        }
        return result;

    }

}
