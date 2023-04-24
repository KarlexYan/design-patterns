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








