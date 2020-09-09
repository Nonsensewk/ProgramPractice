package program;

import java.util.ArrayList;
import java.util.List;

//无重复字符串的排列组合，输入：“”“”“"qwe",输出；”"qwe,qew,weq,qwe,eqw,ewq.
public class Permutation {//全排列
    private static List<String> permu(String s){
        List<String> res = new ArrayList<>();
        helper(res,new StringBuilder(),s);
        return  res;
    }

    private static void helper(List<String> res,StringBuilder sb,String s){
        if(sb.length()==s.length()){
            res.add(sb.toString());
            return;
        }
        for(int i=0;i<s.length();i++){
            if(sb.toString().indexOf(s.charAt(i)) != -1) continue;
            sb.append(s.charAt(i));
            helper(res,sb,s);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(permu("abc"));


    }
}
