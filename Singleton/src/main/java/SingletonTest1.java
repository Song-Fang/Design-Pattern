public class SingletonTest1 {
    public static void main(String[] args) {
        System.out.println(Singleton1.getNewInstance());
        System.out.println(Singleton2.getNewInstance());
        //Singleton3 singleton1 = Singleton3.getNewInstance();
        //Singleton3 singleton2 = Singleton3.getNewInstance();
        //Singleton4 singleton1 = Singleton4.getNewInstance();
        //Singleton4 singleton2 = Singleton4.getNewInstance();
        //Singleton5 singleton1 = Singleton5.getNewInstance();
        //Singleton5 singleton2 = Singleton5.getNewInstance();
        //Singleton6 singleton1 = Singleton6.getNewInstance();
        //Singleton6 singleton2 = Singleton6.getNewInstance();
        Singleton7 singleton1 = Singleton7.INSTANCE;
        Singleton7 singleton2 = Singleton7.INSTANCE;
        System.out.println(singleton1==singleton2);


    }
}

class Singleton1{
    private static final Singleton1 newInstance=new Singleton1();

    private Singleton1(){

    }

    public static Singleton1 getNewInstance(){
        return newInstance;
    }
}

class Singleton2{

    private static Singleton2 newInstance;
    private Singleton2(){

    }

    static {
        newInstance = new Singleton2();
    }

    public static Singleton2 getNewInstance(){
        return newInstance;
    }

}

class Singleton3{
    private static Singleton3 newInstance;
    private Singleton3(){

    }

    public static Singleton3 getNewInstance(){
        if(newInstance==null){
            newInstance = new Singleton3();
            return newInstance;
        }else{
            return newInstance;
        }
    }
}

class Singleton4{
    private static Singleton4 newInstance;
    private Singleton4(){

    }

    public synchronized static Singleton4 getNewInstance(){
        if(newInstance==null){
            newInstance = new Singleton4();
            return newInstance;
        }else{
            return newInstance;
        }
    }
}

class Singleton5{
    private static volatile Singleton5 newInstance;

    private Singleton5(){

    }

    public static Singleton5 getNewInstance(){
        if(newInstance==null){
            synchronized (Singleton5.class){
                if(newInstance==null){
                    newInstance = new Singleton5();
                    return newInstance;
                }else{
                    return newInstance;
                }
            }
        }else{
            return newInstance;
        }
    }
}


class Singleton6{

    private Singleton6(){

    }

    private static class SingletonInstance{
        private final static  Singleton6 newInstance = new Singleton6();
    }

    public static Singleton6 getNewInstance(){
        return SingletonInstance.newInstance;
    }
}

enum Singleton7{
    INSTANCE;
}

