class Context {
    private String[] regions = {"A区", "B区", "C区"};
    private String[] persons = {"开发人员", "测试人员", "调试人员"};

    private NonTerminalExpression nonTerminalExpression;

    public Context() {
        TerminalExpression region = new TerminalExpression(regions);
        TerminalExpression person = new TerminalExpression(persons);
        nonTerminalExpression = new NonTerminalExpression(region, person);
    }

    public void check(String info) {
        boolean flag = nonTerminalExpression.interpret(info);
        if (flag) {
            System.out.println("识别成功");
        } else {
            System.out.println("识别失败");
        }
    }
}
