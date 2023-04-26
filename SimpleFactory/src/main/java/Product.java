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