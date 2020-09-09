package program;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//反转字符串中子串顺序，然后输出，如   输入abcdefg   bcd  输出  adcbefg

public class ReverseString {

     static String reverse(String sourceStr, String changeStr) {
        int l = 0;
        for(int i=0;i<sourceStr.length();i++){
            if(sourceStr.charAt(i)==changeStr.charAt(0)){
                l = i;
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(changeStr);
        sb.reverse();
        StringBuilder sb1 = new StringBuilder();
        String s1 = sourceStr.substring(0,l);
        String s2 = sourceStr.substring(l+changeStr.length());
        sb1.append(s1);
        sb1.append(sb);
        sb1.append(s2);
        return sb1.toString();
    }



    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;

        String _sourceStr;
        try {
            _sourceStr = in.nextLine();
        } catch (Exception e) {
            _sourceStr = null;
        }

        String _changeStr;
        try {
            _changeStr = in.nextLine();
        } catch (Exception e) {
            _changeStr = null;
        }

        res = reverse(_sourceStr, _changeStr);

        System.out.println(res);
    }
}
