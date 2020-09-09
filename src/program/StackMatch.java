package program;

import java.util.Stack;

//运用栈来解决实际问题
//1,符号匹配问题，输入“"({[])}  return false
public class StackMatch {
    public static boolean isMatching(String string){
        int length = string.length();
        Stack<Character> stack = new Stack<>();//创建stack对象
        if((length%2) != 0){
            return false;
        }
        for(int i=0;i<length;i++){
            char c = string.charAt(i);
            if((c=='{')||(c=='[')||(c=='(')){
                stack.push(c);//入栈
            }
            else {
                if(stack.isEmpty()){//判断首先出现的右侧元素。
                    return false;
                }
                if((c=='}')&&(stack.pop()!='{')){//出栈
                    return false;
                }
                if((c==']')&&(stack.pop()!='[')){
                    return false;
                }
                if((c==')')&&(stack.pop()!='(')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{{}}()";
        String s1 = "{{{((((}}}";
        System.out.println(isMatching(s));
        System.out.println(isMatching(s1));
    }
}
