/*
 *  简单工厂模式
 * */
public class SimpleFactory {
    public static void main(String[] args) {
        Product productA = Factory.createProduct("A");
        productA.info(); // 产品的信息A

        Product productB = Factory.createProduct("B");
        productB.info(); // 产品的信息B

        Product productC = Factory.createProduct("C");
        productC.info(); // 没有C这个类型的产品
    }
}


