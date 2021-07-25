package functionalInterface;

import java.util.function.BiConsumer;

public class _BiConsumer {
    public static void main(String[] args) {
        // 25.07.2021
        // Consumer<T,U> - Accepts two arguments and returns no result - Like void

        // Normal Java Function
        Customer consumer = new Customer("Maria", "17666777325");
        System.out.println(consumer);
        greetCustomerV2(consumer, false);

        // BiConsumer Function
        greetCustomerFunctionV2.accept(consumer, false);
    }

    static BiConsumer<Customer, Boolean> greetCustomerFunctionV2 = (consumer, showPhoneNumber)
            -> System.out.println("Hello " + consumer.consumerName + ", thanks for registering with phone number "
            + (showPhoneNumber ? consumer.consumerPhoneNumber : "xxxxx"));

    static void greetCustomerV2(Customer consumer, boolean showPhoneNumber) {
        System.out.println("Hello " + consumer.consumerName + ", thanks for registering with phone number " + (showPhoneNumber ? consumer.consumerPhoneNumber : "xxxxx"));
    }

    static class Customer {
        private final String consumerName;
        private final String consumerPhoneNumber;

        public Customer(String consumerName, String consumerPhoneNumber) {
            this.consumerName = consumerName;
            this.consumerPhoneNumber = consumerPhoneNumber;
        }

        @Override
        public String toString() {
            return "Consumer{" +
                    "consumerName='" + consumerName + '\'' +
                    ", consumerPhoneNumber='" + consumerPhoneNumber + '\'' +
                    '}';
        }
    }
}

