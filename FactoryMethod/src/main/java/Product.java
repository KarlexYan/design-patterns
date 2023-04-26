interface Product {
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