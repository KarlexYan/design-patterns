/*
*   单例模式
*   意图：保证一个类仅有一个实例，并提供一个访问它的全局访问点
* */
public class SingletonPattern {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1); //Singleton@3b07d329

        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2); //Singleton@3b07d329

        Singleton singleton3 = Singleton.getInstance();
        System.out.println(singleton3); //Singleton@3b07d329
    }
}

class Singleton{
    private static Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance() {
        return instance;
    }
}
