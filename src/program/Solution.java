package program;//package program;
//
//import java.util.Scanner;
//
//public class Solution {
//    /**
//     *
//     * @param grid int整型二维数组
//     * @return int整型
//     */
//    public int minPathSum (int[][] grid) {
//        // write code here
//        int m = grid.length,n = grid[0].length;
//        int [][] path = new int[m][n];
//        path[0][0] = grid[0][0];
//        for(int i = 1;i<m;i++){
//            path[i][0] = path[i-1][0] + grid[i][0];
//        }
//        for(int j=1;j<n;j++){
//            path[0][j] = path[0][j-1] + grid[0][j];
//        }
//        for(int i=1;i<m;i++){
//            for(int j=1;j<m;j++){
//                path[i][j] = Math.min(path[i][j-1]+grid[i][j],path[i-1][j]+grid[i][j]);
//            }
//        }
//        return path[m-1][n-1];
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int r = scanner.nextInt();
//        int c = scanner.nextInt();
//        int[][] grid = new int[r][c];
//        scanner.nextLine();
//        for(int i = 0;i<r;i++){
//            for(int j=0;j<c;j++){
//                grid[i][j] = scanner.nextInt();
//            }
//        }
//        //int[][] grid = {{2,3,1,4},{4,6,3,1},{4,3,1,2},{2,4,1,3}};
//        Solution solution = new Solution();
//        System.out.println(solution.minPathSum(grid));
//    }
//}

//
//import java.util.*;
//
//import java.util.Arrays;
//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     * 返回能交换奖品的最大数量
//     * @param a int整型
//     * @param b int整型
//     * @param c int整型
//     * @return int整型
//     */
//    public int numberofprize (int a, int b, int c) {
//        // write code here
//        int[] arr = new int[3];
//        arr[0] = a;
//        arr[1] = b;
//        arr[2] = c;
//        Arrays.sort(arr);
//        if(arr[0] == arr[1] && arr[0] == arr[2]){
//            return arr[0];
//        }else if((arr[0]-arr[1])<2 || (arr[0]-arr[2])<=2){
//            return arr[0];
//        }else if(())
//
//    }
//}