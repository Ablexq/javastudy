package string;

/**
 * 组合：abc三个字符的所有组合
 */
public class Comb {
    public static void main(String[] args) {
        char[] chs = {'a', 'b', 'c'};
        comb(chs);
    }

    private static void comb(char[] chs) {
        int len = chs.length;
        int nbits = 1 << len;
        for (int i = 0; i < nbits; ++i) {
            int t;
            for (int j = 0; j < len; j++) {
                t = 1 << j;
                if ((t & i) != 0) { // 与运算，同为1时才会是1
                    System.out.print(chs[j]);
                }
            }
            System.out.println();
        }
    }
}
