package fr.oroger.quotation;

import fr.oroger.house.House;
import fr.oroger.quotation.writer.QuotationWriter;

public class Quotation {
    private QuotationWriter mWriter;

    public Quotation(House house, QuotationWriterFactory.WriterType exportType) {

        mWriter = QuotationWriterFactory.getWriter(exportType);
        mWriter.setHouse(house);
    }

    public void print() {
        System.out.println(mWriter.write());
    }
}
