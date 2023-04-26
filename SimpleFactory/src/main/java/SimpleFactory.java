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

class Factory {
    public static Product createProduct(String type) {
        Product product = null;

        switch (type) {
            case "A":
                product = new ProductA();
                break;
            case "B":
                product = new ProductB();
                break;
            default:
                System.out.println("没有" + type + "这个类型的产品");
                break;
        }

        return product;
    }
}

abstract class Product {
    public abstract void info();
}

class ProductA extends Product {

    @Override
    public void info() {
        System.out.println("产品的信息A");
    }
}

class ProductB extends Product {

    @Override
    public void info() {
        System.out.println("产品的信息B");
    }
}
