package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        //28.07.2021 Predicate

        // Usual way
        boolean phoneNumberValid = isPhoneNumberValid("1516667777");
        boolean phoneNumberValid1 = isPhoneNumberValid("1516567777");
        System.out.println("Without Predicates");
        System.out.println(phoneNumberValid);
        System.out.println(phoneNumberValid1);
        System.out.println(isPhoneNumberValid("15165677777"));

        // With Predicates
        System.out.println();
        System.out.println("With Predicates");
        System.out.println(isPhoneNumberValidPredicate.test("1516667777"));
        System.out.println(isPhoneNumberValidPredicate.test("1516567777"));
        System.out.println(isPhoneNumberValidPredicate.test("15165677777"));
        System.out.println(isPhoneNumberContains.test("15164677777"));
        System.out.println("Is Phone Number contains 7 is valid ? " + isPhoneNumberValidPredicate.and(isPhoneNumberContains).test("1516467777"));
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.contains("666") && phoneNumber.startsWith("151") && phoneNumber.length() == 10;
    }

    // Function Predicate Applied
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("151") && phoneNumber.length() == 10;

    static Predicate<String> isPhoneNumberContains = phoneNumber -> phoneNumber.contains("7");
}
