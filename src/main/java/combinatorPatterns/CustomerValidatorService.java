package combinatorPatterns;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {
    // 30.07.2021 - Methods validation

    private boolean isNameValid(String name){
        return name.startsWith("M");
    }

    private boolean isEmailValid(String email){
        return email.contains("@");
    }

    private boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("+0");
    }

    private boolean isDoBValid(LocalDate dob) {
        return Period.between(LocalDate.now(),dob).getYears() > 16;
    }

    public boolean isValid(Customer customer){
        return isNameValid(customer.getName()) && isEmailValid(customer.getEmail()) && isPhoneNumberValid(customer.getPhoneNumber());
    }
}
