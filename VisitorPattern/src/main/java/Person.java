abstract class Person {
    public String name;

    public abstract void Accept(Visitor visitor);
}

class Student extends Person {

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void Accept(Visitor visitor) {
        visitor.visitStudent(this);
    }
}

class Teacher extends Person {

    public Teacher(String name){
        this.name = name;
    }

    @Override
    public void Accept(Visitor visitor) {
        visitor.visitTeacher(this);
    }
}