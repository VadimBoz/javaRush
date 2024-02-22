import java.util.function.*;


class Operator {

    public static LongBinaryOperator binaryOperator = (x, y) -> {
        if (x == 0) return  0;
        if (x == y) return y;
        return Operator.binaryOperator.applyAsLong(x + 1, y) * x;
    };
}
