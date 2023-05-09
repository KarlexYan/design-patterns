import javax.print.attribute.standard.Media;
import java.util.ArrayList;
import java.util.List;

/*
 *   中介者模式
 *   意图：用一个中介对象来封装一系列的对象交互。中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。
 * */
public class MediatorPattern {
    public static void main(String[] args) {
        // 创建中介者
        ConcreteMediator mediator = new ConcreteMediator();
        // 创建同事
        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);
        // 在中介者中设置双方
        mediator.setConcreteColleague1(colleague1);
        mediator.setConcreteColleague2(colleague2);
        // 实现互发信息
        colleague1.sendMessage("在吗？");  // 同事2收到消息：在吗？
        colleague2.sendMessage("做咩鸠啊？"); // 同事1收到消息：做咩鸠啊？
    }
}



