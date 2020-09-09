package program;
import java.util.Scanner;
//随机截取数组某两段，求公共部分个数以及除去公共部分后各剩余的部分个数。


//A国和B国正在打仗，他们的目的是n块土地。现在，A国和B国暂时休战，为了能合理分配这一些土地，AB国开始协商。
//A国希望得到这n块土地中的p块土地，B国希望得到这n块土地中的q块土地。每个国家都将自己希望得到的土地编号告诉了小团和小美——两位战争调和人。
//你需要帮小团和小美计算，有多少块土地是只有A国想要的，有多少块土地是只有B国想要的，有多少块土地是两个国家都想要的。
//输入描述
//输入第一行包含三个整数n,p,q，含义如题意所示
//接下来一行p个整数，空格隔开，第 i 个整数代表A国需要的土地编号ai
//接下来一行q个整数，空格隔开，第 i 个整数代表B国需要的土地编号bi
//土地编号从1开始，n结束。
//p,q≤n≤100000 , 1≤ai,bi≤n , 数据保证所有的ai互相不相同，bi互相不相同。
//输出描述
//输出包含三个数，只有A国想要的土地数，只有B国想要的土地数，两个国家都想要的土地数。
public class SumArray {
    public int[] solution(int[][] arr){
        int count = 0;
        int removefirst= 0;
        int removesecond = 0;
        for(int i=0;i<arr[0].length;i++){
            if(arr[0][i] == 0){
                removefirst+=1;
            }
            for(int j=0;j<arr[1].length;j++){
                if(arr[1][j]==0){
                    removesecond+=1;
                }
                if(arr[0][i]==arr[1][j]){
                    count+=1;
                }
            }
        }
        int[] arr1 = new int[]{arr[0].length-count-removefirst,arr[1].length-count-removesecond,count};

        return arr1;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // int n = scanner.nextInt();
        int[][] nums = new int[2][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                nums[i][j] = scanner.nextInt();
            }
        }
        SumArray main = new SumArray();
        int[] result = main.solution(nums);
        System.out.println(result[0]+""+result[1]+""+result[2]);
    }
}
