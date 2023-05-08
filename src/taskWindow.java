import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class taskWindow {
    public static void main(String[] args) {

        int[] arrayTest = {1, 45, 2, 10, 23, 3, 1, 0, 20};
        System.out.println(maxSum(arrayTest, 4));
    }

    public static int maxSum(int[] array, int k) {
        List<Integer> arrayOfSums = new ArrayList<>(); // массив сумм
        if (array.length < k) { // массив не подходит
            return 0;
        }
        for (int i = 0; i < array.length - k; i++) { // идем по массиву внешним циклом до длины - k
            int sum = 0;// счетчик суммы
            for (int j = i; j < i + k; j++) { // считаем сумму первых k элементов
                sum = sum + array[j];
            }
            arrayOfSums.add(sum);
        }
        return arrayOfSums.stream().max(Integer::compareTo).get(); // получили максимальное значение из листа
    }

    public static int maxSum2(int arr[], int k) {

        int currentSum = 0;

        if (arr.length < k) return 0;


        for (int i = 0; i < k; i++) {
            currentSum += arr[i];   //сумма первых k элементов
        }
        Integer maxSum = currentSum;


        for (int i = k; i < arr.length; i++) {
            currentSum += arr[i] - arr[i - k];  //сумму следующих к элементов без предыдущих


            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }

    public static int maxSumSlidingWindow(int[] arr, int k) {
        int length = arr.length;
        if (length < k) {
            System.out.println("wrong size of array");
            return -1;
        }
        int max = 0;
        for (int i = 0; i < k; i++) {
            max += arr[i];
        }
        int windowSum = max;
        for (int i = k; i < length; i++) {
            windowSum += arr[i] - arr[i - k];
            max = Math.max(max, windowSum);
        }
        return max;
    }
}
