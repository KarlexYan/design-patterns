import java.util.List;

abstract class AbstractFile {
    protected String name;

    public void printName() {
        System.out.println(name);
    }

    // 添加组件
    public abstract boolean Add(AbstractFile file);

    // 移除组件
    public abstract boolean Remove(AbstractFile file);

    // 遍历文件夹下的子组件集合
    public abstract List<AbstractFile> getChildren();
}
