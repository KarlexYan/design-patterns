/*
*   工厂方法模式
*   意图：定义一个用于创建对象的接口，让子类决定实例化哪一个类。FactoryMethod使一个类的实例化延迟到其子类
* */
public class FactoryMethod {
    public static void main(String[] args) {
        Factory factoryA = new FactoryA();
        Product productA = factoryA.createProduct();
        productA.info();

        Factory factoryB = new FactoryB();
        Product productB = factoryB.createProduct();
        productB.info();
    }
}

interface Product{
    public void info();
}

class ProductA implements Product{

    @Override
    public void info() {
        System.out.println("产品的信息A");
    }
}

class ProductB implements Product{

    @Override
    public void info() {
        System.out.println("产品的信息B");
    }
}

interface Factory{
    public Product createProduct();
}

class FactoryA implements Factory{

    @Override
    public Product createProduct() {
        return new ProductA();
    }
}

class FactoryB implements Factory{

    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
