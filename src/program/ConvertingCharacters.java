package program;

import java.util.Arrays;

//转化字符串中字符。大写转化成小写.
public class ConvertingCharacters {

    public static char[] helper(String str){
        char[] s = str.toCharArray();
        for(int i=0;i<s.length;i++){
            if(s[i]<='Z'&&s[i]>='A'){
                s[i]+=32;
                continue;
            }
            if(s[i]<='z'&&s[i]>='a'){
                s[i]-=32;
               // continue;
            }
        }
//        for(int j=0;j<s.length;j++){
//            if(s[j]<='z'&&s[j]>='a'){
//                s[j]-=32;
//            }
//        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(helper("ABCDGFJUbaihcoOOHCOgoucgsuIH"));

    }

}
