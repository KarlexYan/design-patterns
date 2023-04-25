/*
*   装饰器模式
*   意图：动态地给一个对象添加一些额外的职责。就增加功能而言，Decorator模式比生成子类更加灵活
* */
public class Main {
    public static void main(String[] args) {
        // 创建对象，命名张三
        Person zhangsan = new Student("张三");
        // 打印张三的职责
        zhangsan.Operation(); // 张三的职责：学习

        System.out.println("===================");

        // 给张三赋予新的职责
        zhangsan = new DecoratorA(zhangsan);
        zhangsan = new DecoratorB(zhangsan);
        // 再次打印张三的职责
        zhangsan.Operation();  // 张三的职责：学习 写作业 做家务
    }
}








