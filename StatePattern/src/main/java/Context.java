// 贩卖机
class Context {
    private int count;
    // 需要维护一个ConcreteState子类的实例，这个实例定义当前状态
    private State state;

    public Context() {
        // 初始化货物数量为2个，状态设定为有货
        count = 2;
        state = new StateA();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    // 请求购买一个饮料
    public void Request() {
        state.Handle(this);
    }
}
