package program;
//给定整数N，求斐波那契数列的第N项 （从0开始。0项为0）
public class Fibonacci {
    //递归解法

    public static int help(int n){
        if(n<0||n>39){return -1;}
        if(n==0){return 0;}
        if(n==1){return 1;}
        return help(n-1)+help(n-2);
    }

    //循环解法
    public static int help1(int n){
        if(n<0||n>39){return -1;}
        if(n==0){return 0;}
        if(n==1){return 1;}
        int a=1,b=1;
        int c = 0;
        for(int i=2;i<n;i++){
            c = a+b;
            a = b;
            b = c;
        }
        return c;
    }


    public static void main(String[] args) {
        //System.out.println(help(40));
        System.out.println(help1(7));
    }
}
