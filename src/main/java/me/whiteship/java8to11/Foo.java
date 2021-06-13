package me.whiteship.java8to11;

import java.util.function.Function;

public class Foo {

    public static void main(String[] args) {
//        Plus10 plus10 = new Plus10();
//        System.out.println(plus10.apply(1));

        Function<Integer, Integer> plus10 = (i) -> i + 10;
        System.out.println(plus10.apply(1));
    }
}
