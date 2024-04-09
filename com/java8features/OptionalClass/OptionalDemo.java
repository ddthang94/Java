package com.java8features.OptionalClass;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalDemo {
    public static void main(String[] args) {

        String email = "ddthang21194@gmail.com";
        String email2 = null;

        /* of, empty, ofNullable */
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        Optional<String> emailOptional = Optional.of(email);
        System.out.println(emailOptional);

        Optional<String> stringOptional = Optional.ofNullable(email);
        System.out.println(stringOptional);
        Optional<String> stringOptional2 = Optional.ofNullable(email2);
        System.out.println(stringOptional2);

//        Whenever we want to retrieve the value of an OptionalClass object then using get() method
//        Before using get(), we should check if the value isPresent();
        if (stringOptional2.isPresent()) {
            System.out.println(stringOptional2.get());
        } else {
            System.out.println("Not present");
        }

//        Get the default value from OptionalClass object
        Optional<String> stringOptional3 = Optional.ofNullable(email2);

//        orElse()
        String defaultOptional = stringOptional3.orElse("default@gmail.com");
        System.out.println(defaultOptional);

//        orElseGet()
        String defaultOptional2 = stringOptional3.orElseGet( () -> "default@gmail.com");
        System.out.println(defaultOptional2);

//        orElseThrow() - *reality
//        String optionalObject = stringOptional3.orElseThrow(() -> new IllegalArgumentException("Email not present"));
//        System.out.println(optionalObject);
//
//        System.out.println("=======================");

//        ifPresent()
        Optional<String> gender = Optional.of("Male");
        Optional<String> emptyOptional2 = Optional.empty();

        gender.ifPresent((s) -> System.out.println("Value is present"));
        emptyOptional2.ifPresent((s) -> System.out.println("No value is present"));

//        filter()
        String result = "abc";
        if (result!=null && result.contains("abc")) {
            System.out.println(result);
        }

        Optional<String> optionalStr = Optional.of(result);
        optionalStr.filter(res -> res.contains("abc"))
                    .ifPresent(res -> System.out.println(res));

//        map()
        String string = "  Abc   ";
        Optional<String> optionalStr2 = Optional.of(string);
        optionalStr2.filter(res -> res.contains("Abc"))
                    .map(String::trim)
                    .ifPresent(res -> System.out.println(res));

    }
}
