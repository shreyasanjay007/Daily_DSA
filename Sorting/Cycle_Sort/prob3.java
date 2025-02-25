import java.util.ArrayList;
import java.util.List;

public class prob3 {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3,2,7,9,2,4,10};
        prob3 obj = new prob3();
        List<Integer> missingNumbers = obj.missingArray(arr);
        System.out.println(missingNumbers);
    }

    public List<Integer> missingArray(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }
}
