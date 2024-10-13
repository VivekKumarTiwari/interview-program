package program.interview.stack;

public class StackGeneric <T>{

    private  int capacity;
    private int top;
    private T[] stackArr;

    public StackGeneric(int capacity){
        this.capacity=capacity;
        this.stackArr= (T[]) new Object[capacity];
        this.top=-1;
    }

    public void push(T data){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        stackArr[++top]=data;
    }

    public T pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        return stackArr[top--];
    }

    public T peek(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        return stackArr[top];
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
        return top==capacity-1;
    }
}
