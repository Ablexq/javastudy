package exercisealgorithm;

import java.util.Scanner;

//输入一个有符号整数，输出该整数的反转值。
//0 ——> 0
//-123 ——> -321
//123456 ——> 654321
public class Demo1 {

    public static void main(String[] args) {
        System.out.println("请输入一个整数！");
        Scanner in = new Scanner(System.in);
        String temp = in.next();
        in.close();
        System.out.print("反转后的数字为：");

        //假如是个正一位数
        if (temp.length() == 1) {
            System.out.println(Integer.parseInt(temp));
            return;
        }

        //假如是个负一位数
        if (temp.length() == 2 && temp.startsWith("-")) {
            System.out.println(Integer.parseInt(temp));
            return;
        }

        char[] array = temp.toCharArray();
        //假如这个数为负数
        if (array[0] == '-') {
            for (int i = 1; i < array.length; i++) {
                if (i >= array.length - i) {
                    break;
                }
                char num = array[i];
                array[i] = array[array.length - i];
                array[array.length - i] = num;
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                if (i >= array.length - i - 1) {
                    break;
                }
                char num = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = num;
            }
        }
        //数组已经调换完毕
        String res = new String(array);
        int result = Integer.parseInt(res);
        System.out.println(result);
    }
}
