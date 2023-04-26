interface ProductA {
    public void info();
}

class ProductA1 implements ProductA {
    @Override
    public void info() {
        System.out.println("产品的信息A1");
    }
}

class ProductA2 implements ProductA {
    @Override
    public void info() {
        System.out.println("产品的信息A2");
    }
}
