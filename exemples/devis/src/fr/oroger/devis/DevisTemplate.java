package fr.oroger.devis;

import fr.oroger.module.ModuleMaison;

import java.util.ArrayList;

public abstract class DevisTemplate {

    protected ArrayList<ModuleMaison> mModules;

    public DevisTemplate(ArrayList<ModuleMaison> modules) {
        mModules = modules;
    }

    protected abstract void addHeader();
    protected abstract void addContent();
    protected abstract void addFooter();
    public abstract String write();

    protected final float getTotal()
    {
        float total = 0;
        for(ModuleMaison m : mModules) {
            total += m.getPrice();
        }
        return total;
    }


    public final void generate()
    {
        addHeader();
        addContent();
        addFooter();
    }
}
