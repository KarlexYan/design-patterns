import java.util.ArrayList;
import java.util.List;

public class Product {
    // 部件的组成部分
    List<String> parts = new ArrayList<>();

    // 往部件里添加零件
    public void Add(String part){
        parts.add(part);
    }

    // 展示部件的组成成分
    public void show(){
        System.out.print("产品的组成有：");
        parts.forEach(s -> System.out.print(s + " "));
        System.out.println();
    }
}
