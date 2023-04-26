class ConcreteHandler3 extends Handler {
    // 处理者1，只能审批30以内
    @Override
    public void HandlerRequest(int request) {
        if (request <= 30) {
            System.out.println("3审批通过");
        } else {
            if (next != null) {
                next.HandlerRequest(request);
            } else {
                System.out.println("审批失败");
            }
        }
    }
}
