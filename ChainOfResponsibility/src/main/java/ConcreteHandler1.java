class ConcreteHandler1 extends Handler {
    // 处理者1，只能审批7以内
    @Override
    public void HandlerRequest(int request) {
        if (request <= 7) {
            System.out.println("1审批通过");
        } else {
            if (next != null) {
                next.HandlerRequest(request);
            } else {
                System.out.println("无法审批");
            }
        }
    }
}
