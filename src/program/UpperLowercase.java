package program;
import java.util.Scanner;
public class UpperLowercase {
    //时间限制： 3000MS
    //内存限制： 589824KB
    //题目描述：
    //在小美的国家，任何一篇由英文字母组成的文章中，如果大小写字母的数量不相同会被认为文章不优雅。
    //
    //现在，小美写了一篇文章，并且交给小团来修改。小美希望文章中的大小写字母数量相同，所以她想让小团帮她把某些小写字母改成对应的大写字母，或者把某些大写字母改成对应的小写字母，使得文章变得优雅。
    //
    //小美给出的文章一定是由偶数长度组成的，她想知道最少修改多少个字母，才能让文章优雅。

    public int solution(String string){
        if(string.length()%2!=0){
            return -1;
        }
        int countA=0;
        int counta = 0;
        for(int i=0;i<string.length();i++){
            if((byte)string.charAt(i)>64&&(byte)string.charAt(i)<91){
                counta=counta+1;
            }
            if((byte)string.charAt(i)>96&&(byte)string.charAt(i)<123){
                countA=countA+1;
            }
        }
        if(countA==counta){
            return 0;
        }else if(countA>counta){
            return (countA-counta)/2;
        }else {return (counta-countA)/2;}

    }



    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        //String s = "AAAb";
        UpperLowercase test = new UpperLowercase();
        System.out.println(test.solution(s));
    }
}
