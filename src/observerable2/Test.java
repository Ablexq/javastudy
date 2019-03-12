package observerable2;

public class Test {

    public static void main(String[] args) {
        long i = 12345L;

        System.out.println(Long.toBinaryString(i));  //返回i的二进制的字符串表示
        System.out.println(Long.toOctalString(i));  //返回i的八进制的字符串表示
        System.out.println(Long.toHexString(i));  //返回i的十六进制的字符串表示
        System.out.println(Long.toString(i, 10));  //返回i的p进制的字符串表示
    }

}
