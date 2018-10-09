package exercisealgorithm;

import java.util.Scanner;


//输入一个有符号整数，输出该整数的反转值。
//0 ——> 0
//-123 ——> -321
//123456 ——> 654321
public class Demo2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0, c = 0;
        int res = 0;
        String s = n + "";
        int i = s.length() - 1;
        if (n >= 0) a = 1;
        else {
            a = -1;
            c = 1;
        }
        for (; i >= c; i--) {
            int b = s.charAt(i) - 48;
            res = b + 10 * res;
        }
        System.out.println(res * a);
    }
}
