package fr.oroger.module;


import java.util.ArrayList;
import java.util.Iterator;

public class CatalogueIterator implements Iterator {
    private ArrayList<ModuleMaison> mList;
    private int index = 0;

    public CatalogueIterator(ArrayList<ModuleMaison> list) {
        mList = list;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < mList.size();
    }

    @Override
    public ModuleMaison next() {
        return mList.get(index++);
    }
}
