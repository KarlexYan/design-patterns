// 迭代器接口
interface Iterator {
    public boolean hasNext();

    public Object next();
}

// 实现迭代器接口BookIterator
class BookIterator implements Iterator {
    private int index;
    private BookAggregate bookAggregate;

    // 构造迭代器时，放入聚合对象，并定义一个为0的索引
    public BookIterator(BookAggregate bookAggregate) {
        this.index = 0;
        this.bookAggregate = bookAggregate;
    }

    // 判断是否有下一个
    @Override
    public boolean hasNext() {
        if (index < bookAggregate.getSize()) {
            return true;
        }
        return false;
    }

    // 获取下一个的对象
    @Override
    public Object next() {
        Object obj = bookAggregate.getBook(index);
        index++;
        return obj;
    }
}