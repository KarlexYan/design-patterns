abstract class Builder {
    public abstract void BuildPart();
    public abstract Product getResult();
}

class Builder1 extends Builder{
    Product product = new Product();

    @Override
    public void BuildPart() {
        product.Add("A");
        product.Add("B");
        product.Add("C");
        product.Add("D");
    }

    @Override
    public Product getResult() {
        return product;
    }
}

class Builder2 extends Builder{
    Product product = new Product();

    @Override
    public void BuildPart() {
        product.Add("A");
        product.Add("B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
