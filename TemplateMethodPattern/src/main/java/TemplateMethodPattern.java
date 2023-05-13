/*
*   模板方法模式
*   意图：定义一个操作的算法骨架，而将一些步骤延迟到子类中。TemplateMethod使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤
* */
public class TemplateMethodPattern {
    public static void main(String[] args) {
        // 创建老师学生对象
        Person student = new Student();
        Person teacher = new Teacher();

        // 调用学生的模板方法
        student.TemplateMethod();
        /*
        * 上课，去教室
          学生听课
          下课，离开教室
          学生提交作业
        * */

        System.out.println("======================");

        // 调用老师的模板方法
        teacher.TemplateMethod();
        /*
        * 上课，去教室
          老师讲课
          下课，离开教室
          老师批改作业
        * */
    }
}

