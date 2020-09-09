
package program;

public class Prime {
    //200----300中所有素数

    public static void main(String[] args) {
        for(int i=201;i<300;i++){
            boolean flag  = true;
            for(int j = 2;j<(i/2);j++){
               if((i%j)==0){
                   flag = false;
                   break;
               }
            }
            if (flag){
                System.out.print(i+" ");
            }
        }
    }
}



/*
package program;
public class Prime {

    public static void main(String[] args) {
        int i,j;
        int num;
        for(i=200;i<=300;i++)
        {
            for(j=2;j<i;j++)
            {
                if(i%j==0)//又可以整除的数直接跳出循环
                    break;
            }

            if(i==j)//当到达只有i=j时，可以直接输出。
                System.out.print(j+" ");

        }
    }

}*/
