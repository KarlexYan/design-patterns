import java.util.HashSet;
import java.util.Set;

interface Expression {
    public boolean interpret(String info);
}

class NonTerminalExpression implements Expression {
    private TerminalExpression region;
    private TerminalExpression person;

    public NonTerminalExpression(TerminalExpression region, TerminalExpression person) {
        this.region = region;
        this.person = person;
    }

    @Override
    public boolean interpret(String info) {
        String[] str = info.split("的");
        return region.interpret(str[0]) && person.interpret(str[1]);
    }
}

class TerminalExpression implements Expression {
    private Set<String> stringSet = new HashSet<>();

    public TerminalExpression(String[] data) {
        for (String str : data) {
            stringSet.add(str);
        }
    }

    @Override
    public boolean interpret(String info) {
        return stringSet.contains(info);
    }
}