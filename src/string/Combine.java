package string;

import java.util.Stack;

// 字符串的组合：
// 给一个字符串，比如ABC， 把所有的组合，即：A, B, C, AB, AC, BC, ABC, 都找出来。
// 解题思路：
// 假设我们想在长度为n的字符串中求m个字符的组合。我们先从头扫描字符串的第一个字符。
// 针对第一个字符，我们有两种选择：
// 一是把这个字符放到组合中去，接下来我们需要在剩下的n-1个字符中选取m-1个字符；
// 二是不把这个字符放到组合中去，接下来我们需要在剩下的n-1个字符中选择m个字符。这两种选择都很容易用递归实现。
public class Combine {

    public static void main(String[] args) {
        char[] chs = {'a', 'b', 'c'};
        combine(chs);
    }

    public static void combine(char chs[]){
        if(chs.length == 0) return ;

        Stack<Character> stack = new Stack<>();
        for(int i = 1; i <= chs.length; i++){
            combine(chs, 0, i, stack);
        }
    }
    //从字符数组中第begin个字符开始挑选number个字符加入stack中
    private static void combine(char[] chs, int begin, int number, Stack<Character> stack){
        if(number == 0){
            System.out.println(stack.toString());
            return ;
        }
        if(begin == chs.length){
            return;
        }
        stack.push(chs[begin]);
        combine(chs, begin + 1, number - 1, stack);
        stack.pop();
        combine(chs, begin + 1, number, stack);
    }

}
