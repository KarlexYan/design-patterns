import java.util.ArrayList;
import java.util.List;

// 目标接口
interface Subject {
    // 添加观察者
    public void Attach(Observer observer);

    // 删除观察者
    public void Detach(Observer observer);

    // 状态改变后，通知所有观察者
    public void Notify();

    // 设置状态
    public void setState(String state);

    // 获取状态
    public String getState();
}

// 具体目标
class ConcreteSubject implements Subject {
    private String name;
    // 存储状态
    private String state;

    // 存储观察者，相当于Up主的粉丝列表
    private List<Observer> observerList;

    // 实例化目标时，初始状态为未更新，并创建一个观察者列表
    public ConcreteSubject(String name) {
        state = "未更新";
        this.name = name;
        observerList = new ArrayList<>();
    }

    @Override
    public void setState(String state) {
        this.state = state;
        // 改变状态后立刻通知
        System.out.println(name + "的状态发生变化，变化后的状态为：" + state);
        Notify();
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public void Attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void Detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void Notify() {
        // 遍历调用列表所有观察者的Update()方法
        for (Observer observer : observerList) {
            observer.Update();
        }
    }
}
