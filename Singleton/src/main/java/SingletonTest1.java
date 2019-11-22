public class SingletonTest1 {
    public static void main(String[] args) {
        System.out.println(Singleton.getNewInstance());
    }
}

class Singleton{
    private static final Singleton newInstance=new Singleton();

    private Singleton(){

    }

    public static Singleton getNewInstance(){
        return newInstance;
    }
}
