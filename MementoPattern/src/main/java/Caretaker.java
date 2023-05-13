import java.util.ArrayList;
import java.util.List;

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
