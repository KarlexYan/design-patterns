import java.util.ArrayList;
import java.util.List;

/*
 *   备忘录模式
 *   意图：在不破坏封装性的前提下捕获一个对象的内部状态，并在对象之外保存这个状态。这样以后就可以将对象恢复到原先保存的状态。
 * */
public class MementoPattern {
    public static void main(String[] args) {
        // 实例化管理员和原发器
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();

        // 原发器设置状态，管理员创建备忘录，管理员将备忘录添加到列表中
        originator.setState("v1.0");
        Memento memento1 = originator.createMemento();
        caretaker.addMemento(memento1);

        originator.setState("v2.0");
        Memento memento2 = originator.createMemento();
        caretaker.addMemento(memento2);

        // 打印备忘录列表
        caretaker.showMemento(); // 第1次备份，状态为：v1.0  第1次备份，状态为：v2.0

        System.out.println("-------------------");
        // 恢复第一次备份
        Memento memento3 = caretaker.getMemento(1);
        originator.setMemento(memento3);
        // 获取原发器状态
        System.out.println(originator.getState()); // v1.0
    }
}

// 原发器
class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    // 创建备忘录
    public Memento createMemento() {
        return new Memento(state);
    }

    // 设置备忘录
    public void setMemento(Memento memento) {
        state = memento.getState();
    }
}

// 备忘录
class Memento {
    private String state;

    // 实例化备忘录时，要传入原发器状态
    public Memento(String state) {
        this.state = state;
    }

    // 获取备忘录存储的状态
    public String getState() {
        return state;
    }
}

// 管理者
class Caretaker {
    // 管理员创建一个数组存储备忘录
    private List<Memento> mementoList = new ArrayList<>();

    // 添加备忘录
    public void addMemento(Memento memento) {
        mementoList.add(memento);
    }

    // 根据索引获取指定备忘录
    public Memento getMemento(int index) {
        // 判断参数是否合法
        if (index >= 1 && index <= mementoList.size()) {
            return mementoList.get(index - 1);
        }
        return null;
    }

    // 拓展功能，打印备忘录列表
    public void showMemento() {
        // 表示第几次备份记录
        int count = 1;
        for (Memento memento : mementoList) {
            System.out.println("第" + count + "次备份，状态为：" + memento.getState());
            count++;
        }
    }
}
