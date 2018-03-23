package sort;

import java.util.Arrays;

/**
 * Created by lenovo on 2018/3/23.
 */
public class BubbleSort1 {

    public static void main(String[] args) {
        int[] arr = {1, 200, 19, 55, 10, 22, 3, 7};
        //API实现
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //冒泡实现
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
