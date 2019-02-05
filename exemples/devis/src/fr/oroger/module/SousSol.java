package fr.oroger.module;

public class SousSol extends ModuleMaison {
    private float mHeight;

    public SousSol(String name, float price, float height) {
        super(name, price);
        mHeight = height;
    }

    public float getHeight() {
        return mHeight;
    }

    public void setHeight(float height) {
        mHeight = height;
    }

    @Override
    public float getPrice() {
        return mPrice * mHeight;
    }
}
