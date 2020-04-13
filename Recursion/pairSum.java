import java.util.*;

public class pairSum {
    public static void PairSum(int[] arr, int i, int sum1, String set1, int sum2, String set2) {
        if (i == arr.length) {
            if (sum1 == sum2) {
                System.out.println(set1+ " & " + set2 + ""); 
            }
            return;
        }
        PairSum(arr, i + 1, sum1 + arr[i], set1 + " " + arr[i], sum2, set2);
        PairSum(arr, i + 1, sum1, set1, sum2 + arr[i], set2 + " " + arr[i]);

    }
    public static void PairSumArrayList(int[] arr, int i, int sum1, ArrayList<Integer> set1, int sum2, ArrayList<Integer> set2) {
        if (i == arr.length) {
            if (sum1 == sum2) {
                System.out.println(set1+ " & " + set2 + ""); 
            }
            return;
        }
        set1.add(arr[i]);
        PairSumArrayList(arr, i + 1, sum1 + arr[i], set1 , sum2, set2);
        set1.remove(set1.size()-1);

        set2.add(arr[i]);
        PairSumArray(arr, i + 1, sum1, set1, sum2 + arr[i], set2);
        set2.remove(set2.size()-1);
    }

    public static void main(String args[]) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
        // int target=70;
        PairSumArrayList(arr, 0, 0, new ArrayList<>(), 0, new ArrayList<>());
    }
}