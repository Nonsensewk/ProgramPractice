package program;

public class recursion5000 {
    public static void main(String[] args) {
        recursion5000  a = new recursion5000();
        a.doubleadd(1237);
    }


    public void doubleadd(int i){

        System.out.println(i);

        if(i <= 5000){
            doubleadd(i*2);
            System.out.println(i);
        }

    }
}

