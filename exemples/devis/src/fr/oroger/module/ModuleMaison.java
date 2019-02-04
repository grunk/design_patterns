package fr.oroger.module;

public abstract class ModuleMaison {
    protected String mName;
    protected float mPrice;

    public ModuleMaison(String name, float price) {
        mName = name;
        mPrice = price;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public float getPrice() {
        return mPrice;
    }

    public void setPrice(float price) {
        mPrice = price;
    }
}
