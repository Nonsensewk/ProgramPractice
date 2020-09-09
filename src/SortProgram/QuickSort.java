/*
package SortProgram;
//快速排序
public class QuickSort {
    public static void qicksort(int[] arr,int left,int right){
        int start = left,end = right;
        int flag = left;
        if(left>=right){
            return ;
        }
        while (left<right){
            while ((left<right) && (arr[right] >= arr[flag])){
                right--;
            }
            if(arr[right]<arr[flag]){
                int temp1 = arr[right];
                arr[right] = arr[flag];
                arr[flag] = temp1;
                flag = right;
            }
            while ((left<right) && (arr[left] <= arr[flag])){
                left++;
            }
            if(arr[left]>arr[flag]){
                int temp2 = arr[left];
                arr[left] = arr[flag];
                arr[flag] = temp2;
                flag = left;
            }
        }
        qicksort(arr,start,left-1);
        qicksort(arr,left+1,end);
    }

    public static void main(String[] args) {
        int[] a = {3,4,4,5,9,1,2,19,5};
        qicksort(a,0,a.length-1);
        for(int i :a){
            System.out.println(i);
        }
    }

}*/
package SortProgram;
public class QuickSort{
    public static void quick(int[] array,int left,int right){

        int start = left,end = right;//起始
        int flag = left;//标记挖坑
        if(left>=right){
            return;
        }

        while (left<right){
            while ((left<right)&&(array[right]>=array[flag])){//先从右侧寻找比flag小的
                right--;//没有往左移
            }
            if(array[right]<=array[flag]){//有了 和flag交换
                int temp = array[right];
                array[right] = array[flag];
                array[flag] = temp;
                flag = right;//重置flag
            }
            while ((left<right)&&(array[left]<=array[flag])){//左侧寻找比flag大的
                left++;//没有右移
            }
            if(array[left]>array[flag]){//交换
                int temp = array[left];
                array[left] = array[flag];
                array[flag] = temp;
                left = temp;
            }
        }
        quick(array,start,left-1);
        quick(array,left+1,end);
    }

    public static void main(String[] args) {
        int[] a = {1,5,2,4,7,9,3};
        quick(a,0,a.length-1);
        for(int i :a){
            System.out.println(i);
        }
    }
}

