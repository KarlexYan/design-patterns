// 抽象同事类
abstract class Colleague {
    protected Mediator mediator;
}

// 具体同事1
class ConcreteColleague1 extends Colleague {
    // 在初始化时放入中介者
    public ConcreteColleague1(Mediator mediator) {
        this.mediator = mediator;
    }

    // 实现发送信息
    public void sendMessage(String msg) {
        mediator.sendMessage(this, msg);
    }

    // 提示收到信息
    public void Notify(String msg) {
        System.out.println("同事1收到消息：" + msg);
    }

}

// 具体同事2
class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        this.mediator = mediator;
    }

    public void sendMessage(String msg) {
        mediator.sendMessage(this, msg);
    }

    public void Notify(String msg) {
        System.out.println("同事2收到消息：" + msg);
    }
}
