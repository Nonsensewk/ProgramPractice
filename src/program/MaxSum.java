package program;
//连续数组最大子序和
import java.util.Scanner;
public class MaxSum{
    public static void main(String args[]){
        Scanner sca = new Scanner(System.in);
        int L = sca.nextInt();
        int[] a = new int[L] ;
        for(int i=0;i<L;i++){
            a[i]=sca.nextInt();
        }
        System.out.println(find(a));

    }

    public static int find(int[] a){
        int cursum = a[0];
        int maxsum = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>0){
                cursum = cursum +a[i];
            }else{
                cursum = a[i];
            }
            if(cursum>maxsum){
                maxsum = cursum;
            }
        }
        return maxsum;
    }
}

