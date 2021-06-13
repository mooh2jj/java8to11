package me.whiteship.java8to11;

public class Foo {

    public static void main(String[] args) {
//        RunSometing runSometing = () -> System.out.println("hello");
//        runSometing.doIt();
        RunSometing runSometing = (n) -> {
            return n + 10;
        };

        System.out.println(runSometing.doIt(1));
    }
}
