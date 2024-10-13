package program.interview.singleton;

public class SingletonMain {

    public static void main(String[] args) throws CloneNotSupportedException {
        Singleton singleton=Singleton.getSingleton();
        Object singleton1=Singleton.getSingleton();

        System.out.println("singleton :"+singleton+" ,singleton1 "+singleton1);
        System.out.println(singleton1==singleton);
    }
}
