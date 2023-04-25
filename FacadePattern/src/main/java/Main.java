/*
 *   外观模式
 *   意图：为了系统中的一组接口提供一个一致的界面，Facade模式定义了一个高层接口，这个接口使得这一子系统更加容易使用
 * */
public class Main {
    public static void main(String[] args) {
        // 实例化主系统
        Facade facade = new Facade();
        // 调用方案ABC
        facade.methodA(); // 子系统一的功能
        facade.methodB(); // 子系统二的功能
        facade.methodC(); // 子系统三的功能

        facade.method(); // 子系统一二三的功能
    }
}

