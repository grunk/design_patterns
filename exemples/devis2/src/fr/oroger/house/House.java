package fr.oroger.house;

import fr.oroger.house.modules.*;

import java.util.List;

public class House {

    private List<AbstractModule> mWalls;
    private List<AbstractModule> mWindows;
    private List<AbstractModule> mDoors;
    private List<AbstractModule> mPools;
    private List<AbstractModule> mGarage;
    private List<AbstractModule> mRoof;

    public House(List<AbstractModule> walls, List<AbstractModule> windows, List<AbstractModule> doors, List<AbstractModule> pools, List<AbstractModule> garage, List<AbstractModule> roof) {
        mWalls = walls;
        mWindows = windows;
        mDoors = doors;
        mPools = pools;
        mGarage = garage;
        mRoof = roof;
    }

    private int getPrice(List<AbstractModule> modules) {
        int total = 0;
        for(AbstractModule m : modules) {
            total += m.getPrice();
        }
        return total;
    }

    public int getWallsPrice() {
        return getPrice(mWalls);
    }


    public int getWindowsPrice() {
        return getPrice(mWindows);
    }


    public int getDoorsPrice() {
        return getPrice(mDoors);
    }


    public int getPoolsPrice() {
        return getPrice(mPools);
    }


    public int getGaragePrice() {
        return getPrice(mGarage);
    }


    public int getRoofPrice() {
        return getPrice(mRoof);
    }

}
