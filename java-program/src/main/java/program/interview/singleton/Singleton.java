package program.interview.singleton;

public final class Singleton {

    private static Singleton singleton=null;

    private Singleton(){

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        if (singleton!=null){
            throw new CloneNotSupportedException("Clone object not supported");
        }
        return null;
    }

    public static Singleton getSingleton(){

        if(singleton==null){
            synchronized (Singleton.class) {
               if(singleton==null) {
                   singleton = new Singleton();
                   return singleton;
               }else {
                   return singleton;
               }
            }
        }

        return singleton;
    }

}
