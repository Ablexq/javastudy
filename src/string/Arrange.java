package string;

/**
 * 全排列：abc三个字符，全排列即字符不能重复。最后 3*2 =6种结果
 */
public class Arrange {

    public static void main(String[] args) {
        char[] chs = {'a', 'b', 'c'};
        arrange(chs, 0, chs.length);
    }

    private static void arrange(char[] chs, int start, int len) {
        if (start == len - 1) {
            for (char ch : chs) System.out.print(ch);
            System.out.println();
            return;
        }

        for (int i = start; i < len; i++) {
            char temp = chs[start];
            chs[start] = chs[i];
            chs[i] = temp;

            arrange(chs, start + 1, len);
            temp = chs[start];
            chs[start] = chs[i];
            chs[i] = temp;
        }
    }
}
