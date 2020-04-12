import java.util.*;

public class targetsum {
    static int count = 0;

    public static void TargetSum(int[] arr, int target, int i, int sum, String psf) {
        if (i == arr.length) {
            if (sum == target) {
                count++;
                System.out.println(count + ". " + psf);
            }
            return;
        }
        TargetSum(arr, target, i + 1, sum + arr[i], psf + " " + arr[i]);
        TargetSum(arr, target, i + 1, sum, psf);
    }

    public static void TargetSumArrayList(int[] arr, int target, int i, int sum, ArrayList<Integer> set) {
        if (i == arr.length) {
            if (sum == target) {
                count++;
                System.out.println(set);
            }
            return;
        }
        set.add(arr[i]);
        TargetSumArrayList(arr, target, i + 1, sum + arr[i], set);
        set.remove(set.size()-1);
        TargetSumArrayList(arr, target, i+1, sum, set);
    }

    public static void main(String args[]) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
        int target = 70;
        // TargetSum(arr, target, 0, 0, "");
        TargetSumArrayList(arr, 70, 0, 0,new ArrayList<>());
    }

}