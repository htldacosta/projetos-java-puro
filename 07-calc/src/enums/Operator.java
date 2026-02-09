package enums;

import jdk.dynalink.Operation;

public enum Operator {
    SUM("+"),
    SUB("-"),
    MULT("*"),
    DIV("/"),
    POW("^");

    private final String symbol;

    Operator(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public static Operator fromSymbol (String symbol) {
        for (Operator op : values()) {
            if (op.getSymbol().equals(symbol)) {
                return op;
            }
        }
        return null;
    }
}
