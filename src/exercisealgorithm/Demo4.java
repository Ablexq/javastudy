package exercisealgorithm;

import java.util.Scanner;

//输入一个有符号整数，输出该整数的反转值。
//0 ——> 0
//-123 ——> -321
//123456 ——> 654321
public class Demo4 {

    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            rev = rev * 10 + +x % 10;
            x /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        System.out.println(reverse(input));
    }
}
