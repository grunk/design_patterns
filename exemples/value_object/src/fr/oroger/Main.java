package fr.oroger;

public class Main {

    public static void main(String[] args) {

        Person p = new Person(
                new Lastname("ROGER"),
                new Email("oroger@pryntec.com")
        );

        System.out.print(p);
    }
}
