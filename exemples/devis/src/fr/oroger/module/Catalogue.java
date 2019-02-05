package fr.oroger.module;

import java.util.ArrayList;
import java.util.Iterator;

public class Catalogue implements Iterable<ModuleMaison> {
    private ArrayList<ModuleMaison> mModules;

    public Catalogue() {
        mModules = new ArrayList<>();
    }

    public void addModules(ModuleMaison m)
    {
        mModules.add(m);
    }

    public void removeModule(ModuleMaison m) {
        mModules.remove(m);
    }

    @Override
    public Iterator<ModuleMaison> iterator() {
        return new CatalogueIterator(mModules);
    }
}
