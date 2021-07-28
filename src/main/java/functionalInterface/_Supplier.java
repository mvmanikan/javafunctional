package functionalInterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        // 28.07.2021 Supplier Example
        // Represents a supplier of results
        System.out.println(getConnectionURL());
        System.out.println(getDBConnectionURL.get());
        System.out.println(getDBConnectionURLList.get());
    }

    static String getConnectionURL(){
        return "https://localhost:5432/users";
    }

    static Supplier<String> getDBConnectionURL = () -> "https://localhost:5432/users";

    static Supplier<List<String>> getDBConnectionURLList = () -> List.of("https://localhost:5432/users","https://localhost:8080/customers");
}
