// 命令接口
interface Command {
    public void Execute();  // 执行命令
}

// 关机命令
class OffCommand implements Command {
    private Television television;

    public OffCommand(Television television) {
        this.television = television;
    }

    // 执行关机命令
    @Override
    public void Execute() {
        television.OffAction();
    }
}

// 开机命令
class OnCommand implements Command {
    private Television television;

    public OnCommand(Television television) {
        this.television = television;
    }

    // 执行开机命令
    @Override
    public void Execute() {
        television.OnAction();
    }
}
