package fr.oroger.quotation.writer;

import fr.oroger.house.House;

public interface QuotationWriter {
    String write();
    void setHouse(House h);
}
