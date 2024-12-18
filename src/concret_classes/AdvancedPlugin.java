package concret_classes;

import interfacees.DataProcessor;
import interfacees.Exporter;

public class AdvancedPlugin implements DataProcessor, Exporter {
    @Override
    public void execute() {
        System.out.println("Executing advanced plugin...");
    }

    @Override
    public void processData(String data) {
        System.out.println("Advanced plugin: "+data);
    }

    @Override
    public void export(String format) {
        System.out.println("Exporting data in format: " + format);
    }
}
