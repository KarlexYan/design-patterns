class ConcreteHandler2 extends Handler {
    // 处理者1，只能审批15以内
    @Override
    public void HandlerRequest(int request) {
        if (request <= 15) {
            System.out.println("2审批通过");
        } else {
            if (next != null) {
                next.HandlerRequest(request);
            } else {
                System.out.println("无法审批");
            }
        }
    }
}
