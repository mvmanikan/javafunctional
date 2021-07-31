package beyondFunctions;

import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;

import static java.util.Locale.*;

public class Lambdas {
    //31.07.2021 - Lambdas Example
    public static void main(String[] args) {

        Function<String, String> upperCaseName = String::toUpperCase;
        System.out.println(upperCaseName.apply("Mani"));

        BiFunction<String, Integer, String> upperCaseName1 = (name, age) -> {
            //logic
            if (name.isBlank()) throw new IllegalStateException("");
            System.out.println(age);
            return name.toUpperCase();
        };
        System.out.println(upperCaseName1.apply("Mani",39));
    }
}
