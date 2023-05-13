// 观察者接口
interface Observer {
    // 收到通知，更新观察者的状态
    public void Update();
}

// 具体观察者
class ConcreteObserver implements Observer {
    private String state;
    private String name;
    // 私有化变量，指向目标
    private Subject subject;
    public ConcreteObserver(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
        // 从目标的列表中添加本观察者
        subject.Attach(this);
        // 设置观察者与目标的状态保持一致
        state = subject.getState();
    }

    @Override
    public void Update() {
        // 触发更新，提醒收到更新
        System.out.println(name + "收到通知");
        // 让当前观察者与目标改变后的状态保持一致
        state = subject.getState();
        System.out.println(name + ",改变后的状态为：" + state);

    }
}