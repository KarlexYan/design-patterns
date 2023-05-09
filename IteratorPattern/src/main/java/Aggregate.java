import java.util.ArrayList;
import java.util.List;

// 聚合对象接口
interface Aggregate {
    // 创建迭代器
    public Iterator CreateIterator();
}

// 实现聚合对象BookAggregate
class BookAggregate implements Aggregate {
    private List<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        bookList.add(book);
    }

    public Book getBook(int index) {
        return bookList.get(index);
    }

    public int getSize() {
        return bookList.size();
    }

    @Override
    public Iterator CreateIterator() {
        return new BookIterator(this);
    }
}