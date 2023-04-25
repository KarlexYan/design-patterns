// 主系统
class Facade {
    // 创建子系统对象
    SubSystem1 subSystem1;
    SubSystem2 subSystem2;
    SubSystem3 subSystem3;

    // 在实例化主系统对象时，把子系统也实例化
    public Facade() {
        subSystem1 = new SubSystem1();
        subSystem2 = new SubSystem2();
        subSystem3 = new SubSystem3();
    }

    // 方案A，调用子系统一
    public void methodA() {
        subSystem1.method1();
    }

    // 方案B，调用子系统二
    public void methodB() {
        subSystem2.method2();
    }

    // 方案C，调用子系统三
    public void methodC() {
        subSystem3.method3();
    }
    // 一次调用所有子系统
    public void method(){
        subSystem1.method1();
        subSystem2.method2();
        subSystem3.method3();
    }
}
