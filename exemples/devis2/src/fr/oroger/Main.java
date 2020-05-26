package fr.oroger;

import fr.oroger.house.House;
import fr.oroger.house.HouseBuilder;
import fr.oroger.house.modules.*;
import fr.oroger.quotation.Quotation;
import fr.oroger.quotation.QuotationWriterFactory;

public class Main {

    public static void main(String[] args) {
        House maison = new HouseBuilder()
                .addDoors(new Door())
                .addWalls(new Wall())
                .addWalls(new Wall())
                .addWalls(new Wall())
                .addWalls(new Wall())
                .addGarages(new Garage())
                .addWindows(new Window())
                .addWindows(new Window())
                .addRoof(new Roof(Roof.RoofType.MODERN))
                .build();

        System.out.println(maison);

        Quotation devis = new Quotation(maison, QuotationWriterFactory.WriterType.TEXT);
        devis.print();
    }
}
