package TheCompleteReference;
class Stack {
    int[] stack=new int[10];
    int tos;
    Stack() {
        tos=-1;
    }
    public void push(int item) {
        if(tos==9) {
            System.out.println("Stack overflow");
        }
        else {
            stack[++tos]=item;
        }
    }
    public int pop() {
        if(tos>=0) {
            return stack[tos--];
        }
        else {
            System.out.println("Stack Underflow");
            return 0;
        }
    }
}
public class StackUsingArray {
    public static void main(String[] args) {
        Stack obj1 = new Stack();
        for(int i=0;i<=10;i++) obj1.push(i);
        for (int i=0;i<=10;i++) System.out.println(obj1.pop());
    }
}
