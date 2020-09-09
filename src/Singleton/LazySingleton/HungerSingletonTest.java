package Singleton.LazySingleton;
/*public class HungerSingletonTest {
    public static void main(String[] args) {
        HungerSingleton instance1 = HungerSingleton.getInstance();
        HungerSingleton instance2 = HungerSingleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}

class HungerSingleton{
    private static HungerSingleton instance = new HungerSingleton();
    private HungerSingleton(){
    }
    public  static HungerSingleton getInstance(){
        return instance;
    }

}
*/

class HungerSingleton{
    private static HungerSingleton instance = new HungerSingleton();
    private HungerSingleton(){

    }
    public static HungerSingleton getInstance(){
        return instance;
    }
}
public class HungerSingletonTest{
    public static void main(String[] args) {
        HungerSingleton instance = HungerSingleton.getInstance();
    }
}
