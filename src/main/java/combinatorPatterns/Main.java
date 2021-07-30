package combinatorPatterns;

import java.time.LocalDate;

import static combinatorPatterns.CustomerRegistrationValidator.*;
import static combinatorPatterns.CustomerRegistrationValidator.ValidationResult.*;
import static combinatorPatterns.CustomerRegistrationValidator.isPhoneNumberValid;

public class Main {
    public static void main(String[] args) {
        // 30.07.2021
        // Using Imperative Approach
        Customer customer = new Customer("Mani","mvmanikan@gmail.com","+015166677779", LocalDate.of(1983,2,15));
        String email = customer.getEmail();
        System.out.println(email);

        CustomerValidatorService customerValidatorService = new CustomerValidatorService();
        System.out.println(customerValidatorService.isValid(customer));

        // Using Combinator Pattern
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);

        System.out.println(result);

        if (result != SUCCESS){
            throw new IllegalStateException(result.name());
        }
    }
}
