package fr.oroger;

public class Main {

    public static void main(String[] args) {

        Person p = new Person(
                new Age(4),
                new Email("oroger@pryntec.com")
        );

        System.out.print(p);
    }
}
