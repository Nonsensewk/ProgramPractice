package Thread;

public class test01 {
    public static void main(String[] args) {
        test01Util test01Util = new test01Util();
        //子线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i<3;i++){
                    test01Util.zixiancheng();
                }
            }
        }).start();
        //主程序
        for(int i=6;i<9;i++ ){
            test01Util.zhuxiancheng();
        }
    }
}
