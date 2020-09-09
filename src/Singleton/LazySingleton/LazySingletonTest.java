package Singleton.LazySingleton;

/*
public class LazySingletonTest {
    public static void main(String[] args) {
        LazySingleton instance2 = LazySingleton.getInstance();
        LazySingleton instance1 = LazySingleton.getInstance();
        System.out.println(instance2 == instance1);
    }
}

class LazySingleton{

    private static LazySingleton instance = null;

    private LazySingleton(){
    }

    public synchronized static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
*/
class LazySingleton{
    private static LazySingleton instance ;
    private LazySingleton(){

    }
    public synchronized static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
public class LazySingletonTest{
    public static void main(String[] args) {
        LazySingleton instance = LazySingleton.getInstance();
    }
}