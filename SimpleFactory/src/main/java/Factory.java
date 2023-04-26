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
