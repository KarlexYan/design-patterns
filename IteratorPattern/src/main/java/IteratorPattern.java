import java.util.ArrayList;
import java.util.List;

public class IteratorPattern {
    public static void main(String[] args) {
        BookAggregate bookAggregate = new BookAggregate();

        String[] books = {"数据结构", "软件工程", "操作系统", "计算机网络", "计算机组成原理"};
        double[] prices = {10.24, 20.48, 40.96, 81.92};

        for (int i = 0; i < 4; i++) {
            bookAggregate.addBook(new Book(books[i], prices[i]));
        }

        Iterator iterator = bookAggregate.CreateIterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName() + " " + book.getPrice());
        }
    }
}




