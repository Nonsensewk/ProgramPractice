package SortProgram;
//冒泡排序：
public class BubbleSort {
    public static  void sort(int[] arr){
        int temp = 0;
        for(int i =0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] a = {2,5,7,3,6,9};
        sort(a);
        for(int i:a){
            System.out.println(i);
        }

    }
}
