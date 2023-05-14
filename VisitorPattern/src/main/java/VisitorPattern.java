import java.util.ArrayList;
import java.util.List;

/*
 *   访问者模式
 *   意图：表示一个作用与某对象结构中的各元素的操作。它允许在不改变各元素的类的前提下定义作用于这些元素的新操作。
 * */
public class VisitorPattern {
    public static void main(String[] args) {
        PersonStructure structure = new PersonStructure();
        ConcreteVisitor1 visitor1 = new ConcreteVisitor1();

        System.out.println("访问者1的访问记录：");
        structure.Accept(visitor1);
        /*
        * 访问者1访问学生：张三
          访问者1访问学生：李四
          访问者1访问学生：王五
          访问者1访问老师：张老师
          访问者1访问老师：李老师
          访问者1访问老师：王老师
        * */

        System.out.println("==========================");

        ConcreteVisitor2 visitor2 = new ConcreteVisitor2();
        System.out.println("访问者2的访问记录：");
        structure.Accept(visitor2);
        /*
        * 访问者2访问学生：张三
          访问者2访问学生：李四
          访问者2访问学生：王五
          访问者2访问老师：张老师
          访问者2访问老师：李老师
          访问者2访问老师：王老师
        * */
    }
}



