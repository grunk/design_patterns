package fr.oroger;

public class Email {
    String mValue;

    public Email(String value) {
        if(value.length() < 5)
            throw new IllegalArgumentException("Email trop court");
        mValue = value;
    }

    @Override
    public String toString() {
        return mValue;
    }
}
