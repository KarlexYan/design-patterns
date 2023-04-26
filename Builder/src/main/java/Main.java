/*
*   生成器模式
*   意图：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
* */
public class Main {
    public static void main(String[] args) {
        // 创建建造者
        Director director = new Director();
        // 创建部件方案1
        Builder1 builder1 = new Builder1();

        // 建造者建造部件1
        director.Construct(builder1);
        // 获取产品，打印产品结果
        Product product1 = builder1.getResult();
        product1.show(); // 产品的组成有：A B C D

        Builder2 builder2 = new Builder2();
        director.Construct(builder2);
        Product product2 = builder2.getResult();
        product2.show(); // 产品的组成有：A B
    }
}
