import java.util.HashSet;
import java.util.Set;

public class InterpreterPattern {
    public static void main(String[] args) {
        Context context = new Context();

        context.check("A区的开发人员"); // 识别成功
        context.check("B区的摸鱼人员"); // 识别失败
        context.check("C区的测试人员"); // 识别成功
    }
}


