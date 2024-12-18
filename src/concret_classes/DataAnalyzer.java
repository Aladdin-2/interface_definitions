package concret_classes;

import interfacees.DataProcessor;

public class DataAnalyzer implements DataProcessor {
    @Override
    public void execute() {
        System.out.println("Executing Data analyzer...");
    }

    @Override
    public void processData(String data) {
        System.out.println("Processing data: " + data);
    }
}
