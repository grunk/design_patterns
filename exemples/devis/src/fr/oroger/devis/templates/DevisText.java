package fr.oroger.devis.templates;

import fr.oroger.devis.DevisTemplate;
import fr.oroger.module.ModuleMaison;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class DevisText extends DevisTemplate {

    StringBuilder mSb;

    public DevisText(ArrayList<ModuleMaison> modules) {
        super(modules);
        mSb = new StringBuilder();
    }

    @Override
    protected void addHeader() {
        mSb
                .append("===========================\n")
                .append(" DEVIS \n")
                .append("===========================\n");
    }

    @Override
    protected void addContent() {
        final int MAX_DOT = 22;
        for(ModuleMaison m : mModules) {
            int nbDot = MAX_DOT - m.getName().length();
            mSb.append(m.getName())
                .append(String.join("",Collections.nCopies(nbDot, ".")))
                .append(Float.toString(m.getPrice()))
                .append("\n");
        }
    }

    @Override
    protected void addFooter() {

        mSb.append("===========================\n")
        .append(" TOTAL :  ")
        .append(getTotal())
        .append("\n")
        .append("===========================\n");
    }

    @Override
    public String write() {
        String filename = "devis.txt";
        String content = mSb.toString();
        try {
            FileWriter file = new FileWriter(filename);
            file.write(content);
            file.close();
            return filename;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
