package exercisealgorithm;

/*
* 阶乘的算法
* https://www.cnblogs.com/happyframework/p/3454427.html
* */
public class Factorial {

    public static void main(String[] args) {
        long recursiveFac = RecursiveFac(8);
        long fac = Fac(8);
        System.out.println("===" + recursiveFac);
        System.out.println("===" + fac);
    }

    /*递归*/
    private static long RecursiveFac(long n) {
        if (n == 0) {
            return 1;
        } else {
            return n * RecursiveFac(n - 1);
        }
    }

    /*递推*/
    private static long Fac(long n) {
        long result = 1;
        for (long i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

}
