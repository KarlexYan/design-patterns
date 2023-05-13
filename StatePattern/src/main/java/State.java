// 状态接口
interface State {
    // 根据Context的状态进行处理
    public void Handle(Context context);
}

// 实现状态，有货
class StateA implements State {

    @Override
    public void Handle(Context context) {
        // 获取贩卖机的货物数量
        int count = context.getCount();
        // 如果有货，购买成功，货物数-1
        if (count >= 1) {
            System.out.println("购买成功");
            context.setCount(count - 1);
            // 如果货物数量刚好变为0，改变状态为无货状态
            if (context.getCount() == 0){
                context.setState(new StateB());
            }
        }else {
            System.out.println("购买失败");
        }
    }
}

// 实现状态，无货
class StateB implements State {

    @Override
    public void Handle(Context context) {
        // 获取贩卖机的货物数量
        int count = context.getCount();
        // 因为无货，提示失败
        if (count == 0){
            System.out.println("购买失败！等待补货");
        }

        // 补货
        context.setCount(2);
        System.out.println("补货成功，请重新购买");
        context.setState(new StateA());
    }
}