// 定义颜色接口
interface Color {
    public void OperationImpl(String name);
}

// 蓝色实现类
class Blue implements Color{

    @Override
    public void OperationImpl(String name) {
        System.out.println(name + "：蓝色");
    }
}
// 红色实现类
class Red implements Color{

    @Override
    public void OperationImpl(String name) {
        System.out.println(name + "：红色");
    }
}