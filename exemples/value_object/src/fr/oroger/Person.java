package fr.oroger;

public class Person {
    Age mAge;
    Email mEmail;

    public Person(Age age, Email email) {
        mAge = age;
        mEmail = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "mAge=" + mAge +
                ", mEmail=" + mEmail +
                '}';
    }
}
