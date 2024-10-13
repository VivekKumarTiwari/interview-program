package program.interview.stack;

public class StackDemo {

    private int capacity;
    private int[] stackArray;
    private int top;

    public StackDemo(int capacity){
        this.capacity=capacity;
        stackArray=new int[capacity];
        this.top=-1;
    }

    public void push(int data){
        if(top==capacity-1){
            System.out.println("Stack is full");
            return;
        }
        stackArray[++top]=data;
    }

    public int pop(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }

        return stackArray[top];
    }

    public boolean isFullStack(){
        return top==capacity-1;
    }

    public boolean isEmpty(){
        return top==-1;
    }
}
