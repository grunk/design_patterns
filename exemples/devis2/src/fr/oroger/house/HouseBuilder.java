package fr.oroger.house;

import fr.oroger.house.modules.*;

import java.util.ArrayList;
import java.util.List;

public class HouseBuilder {

    private List<AbstractModule> mWalls;
    private List<AbstractModule> mWindows;
    private List<AbstractModule> mDoors;
    private List<AbstractModule> mPools;
    private List<AbstractModule> mGarage;
    private List<AbstractModule> mRoof;

    public HouseBuilder() {
        mWalls = new ArrayList<>();
        mWindows = new ArrayList<>();
        mDoors = new ArrayList<>();
        mPools = new ArrayList<>();
        mGarage = new ArrayList<>();
        mRoof = new ArrayList<>();

    }

    public HouseBuilder addWalls(Wall w) {
        mWalls.add(w);
        return this;
    }

    public HouseBuilder addWindows(Window w) {
        mWindows.add(w);
        return this;
    }

    public HouseBuilder addDoors(Door d) {
        mDoors.add(d);
        return this;
    }

    public HouseBuilder addSwimingools(SwimingPool s) {
        mPools.add(s);
        return this;
    }

    public HouseBuilder addGarages(Garage g) {
        mGarage.add(g);
        return this;
    }

    public HouseBuilder addRoof(Roof r) {
        mRoof.add(r);
        return this;
    }

    public House build() {
        return new House(mWalls,mWindows,mDoors,mPools,mGarage,mRoof);
    }
}
