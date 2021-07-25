package functionalInterface;

import java.util.function.Function;

public class _Functions {
    public static void main(String[] args) {
        // 22.07.0201
        // Functions<T,R> - BiFunctions takes 2 arguments and produces 1 result

        int increment1 = incrementByOne(1);
        System.out.println(increment1);
        System.out.println();

        // Using Functions
        int increment2 = incrementByOneFunc.apply(1);
        System.out.println(increment2);

        int multiply = multiplyFunc.apply(increment2);
        System.out.println(multiply);

        // Another way
        Function<Integer, Integer> multiplyFunction = incrementByOneFunc.andThen(multiplyFunc);
        System.out.println(multiplyFunction.apply(3));

        // Another approach
        int result = multiplyFunction.apply(1);
        System.out.println(result);
    }

    static Function<Integer,Integer> incrementByOneFunc = number -> number + 1;

    static Function<Integer,Integer> multiplyFunc = number -> number * 10;

    static int incrementByOne(int number){
        return number + 1;
    }
}
