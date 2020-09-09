package rabit;

public class Tortoise extends Thread {

    public void run(){
        for(int j=0;j<100;j=j+5){
            System.out.println("Tortoise run"+j+"miters");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
