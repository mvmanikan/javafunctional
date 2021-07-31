package beyondFunctions;

import java.util.function.Consumer;

public class Callbacks {
    // 31.07.2021 Callbacks
    public static void main(String[] args) {
        hello("Mani",null, value -> System.out.println("last name is empty for " + value));

        hello2("Mani",null, () -> System.out.println("last name is empty."));

    }

    static void hello(String firstname, String lastname, Consumer<String> callback){
        if (lastname != null){
            System.out.println(firstname + " " + lastname);
        }
        else{
            callback.accept(firstname);
        }
    }

    static void hello2(String firstname, String lastname, Runnable callback){
        if (lastname != null){
            System.out.println(firstname + " " + lastname);
        }
        else{
            callback.run();
        }
    }
}
