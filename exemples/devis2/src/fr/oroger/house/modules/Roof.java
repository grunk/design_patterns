package fr.oroger.house.modules;

public class Roof extends AbstractModule {
    public enum RoofType {
        CLASSICAL,MODERN,FLAT
    }

    private RoofType mType;

    public Roof(RoofType type) {
        mType = type;
    }

    @Override
    public int getPrice() {
        switch(mType) {
            case CLASSICAL:return 10000;
            case MODERN:return 15000;
            case FLAT:return 20000;
            default:return 0;
        }
    }
}
