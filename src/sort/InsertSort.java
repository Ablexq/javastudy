package sort;

/**
 * https://blog.csdn.net/happy_wu/article/details/51841244
 * 1.插入排序—直接插入排序(Straight Insertion Sort)
 *
 * 基本思想:
 * 将一个记录插入到已排序好的有序表中，从而得到一个新，记录数增1的有序表。
 * 即：先将序列的第1个记录看成是一个有序的子序列，然后从第2个记录逐个进行插入，直至整个序列有序为止。
 * 要点：
 * 设立哨兵，作为临时存储和判断数组边界之用。
 */
public class InsertSort {
    public static void main(String[] args) {
        int a[] = {3, 1, 5, 7, 2, 4, 9, 6, 10, 8};
        InsertSort obj = new InsertSort();

        System.out.println("初始值：");
        obj.print(a);

        obj.insertSort(a);

        System.out.println("\n排序后：");
        obj.print(a);
    }

    public void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public void insertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {//从头部第一个当做已经排好序的，把后面的一个一个的插到已经排好的列表中去。
            int j;
            int x = a[i];//x为待插入元素
            for (j = i; j > 0 && x < a[j - 1]; j--) {//通过循环，逐个后移一位找到要插入的位置。
                a[j] = a[j - 1];
            }
            a[j] = x;//插入
        }

    }
}