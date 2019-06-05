public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3,5,1,4,7,2,6};
        int[] bubble = bubbleSort(arr);
        for (int i = 0; i < bubble.length; i++) {
            System.out.print(bubble[i]+", ");
        }
    }

    public static int[] bubbleSort(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                // 大于号则为升序
                // 小于号则为降序
                if(arr[i] > arr[j]){
                    /*  使用第三变量
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    */
                    /*  使用位运算
                    arr[i] = arr[i] ^ arr[j];
                    arr[j] = arr[i] ^ arr[j];
                    arr[i] = arr[i] ^ arr[j];
                    */
                    /*  使用加减法           */
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }
        return arr;
    }
}

