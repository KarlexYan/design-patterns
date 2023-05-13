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
