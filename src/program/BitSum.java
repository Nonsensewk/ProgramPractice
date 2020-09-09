package program;
//不用加减乘除做运算   计算a+b
public class BitSum {
    public int help(int a,int b){
        if(a==0)
            return b;
        return help(a^b,(a&b)<<1);
    }

    public static void main(String[] args) {
        System.out.println(new BitSum().help(3,5));
//        int a = 3,b =4;
//        a = a^b;
//        b = a^b;
//        a = a^b;
//        System.out.println(a);
//        System.out.println(b);
    }
}
