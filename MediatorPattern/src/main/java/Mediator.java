import java.util.ArrayList;
import java.util.List;

// 中介者
abstract class Mediator {
    // 要实现发送信息功能
    public abstract void sendMessage(Colleague colleague, String msg);
}

// 具体中介者
class ConcreteMediator extends Mediator {
    private ConcreteColleague1 concreteColleague1;
    private ConcreteColleague2 concreteColleague2;

    List<Colleague> colleagueList = new ArrayList<>();

    // 如有许多同事，可以使用Add()方法添加进去
    public void Add(Colleague colleague) {
        colleagueList.add(colleague);
    }

    // 设置交互双方
    public void setConcreteColleague1(ConcreteColleague1 concreteColleague1) {
        this.concreteColleague1 = concreteColleague1;
    }

    public void setConcreteColleague2(ConcreteColleague2 concreteColleague2) {
        this.concreteColleague2 = concreteColleague2;
    }

    // 发送信息，并提示对方收到信息
    @Override
    public void sendMessage(Colleague colleague, String msg) {
        if (colleague == concreteColleague1) {
            concreteColleague2.Notify(msg);

        } else if (colleague == concreteColleague2) {
            concreteColleague1.Notify(msg);
        }
    }
}