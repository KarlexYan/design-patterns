/*
*   命令模式
*   意图：将一个请求封装成一个对象，从而使得可以用不同的请求对客户进行参数化；对请求排队或记录请求日志，以及支持可撤销的操作。
* */
public class CommandPattern {
    public static void main(String[] args) {
        // 实例化接收者（电视）
        Television television = new Television();

        // 命令对象 开机关机
        Command onCommand = new OnCommand(television);
        Command offCommand = new OffCommand(television);

        // 实例化请求者
        Invoker invoker = new Invoker();

        // 设置开机命令，请求
        invoker.setCommand(onCommand);
        invoker.call();  // 电视开机

        System.out.println("=================");

        // 设置关机命令，请求
        invoker.setCommand(offCommand);
        invoker.call();  // 电视关机
    }
}

