package combinatorPatterns;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static combinatorPatterns.CustomerRegistrationValidator.*;
import static combinatorPatterns.CustomerRegistrationValidator.ValidationResult.*;
import static combinatorPatterns.CustomerRegistrationValidator.ValidationResult.SUCCESS;

public interface CustomerRegistrationValidator
        extends Function<Customer, ValidationResult> {
    // 30.07.2021 Interface : CustomerRegistrationValidator

    static CustomerRegistrationValidator isEmailValid() {
        System.out.println("Email check");
        return customer -> customer.getEmail().contains("@") ? SUCCESS : EMAIL_NOT_VALID;
    }

    static CustomerRegistrationValidator isPhoneNumberValid() {
        return customer -> customer.getPhoneNumber().startsWith("+0") ? SUCCESS : PHONE_NUMBER_NOT_VALID;
    }

    static CustomerRegistrationValidator isAdult() {
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 16 ? SUCCESS : IS_NOT_AN_ADULT;
    }

    default CustomerRegistrationValidator and (CustomerRegistrationValidator other) {
        return customer -> {
            ValidationResult result = this.apply(customer);
            return result.equals(SUCCESS) ? other.apply(customer) : result;
        };
    }

    enum ValidationResult{
        SUCCESS,
        EMAIL_NOT_VALID,
        PHONE_NUMBER_NOT_VALID,
        IS_NOT_AN_ADULT
    }
}
