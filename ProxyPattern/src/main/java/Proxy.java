class Proxy implements Subject {
    // 指向真实主体
    protected RealSubject realSubject;

    // 在实例化代理时将真实主体传入
    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    // 实现代理
    @Override
    public void buy() {
        preBuy();
        realSubject.buy();
        afterBuy();
    }

    public void preBuy(){
        System.out.println("购买前的手续");
    }

    public void afterBuy(){
        System.out.println("购买后的手续");
    }
}
