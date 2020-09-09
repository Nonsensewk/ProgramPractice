package program;
//进制的转换问题：

public class Radix {
    //  任何进制转化为10进制
    public static int help1(String s,int radix){
        return Integer.parseInt(s,radix);
    }
    //

    public static void main(String[] args) {
        System.out.println(help1("11100000",2));
        System.out.println(help1("A213",16));
        System.out.println(help1("767121",8));
    }


}
