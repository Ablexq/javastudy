package string;

/**
 * 可重复排列：abc三个字符组成的所有长度为3的字符串，aaa,aab,aac......ccc 一共27种
 * 利用递归的思想，第一个字符可以从abc中选择一个，三种选择，之后问题转化为abc组成长度为2的字符的情况，循环递归后可以求出所有的可能。控制好循环退出条件即可。
 * 利用递归可以处理，不知道字符长度的情况下，即通用处理。如果知道长度，只需要利用多层循环，也可以得出结论。
 */
public class Permutation {
    public static void main(String[] args) {
        char[] chs = {'a', 'b', 'c'};
        per(new char[3], chs, 3 - 1);
    }

    private static void per(char[] buf, char[] chs, int len) {
        if (len == -1) {
            for (int i = buf.length - 1; i >= 0; --i)
                System.out.print(buf[i]);
            System.out.println();
            return;
        }
        for (char ch : chs) {
            buf[len] = ch;
            per(buf, chs, len - 1);
        }
    }
}