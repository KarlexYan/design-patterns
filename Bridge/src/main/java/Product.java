// 抽象产品，有name和color
abstract class Product {
    private String name;
    protected Color color;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // 抽象方法
    public abstract void Operation();
}

// 具体化产品
class ProductA extends Product{

    // 调用Color接口实现类方法
    @Override
    public void Operation() {
        color.OperationImpl(this.getName());
    }
}