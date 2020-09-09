package program;
//青蛙跳台阶，一次可以跳1级或两级，求跳上n阶的台阶有多少种跳法。

//递归方法，不推荐使用，随规模大小呈爆炸增长，产生很多不必要计算
//public class jumpfloor{
//    public int jump(int target){
//        if(target==1){
//            return 1;
//        }
//        if(target==2){
//            return 2;
//        }
//
//        return jump(target-1)+jump(target-2);
//    }
//
//    public static void main(String[] args) {
//        jumpfloor j = new jumpfloor();
//        System.out.println(j.jump(4));
//    }
//}
//迭代方法，复杂度为O(n);
/*package  program;
public class jumpfloor{
    public int jump(int target){
        int a =1;
        int b =2;
        int sum = a+b;
        if(target == 1){
            return 1;
        }
        if(target ==2){
            return 2;
        }
        for(int i = 3;i<=target;i++){
           sum=a+b;
           a=b;
           b=sum;
        }
        return sum;
    }
    public static void main(String[] args) {
        jumpfloor j = new jumpfloor();
        System.out.println(j.jump(6));
    }
 }
*/
//变态跳台阶问题；青蛙可以一次跳1，2，3.。。。。n级台阶，求种数；

//f[n]=f[n-1]+f[n-2]+.....+f[2]+f[1]    f[n-1]=f[n=2]+f[n-3]+,,,,,+f[2]+f[1]     ---->f[n]-f[n-1]=f[n-1]--->f[n]=2*f[n-1]
public class jumpfloor{
    public int jump(int target){
        if(target == 1){
            return 1;
        }
        if(target == 2){
            return 2;
        }
        return 2*jump(target-1);
    }
    public static void main(String[] args) {
        jumpfloor j = new jumpfloor();
        System.out.println(j.jump(6));
    }
}