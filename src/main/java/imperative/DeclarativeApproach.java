package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DeclarativeApproach {
    public static void main(String[] args) {
        // 22.07.2021
        List<Person> people = List.of(
                new Person("Mani", Gender.MALE),
                new Person("Sheeba", Gender.FEMALE),
                new Person("Kavin", Gender.MALE),
                new Person("Hamsini", Gender.FEMALE)
        );

        // Declarative approach

        people.stream()
                .filter(person -> Gender.FEMALE.equals(person.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // (or)

        //Below line is actually a predicate where it returns a boolean value
        Predicate<Person> personPredicate = person -> Gender.FEMALE.equals(person.gender);
        System.out.println(personPredicate);

        people.stream()
                .filter(personPredicate)
                .forEach(System.out::println);

        // (or)

        List<Person> female = people.stream()
                .filter(person -> Gender.FEMALE.equals(person.gender))
                .collect(Collectors.toList());

        female.forEach(System.out::println);

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
        MALE, FEMALE;
    }

}
