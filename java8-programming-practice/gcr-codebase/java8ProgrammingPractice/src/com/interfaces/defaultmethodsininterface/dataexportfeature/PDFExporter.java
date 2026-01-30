package com.interfaces.defaultmethodsininterface.dataexportfeature;

public class PDFExporter implements ReportExporter {

    @Override
    public void export() {
        System.out.println("Exporting report to PDF");
    }
}
