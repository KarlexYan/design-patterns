/*
 *   策略模式
 *   意图：定义一系列的算法，把它们一个个封装起来，并且使它们可以相互替换。此模式使得算法可以独立于使用它们的客户而变化。
 * */
public class StrategyPattern {
    public static void main(String[] args) {
        // 创建策略
        Strategy addStrategy = new AddStrategy();
        Strategy subStrategy = new SubStrategy();
        Strategy multiStrategy = new MultiStrategy();

        // 使用不同策略计算10和5
        new OperationContext(addStrategy).Operation(10, 5); // 10 + 5 = 15
        new OperationContext(subStrategy).Operation(10, 5); // 10 - 5 = 5
        new OperationContext(multiStrategy).Operation(10, 5); // 10 x 5 = 50
    }
}

