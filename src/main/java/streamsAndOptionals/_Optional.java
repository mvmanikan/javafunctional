package streamsAndOptionals;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.function.Supplier;

public class _Optional {
    public static void main(String[] args) {
        // 28.07.2021 Optionals
        Object value = Optional.ofNullable("Hallo")
                .orElseGet(() -> "Default Value");
        System.out.println(value);

        Object value1 = Optional.ofNullable(null)
                .orElseGet(() -> "Default Value");
        System.out.println(value1);

        Object value2 = Optional.empty()
                .orElseGet(() -> "Default Value");
        System.out.println(value2);

        Optional.ofNullable("john@gmail.com")
                .ifPresent(email -> System.out.println("Sending email to " + email));

        Optional.ofNullable(null)
                .ifPresentOrElse(email -> System.out.println("Sending email to " + email),
                        () -> System.out.println("Cannot send email.."));

        Object value4 = Optional.ofNullable(null)
                .orElseThrow(() -> new IllegalStateException("Illegal Exception"));
        System.out.println(value4);
    }
}
