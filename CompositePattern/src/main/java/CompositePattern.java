import java.util.ArrayList;
import java.util.List;

/*
 *   组合模式
 *   意图：将对象组合成树型结构以表示“部分-整体“的层次结构。Composite使得用户对单个对象和组合对象的使用具有一致性。
 * */
public class CompositePattern {
    public static void main(String[] args) {
        // 生成文件夹
        AbstractFile folderA = new Folder("folderA");
        // 生成文件
        AbstractFile fileA = new File("fileA");

        // 生成根目录
        AbstractFile root = new Folder("root");
        // 将文件夹和文件放进根目录中
        System.out.println(root.Add(folderA));
        System.out.println(root.Add(fileA));

        // 删除两次同一个文件
//        System.out.println(root.Remove(fileA));  //true
//        System.out.println(root.Remove(fileA));  //false

        print(root);
    }

    // 打印树型结构
    static void print(AbstractFile file) {
        file.printName();

        List<AbstractFile> childrenList = file.getChildren();

        // 递归打印组件
        if (childrenList == null) return;
        for (AbstractFile children : childrenList) {
            children.printName();
            print(children);
        }
    }

}

