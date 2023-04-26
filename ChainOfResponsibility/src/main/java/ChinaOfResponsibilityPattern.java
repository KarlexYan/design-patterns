public class ChinaOfResponsibilityPattern {
    public static void main(String[] args) {
        // 实例化处理者对象
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        // 设置后继链
        handler1.setNext(handler2);
        handler2.setNext(handler3);

        // 分别处理 7 15 30 31
        handler1.HandlerRequest(7);   // 1审批通过
        handler1.HandlerRequest(15);  // 2审批通过
        handler1.HandlerRequest(30);  // 3审批通过
        handler1.HandlerRequest(31);  // 审批失败
    }

}

