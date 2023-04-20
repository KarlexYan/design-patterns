/*
 *   原型模式
 *   意图：用原型实例指定创建对象的种类，并且通过复制这些原型创建新的对象
 * */
public class Main {
    public static void main(String[] args) {
        // 创建产品，赋予id和price
        Product product1 = new Product(2023, 5.28);
        System.out.println(product1);
        System.out.println(product1.getId() + " " + product1.getPrice());

        // 克隆产品
        Product product2 = (Product) product1.Clone();
        System.out.println(product2);
        System.out.println(product2.getId() + " " + product2.getPrice());
    }
}
