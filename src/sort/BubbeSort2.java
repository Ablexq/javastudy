package sort;

import java.util.Arrays;

/**
 * Created by lenovo on 2018/3/23.
 */
public class BubbeSort2 {
    public static void main(String[] args) {
        boolean flag = true;
        int[] arr = {2, 1, 3, 5, 4};
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            if (!flag) {
                //没有发生交换则退出循环；
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
