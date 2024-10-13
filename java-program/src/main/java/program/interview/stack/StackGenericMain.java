package program.interview.stack;

public class StackGenericMain {

    public static void main(String[] args) {
        StackGeneric<String> stackGeneric=new StackGeneric<>(5);

        System.out.println("Is stack empty : "+stackGeneric.isEmpty());
        System.out.println("Is stack full : "+stackGeneric.isFull());

        stackGeneric.push("Ram");
        stackGeneric.push("Shyam");
        stackGeneric.push("Ramu");
        stackGeneric.push("Vivek");
        stackGeneric.push("Ratan");
        stackGeneric.push("Jiva");

        System.out.println("Stack Peek data : "+stackGeneric.peek());
        System.out.println("Stack pop data : "+stackGeneric.pop());
        System.out.println("Stack Peek data : "+stackGeneric.peek());
    }
}
