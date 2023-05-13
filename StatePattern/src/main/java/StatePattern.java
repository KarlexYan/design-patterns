/*
 *   状态模式
 *   意图：允许一个对象在其内部状态改变时改变它的行为。对象看起来似乎修改了它的类。
 * */
public class StatePattern {
    public static void main(String[] args) {
        // 创建一台贩卖机
        Context context = new Context();

        // 请求购买
        context.Request();  // 购买成功 count = 1
        context.Request();  // 购买成功 count = 0
        context.Request();  // 购买失败！等待补货  补货成功，请重新购买
        context.Request();  // 购买成功 count = 1
    }
}

