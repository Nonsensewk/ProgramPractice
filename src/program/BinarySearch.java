package program;

import sun.font.EAttribute;

//折半查找，二分查找，数组中某一元素。
public class BinarySearch {
     public static void binary(int[] array,int target){
        int Start = 0;
        int End = array.length-1;
         while(Start<=End){
             int mid = Start+(End - Start)/2;
               if(array[mid]==target){
                    System.out.println(mid);
                    break;
               }else if(array[mid]<target){
                   Start = mid +1;
               }else End = mid-1;
             }
        }


    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        binary(a,7);
        //System.out.println(binary(a,7));
    }
}
