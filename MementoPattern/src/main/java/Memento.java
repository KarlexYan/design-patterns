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
