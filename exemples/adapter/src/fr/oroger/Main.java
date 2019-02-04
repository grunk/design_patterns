package fr.oroger;

public class Main {

    public static void main(String[] args) {

	    SuperCharger chargeurTesla = new SuperCharger();

	    Renault zoe = new Renault();
	    Tesla modelX = new Tesla();

	    RenaultAdapter adapter = new RenaultAdapter(zoe);

	    chargeurTesla.plug(adapter);
	    chargeurTesla.plug(modelX);



    }
}
