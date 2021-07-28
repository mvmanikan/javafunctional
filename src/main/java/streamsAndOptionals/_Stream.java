package streamsAndOptionals;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import static streamsAndOptionals._Stream.Gender.*;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Mani", MALE),
                new Person("Sheeba", FEMALE),
                new Person("Kavin", MALE),
                new Person("Hamsini", FEMALE),
                new Person("Alex", PREFER_NOT_TO_SAY)
        );

        System.out.println(people);

        people.stream().map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        people.stream().map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

        boolean checkGender = people.stream().allMatch(person -> MALE.equals(person.gender));
        System.out.println(checkGender);

        boolean checkGender1 = people.stream().noneMatch(person -> PREFER_NOT_TO_SAY.equals(person.gender));
        System.out.println(checkGender1);

        Predicate<Person> personPredicate = person -> PREFER_NOT_TO_SAY.equals(person.gender);

        boolean checkGender2 = people.stream().anyMatch(personPredicate);
        System.out.println(checkGender2);
    }

    static class Person {

        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE, PREFER_NOT_TO_SAY;
    }
}
