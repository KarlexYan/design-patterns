interface Prototype {
    public Object Clone();
}

class Product implements Prototype{
    private int id;
    private double price;

    public Product() {
    }

    public Product(int id,double price){
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public Object Clone() {
        Product product = new Product();
        product.id = this.id;
        product.price = this.price;
        return product;
    }
}
