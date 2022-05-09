package PaiXu;

public class quickly {

    private static void printArr(int[] arr) {
        for (int anArr : arr) {
            System.out.print(anArr + " ");
        }
    }

    public static int partition(int[] arr, int left, int right) {
        int temp = arr[left];
        while (right > left) {
            // 先判断基准数和后面的数依次比较
            while (temp <= arr[right] && left < right) {
                --right;
            }
            // 当基准数大于了 arr[right]，则填坑
            if (left < right) {
                arr[left] = arr[right];
                ++left;
            }
            // 现在是 arr[right] 需要填坑了
            while (temp >= arr[left] && left < right) {
                ++left;
            }
            if (left < right) {
                arr[right] = arr[left];
                --right;
            }
        }
        arr[left] = temp;
        return left;
    }
    //创建递归，

    public static void quickSort(int[] arr, int left, int right) {
        if (arr == null || left >= right || arr.length <= 1)//递归终止条件
            return;
        int mid = partition(arr, left, right);//调用partition函数
        quickSort(arr, left, mid);    //递归，完成对数组左半部分的快速排序
        quickSort(arr, mid + 1, right); //递归调用，完成对数组的右半部份的排序
    }


    public static void main(String[] args) {
        int[] arr = {6, 4, 3, 2, 7, 9, 1, 8, 5};
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
