/*
*   代理模式
*   意图：为其他对象提供一种代理以控制这个对象的访问
* */
public class Main {
    public static void main(String[] args) {
        // 实例化真实主体
        RealSubject realSubject = new RealSubject();
        // 创建代理，将真实主体放进去
        Proxy proxy = new Proxy(realSubject);
        // 使用代理实现购买
        proxy.buy();
    }
}

