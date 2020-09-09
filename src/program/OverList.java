package program;
//输入一个链表，按链表从尾到头的顺序返回一个ArrayList。   使用栈进行反转操作。
import java.util.ArrayList;
import java.util.Stack;
public class OverList {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode == null){
            ArrayList<Integer> list = new ArrayList<Integer>();
            return list;
        }
        Stack<Integer> stack = new Stack<Integer>();
        while(listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(!stack.isEmpty()){
            arr.add(stack.pop());
        }
        return arr;
    }

    public static void main(String[] args) {

    }
}
class ListNode{
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}