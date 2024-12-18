package concret_classes;

import interfacees.DataProcessor;

public class DataAnalyzer implements DataProcessor {
    @Override
    public void processData(String data) {
        System.out.println("Processing data: " + data);
    }

    @Override
    public void execute() {
        System.out.println("Executing Data analyzer...");
    }
}
