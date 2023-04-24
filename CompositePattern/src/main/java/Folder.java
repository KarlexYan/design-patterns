import java.util.ArrayList;
import java.util.List;

class Folder extends AbstractFile {
    private List<AbstractFile> childrenList = new ArrayList<>();


    public Folder(String name) {
        this.name = name;
    }

    @Override
    public boolean Add(AbstractFile file) {
        return childrenList.add(file);
    }

    @Override
    public boolean Remove(AbstractFile file) {
        return childrenList.remove(file);
    }

    @Override
    public List<AbstractFile> getChildren() {
        return childrenList;
    }
}
