public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3,5,2,4,7,1,6};
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
    }

    public static void bubbleSort(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    // 大于号则为升序
                    // 小于号则为降序
                    /*  使用第三变量
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    */
                    /*  使用位运算
                    arr[j+1] = arr[j+1] ^ arr[j];
                    arr[j] = arr[j+1] ^ arr[j];
                    arr[j+1] = arr[j+1] ^ arr[j];
                    */
                        /*  使用加减法           */
                    arr[j+1] = arr[j+1] + arr[j];
                    arr[j] = arr[j+1] - arr[j];
                    arr[j+1] = arr[j+1] - arr[j];
                }
            }
        }
    }
}
