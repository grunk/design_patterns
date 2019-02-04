package fr.oroger;

import fr.oroger.devis.DevisFactory;
import fr.oroger.devis.DevisTemplate;
import fr.oroger.module.Etage;
import fr.oroger.module.ModuleMaison;
import fr.oroger.module.SousSol;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<ModuleMaison> modules = new ArrayList<>();
        ModuleMaison ss = new SousSol("Cave",10000f,3f);
        ModuleMaison rdc = new Etage("RDC",50000f);

        modules.add(ss);
        modules.add(rdc);


	    DevisTemplate template = DevisFactory.getWriter(DevisFactory.Mode.JSON,modules);
	    template.generate();
	    template.write();
    }
}
