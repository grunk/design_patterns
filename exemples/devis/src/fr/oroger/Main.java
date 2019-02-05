package fr.oroger;

import fr.oroger.devis.DevisFactory;
import fr.oroger.devis.DevisTemplate;
import fr.oroger.module.*;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Catalogue catalogue = new Catalogue();
        ArrayList<ModuleMaison> modules = new ArrayList<>();


        ModuleMaison ss = new SousSol("Cave",10000f,3f);
        ModuleMaison rdc = new Etage("RDC",50000f);
        ModuleMaison pre = new Etage("Premier",60000f);
        ModuleMaison sec = new Etage("Second",70000f);

        catalogue.addModules(ss);
        catalogue.addModules(rdc);
        catalogue.addModules(pre);
        catalogue.addModules(sec);

        Iterator it = catalogue.iterator();
        while(it.hasNext()) {
            ModuleMaison mm = (ModuleMaison) it.next();
            if(mm.getName().equals("RDC") || mm.getName().equals("Cave"))
                modules.add(mm);
        }


	    DevisTemplate template = DevisFactory.getWriter(DevisFactory.Mode.TXT,modules);
	    template.generate();
	    template.write();
    }
}
