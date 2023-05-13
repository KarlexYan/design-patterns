abstract class Person {
    // 模板方法
    public void TemplateMethod() {
        System.out.println("上课，去教室");
        // 调用原语操作1，不同对象有不同行为
        PrimitiveOperation1();
        System.out.println("下课，离开教室");
        // 调用原语操作2，不同对象有不同行为
        PrimitiveOperation2();
    }

    // 指定模板方法
    public abstract void PrimitiveOperation1(); // 原语操作1：上课过程-->学生听课 老师讲课

    public abstract void PrimitiveOperation2(); // 原语操作2：作业-->学生提交作业 老师批改作业
}

class Student extends Person {

    @Override
    public void PrimitiveOperation1() {
        System.out.println("学生听课");
    }

    @Override
    public void PrimitiveOperation2() {
        System.out.println("学生提交作业");
    }
}

class Teacher extends Person {

    @Override
    public void PrimitiveOperation1() {
        System.out.println("老师讲课");
    }

    @Override
    public void PrimitiveOperation2() {
        System.out.println("老师批改作业");
    }
}

