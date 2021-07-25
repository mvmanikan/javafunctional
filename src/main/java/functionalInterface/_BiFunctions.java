package functionalInterface;

import java.util.function.BiFunction;

public class _BiFunctions {
    public static void main(String[] args) {
        // 24.07.0201
        // BiFunctions<T,R,U> - BiFunctions takes 2 arguments and produces 1 result

        int result = addByOneAndMultiplyBy(1, 100);
        System.out.println(result);

        System.out.println((addByOneAndMultiplyByFunction.apply(1, 100)));
    }

    static int addByOneAndMultiplyBy(int number, int multiplyBy) {
        return (number + 1) * multiplyBy;
    }

    static BiFunction<Integer, Integer, Integer> addByOneAndMultiplyByFunction =
            (addByOne, MultiplyBy) -> (addByOne + 1) * MultiplyBy;

}

