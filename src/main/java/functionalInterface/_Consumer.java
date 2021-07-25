package functionalInterface;

import java.util.function.Consumer;

public class _Consumer {
    // 25.07.2021
    // Consumer<T> - Accepts one argument and returns no result - Like void
    public static void main(String[] args) {
        // Normal Java Function
        Customer consumer = new Customer("Maria","17666777325");
        System.out.println(consumer);
        greetCustomer(consumer);

        // Consumer Function
        greetCustomerFunction.accept(consumer);
    }

    static Consumer<Customer> greetCustomerFunction = consumer
            -> System.out.println("Hello " + consumer.consumerName + ", thanks for registering with phone number " + consumer.consumerPhoneNumber);

    static void greetCustomer(Customer consumer){
        System.out.println("Hello " + consumer.consumerName + ", thanks for registering with phone number " + consumer.consumerPhoneNumber);
    }

    static class Customer    {
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
