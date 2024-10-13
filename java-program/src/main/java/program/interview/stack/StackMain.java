package program.interview.stack;

public class StackMain {

    public static void main(String[] args) {
        StackDemo stackDemo=new StackDemo(5);
        System.out.println("Is stack empty : "+stackDemo.isEmpty());
        System.out.println("Is stack full : "+stackDemo.isFullStack());

        stackDemo.push(5);
        stackDemo.push(4);
        stackDemo.push(3);
        stackDemo.push(2);
        stackDemo.push(1);
        stackDemo.push(10);

        System.out.println("Stack Peek data : "+stackDemo.peek());
        System.out.println("Stack pop data : "+stackDemo.pop());
    }
}
