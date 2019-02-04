package fr.oroger;

public class Age {
    int mValue;

    public Age(int value) {
        if(value < 5 || value > 100)
            throw new IllegalArgumentException("Age incorrect");
        mValue = value;
    }

    @Override
    public String toString() {
        return Integer.toString(mValue);
    }
}
