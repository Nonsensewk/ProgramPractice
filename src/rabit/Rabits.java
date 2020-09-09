package rabit;

public class Rabits extends Thread{
    @Override
    public void run() {
        for(int i=0;i<100;i=i+10){
            System.out.println("rabits run"+i+"miters");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            while (i ==51){
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
