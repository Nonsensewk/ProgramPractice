package Thread;

public class test01Util {

    private boolean flag = false;
    public synchronized void zhuxiancheng(){
        while (!flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("zhuxiancheng"+i);
        }
        this.notify();
        flag = false;
    }

    public synchronized void zixiancheng(){
        while (flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for(int i=0;i<3;i++){
            System.out.println("zixiancheng"+i);
        }
        this.notify();
        flag = true;
    }
}
