// 算术Context
class OperationContext {
    private Strategy strategy;

    // 实例化时指定策略
    public OperationContext(Strategy strategy) {
        this.strategy = strategy;
    }

    // 调用指定策略的计算方法
    public void Operation(int x, int y) {
        strategy.TwoNumberOperation(x, y);
    }
}
