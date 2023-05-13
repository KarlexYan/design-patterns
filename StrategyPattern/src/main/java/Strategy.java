// 策略接口
interface Strategy {
    public void TwoNumberOperation(int x, int y);
}

// 加法策略
class AddStrategy implements Strategy {

    @Override
    public void TwoNumberOperation(int x, int y) {
        System.out.println(x + " + " + y + " = " + (x + y));
    }
}

// 减法策略
class SubStrategy implements Strategy {

    @Override
    public void TwoNumberOperation(int x, int y) {
        System.out.println(x + " - " + y + " = " + (x - y));
    }
}

// 乘法策略
class MultiStrategy implements Strategy {

    @Override
    public void TwoNumberOperation(int x, int y) {
        System.out.println(x + " x " + y + " = " + (x * y));
    }
}
