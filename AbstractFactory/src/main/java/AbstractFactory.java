/*
*   抽象工厂模式
*   意图：提供一个创建一系列相关或相互依赖的对象的接口，而无须指定他们具体的类
* */
public class AbstractFactory {
    public static void main(String[] args) {
        Factory factory1 = new Factory1();
        Factory factory2 = new Factory2();

        // 创建工厂1里的产品A，对应A1
        ProductA productA1 = factory1.createProductA();
        productA1.info();
        // 创建工厂1里的产品B，对应B1
        ProductB productB1 = factory1.createProductB();
        productB1.info();

        // 创建工程2里的产品A，对应A2
        ProductA productA2 = factory2.createProductA();
        productA2.info();
        // 创建工程2里的产品B，对应B2
        ProductB productB2 = factory2.createProductB();
        productB2.info();
    }
}

