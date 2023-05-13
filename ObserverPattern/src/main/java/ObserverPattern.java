import java.util.ArrayList;
import java.util.List;

/*
 *   观察者模式
 *   意图：定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新
 * */
public class ObserverPattern {
    public static void main(String[] args) {
        // 创建目标
        Subject subject1 = new ConcreteSubject("UP主");
        // 创建观察者，并指定要绑定的目标
        Observer observer1 = new ConcreteObserver("张三", subject1);
        Observer observer2 = new ConcreteObserver("李四", subject1);
        // 目标变更状态，将自动触发通知
        subject1.setState("已更新");
        /*
        * UP主的状态发生变化，变化后的状态为：已更新
          张三收到通知
          张三,改变后的状态为：已更新
          李四收到通知
          李四,改变后的状态为：已更新
        * */
        System.out.println("===================");

        // 移除观察者张三，再变更状态
        subject1.Detach(observer1);
        subject1.setState("宣布停更");
        /*
        * UP主的状态发生变化，变化后的状态为：宣布停更
          李四收到通知
          李四,改变后的状态为：宣布停更
        * */
    }
}



