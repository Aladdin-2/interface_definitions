package concret_classes;

import interfacees.Exporter;

public class PDFExporter implements Exporter {
    @Override
    public void export(String format) {
        System.out.println("Exporting data in format: " + format);
    }

    @Override
    public void execute() {
        System.out.println("Executing Exporter...");
    }
}
