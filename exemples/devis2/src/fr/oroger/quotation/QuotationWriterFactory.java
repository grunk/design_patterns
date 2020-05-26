package fr.oroger.quotation;

import fr.oroger.quotation.writer.JSONWriter;
import fr.oroger.quotation.writer.QuotationWriter;
import fr.oroger.quotation.writer.TextWriter;

public class QuotationWriterFactory {
    public enum WriterType {
        TEXT,
        JSON
    }

    static QuotationWriter getWriter(WriterType t) {
        if (t == WriterType.JSON) {
            return new JSONWriter();
        }
        return new TextWriter();
    }
}
