import java.util.ArrayList;
import java.util.List;

class PersonStructure {
    private List<Person> personList = new ArrayList<>();

    public PersonStructure() {
        personList.add(new Student("张三"));
        personList.add(new Student("李四"));
        personList.add(new Student("王五"));

        personList.add(new Teacher("张老师"));
        personList.add(new Teacher("李老师"));
        personList.add(new Teacher("王老师"));
    }

    public void Accept(Visitor visitor) {
        for (Person person : personList) {
            person.Accept(visitor);
        }
    }
}
