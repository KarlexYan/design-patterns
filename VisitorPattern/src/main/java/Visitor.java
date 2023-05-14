interface Visitor {
    public void visitStudent(Student student); // 访问学生

    public void visitTeacher(Teacher teacher); // 访问老师
}

// 访问者1
class ConcreteVisitor1 implements Visitor {

    @Override
    public void visitStudent(Student student) {
        System.out.println("访问者1访问学生："+student.name);
    }

    @Override
    public void visitTeacher(Teacher teacher) {
        System.out.println("访问者1访问老师：" + teacher.name);
    }
}

// 访问者2
class ConcreteVisitor2 implements Visitor {

    @Override
    public void visitStudent(Student student) {
        System.out.println("访问者2访问学生："+student.name);
    }

    @Override
    public void visitTeacher(Teacher teacher) {
        System.out.println("访问者2访问老师：" + teacher.name);
    }
}
