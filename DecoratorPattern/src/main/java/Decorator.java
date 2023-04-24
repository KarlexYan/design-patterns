abstract class Decorator extends Person {
    // 指向Person对象的指针
    protected Person person;

}

class DecoratorA extends Decorator {
    // 构造函数，在实例化装饰器时放入对象
    public DecoratorA(Person person) {
        this.person = person;
    }

    // 在对象原有职责上添加职责
    @Override
    public void Operation() { // 添加职责
        person.Operation();  // 原本的职责
        System.out.println("写作业");
    }
}

class DecoratorB extends Decorator{
    // 构造函数，在实例化装饰器时放入对象
    public DecoratorB(Person person){
        this.person = person;
    }

    // 在对象原有职责上添加职责
    @Override
    public void Operation() { // 添加职责
        person.Operation();
        System.out.println("做家务");
    }
}