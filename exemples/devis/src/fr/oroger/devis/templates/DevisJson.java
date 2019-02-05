package fr.oroger.devis.templates;

import fr.oroger.devis.DevisTemplate;
import fr.oroger.module.ModuleMaison;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DevisJson extends DevisTemplate {

    private JSONObject mObject;

    public DevisJson(ArrayList<ModuleMaison> modules) {

        super(modules);
        mObject = new JSONObject();
    }

    @Override
    protected void addHeader() {
        mObject.put("title","DEVIS");
    }

    @Override
    protected void addContent() {
        JSONArray modulesArray = new JSONArray();
        for(ModuleMaison m : mModules) {
            JSONObject obj = new JSONObject();
            obj.put("name",m.getName());
            obj.put("price",m.getPrice());
            modulesArray.add(obj);
        }
        mObject.put("modules",modulesArray);
    }

    @Override
    protected void addFooter() {
        mObject.put("total",getTotal());
    }

    @Override
    public String write() {
        String filename = "devis.json";

        try {
            FileWriter file = new FileWriter(filename);
            file.write(mObject.toJSONString());
            file.close();
            return filename;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
