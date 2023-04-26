/*
*   工厂方法模式
*   意图：定义一个用于创建对象的接口，让子类决定实例化哪一个类。FactoryMethod使一个类的实例化延迟到其子类
* */
public class FactoryMethod {
    public static void main(String[] args) {
        Factory factoryA = new FactoryA();
        Product productA = factoryA.createProduct();
        productA.info();  // 产品的信息A

        Factory factoryB = new FactoryB();
        Product productB = factoryB.createProduct();
        productB.info(); // 产品的信息B
    }
}




