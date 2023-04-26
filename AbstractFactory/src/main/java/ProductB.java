interface ProductB {
    public void info();
}

class ProductB1 implements ProductB {
    @Override
    public void info() {
        System.out.println("产品的信息B1");
    }
}

class ProductB2 implements ProductB {
    @Override
    public void info() {
        System.out.println("产品的信息B2");
    }
}
