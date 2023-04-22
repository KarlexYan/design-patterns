/*
*   适配器模式
*   意图：将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作
* */
public class AdapterPattern {
    public static void main(String[] args) {
        // 实例化目标接口的子类，也就是适配器
        Target target = new Adapter();
        // 使用目标接口对象调用原接口的方法
        target.Request(); //specific request
    }
}

// 目标接口
class Target{
    public void Request(){
        System.out.println("request");
    }
}

// 适配器
class Adapter extends Target{
    // 实例化原接口
    private Adaptee adaptee = new Adaptee();

    @Override
    public void Request() {
        // 调用原接口的方法
        adaptee.SpecificRequest();
    }
}

// 原接口（与目标接口不兼容，需要被适配）
class Adaptee{
    public  void SpecificRequest(){
        System.out.println("specific request");
    }
}


