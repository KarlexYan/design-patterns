/*
*   桥接模式
*   意图：将抽象部分与其实现部分分离，使它们都可以独立地变化。
* */
public class BridgePattern {
    public static void main(String[] args) {
        // 创建产品和颜色
        Product productA = new ProductA();
        Color red = new Red();

        // 设置产品名称颜色并打印信息
        productA.setName("productA");
        productA.setColor(red);
        productA.Operation(); //productA：红色

        // 创建产品和颜色
        Product productB = new ProductA();
        Color blue = new Blue();
        // 设置产品名称颜色并打印信息
        productB.setName("productB");
        productB.setColor(blue);
        productB.Operation(); //productB：蓝色
    }
}








