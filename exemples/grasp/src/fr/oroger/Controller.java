package fr.oroger;

public class Controller {
    public Controller() {
    }

    public void action(String param, View v)
    {

        Model m = new Model();
        m.doSomething(param);

        v.render();
    }
}
