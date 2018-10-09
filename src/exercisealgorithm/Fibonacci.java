package exercisealgorithm;

/*
* 斐波那契数列
* 指的是这样一个数列
* 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233，377，610，987，1597，2584，4181，6765，10946，17711，28657，46368........
* 这个数列从第3项开始，每一项都等于前两项之和。
* */
public class Fibonacci {

    /*递归*/
    public static long fibonacci(int n) {
        if (n == 0 || n == 1) return 1;
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static long fibonacci2(int n) {
        long arr[] = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;           //n不能为0，因为n为0时，arr大小为1，arr[1]越界。
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            long num = fibonacci(i);
            System.out.print(num + " ");
        }

        for (int i = 1; i < 10; i++) {
            long num = fibonacci2(i);
            System.out.print(num + " ");
        }
    }

}
