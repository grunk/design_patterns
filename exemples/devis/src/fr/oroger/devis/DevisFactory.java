package fr.oroger.devis;

import fr.oroger.devis.templates.DevisJson;
import fr.oroger.devis.templates.DevisText;
import fr.oroger.module.ModuleMaison;

import java.util.ArrayList;

abstract public class DevisFactory {

    public enum Mode {TXT,JSON}

    public static DevisTemplate getWriter(Mode mode, ArrayList<ModuleMaison> m)
    {
        if(Mode.TXT == mode)
        {
            return new DevisText(m);
        }
        else if (Mode.JSON == mode)
        {
            return new DevisJson(m);
        }
        throw new IllegalArgumentException("Mode non supporté");
    }
}
