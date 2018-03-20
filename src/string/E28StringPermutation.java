package string;


/**
 * 输入一个字符串，打印出该字符串的所有排列。
 * 例如输入字符串abc，则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab,cba
 */
public class E28StringPermutation {

    public void swap(char[] arr, int idx1, int idx2) {
        char temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public void permutation(char[] arr, int index, int size) {
        if (index == size) {
            for (char anArr : arr) {
                System.out.print(anArr + " ");
            }
            System.out.println();
        } else {
            for (int i = index; i < size; i++) {
                if (i != index && arr[i] == arr[index])
                    continue;
                swap(arr, i, index);
                permutation(arr, index + 1, size);
                swap(arr, i, index);
            }
        }
    }

    public static void main(String[] args) {
        String str = "abcd";
        char[] chs = str.toCharArray();
        int size = chs.length;
        E28StringPermutation test = new E28StringPermutation();
        test.permutation(chs, 0, size);
    }
}