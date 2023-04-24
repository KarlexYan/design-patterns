abstract class Person {
    protected String name;

    public abstract void Operation(); // 职责
}

class Student extends Person {
    // 构造方法，在实例化对象时赋予名字
    public Student(String name) {
        this.name = name;
    }

    // 具体职责
    @Override
    public void Operation() {
        System.out.println(name + "的职责：学习 ");
    }
}