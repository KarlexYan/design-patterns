import java.util.List;

class File extends AbstractFile {

    public File(String name) {
        this.name = name;
    }

    // 文件下不可以添加和删除文件
    @Override
    public boolean Add(AbstractFile file) {
        return false;
    }

    @Override
    public boolean Remove(AbstractFile file) {
        return false;
    }

    @Override
    public List<AbstractFile> getChildren() {
        return null;
    }
}
