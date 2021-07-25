package imperative;

import java.util.ArrayList;
import java.util.List;

public class ImperativeApproach {
    public static void main(String[] args) {
        // 21.07.2021
        List<Person> people = List.of(
                new Person("Mani",Gender.MALE),
                new Person("Sheeba",Gender.FEMALE),
                new Person("Kavin",Gender.MALE),
                new Person("Hamsini",Gender.FEMALE)
        );

        // Imperative approach
        List<Person> females = new ArrayList<>();

        for (Person person : people){
            if(Gender.FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for (Person female : females){
            System.out.println(female);
        }
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
