abstract class Handler {
    // 责任链指针
    protected Handler next;

    // 实现后继链
    public void setNext(Handler next) {
        this.next = next;
    }

    // 处理请求
    public abstract void HandlerRequest(int request);
}
