package fr.oroger;

public class Main {

    public static void main(String[] args) {
	    Folder photos = new Folder("photos");
	    Folder _2018 = new Folder("2018");
        Folder _2017 = new Folder("2017");
        Folder dec = new Folder("Décembre");

        File a = new File("a.jpg");
        File b = new File("b.jpg");
        File c = new File("c.jpg");
        File d = new File("d.jpg");

        dec.add(a);
        dec.add(b);
        _2018.add(dec);
        _2017.add(c);


        photos.add(_2018);
        photos.add(_2017);
        photos.add(d);

        photos.dblClick();
    }
}
