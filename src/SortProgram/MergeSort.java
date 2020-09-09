package SortProgram;
//归并排序
public class MergeSort {
    public static void mergersort(int[] array,int low,int high,int[] temp){
        if(low<high){
            int mid = (low+high)/2;
            mergersort(array,low,mid,temp);//左序列归并
            mergersort(array,mid+1,high,temp);//右序列归并
            merger(array,low,mid,high,temp);//合并
        }
    }
    public static void merger(int[] array,int low,int mid,int high,int[] temp){

        int i = 0;
        int j = low,k = mid+1;
        //从左右两部分起始处开始索引
        while ((j <= mid)&&( k <= high)){
            if(array[j]<array[k]) {
                temp[i++] = array[j++];
            }else {
                temp[i++] = array[k++];
            }
        }
        //左边序列还有剩余则全部拷入temp
        while (j<=mid){
            temp[i++] = array[j++];
        }
        while (k<=high){
            temp[i++] = array[k++];
        }
        for(int t=0;t<i;t++){
            array[low+t] = temp[t];
        }

    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,2,8,1,9,5};
        int[] temp  = new int[arr.length];
        mergersort(arr,0,arr.length-1,temp);
        for (int i:arr) {
            System.out.println(i);
        }

    }

}

