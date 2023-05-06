// 请求者
class Invoker {
    private Command command; // 命令对象

    public void setCommand(Command command) {  //设置请求者的请求命令
        this.command = command;
    }

    public void call() { // 调用
        command.Execute();
    }
}
