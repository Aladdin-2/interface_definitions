package concret_classes;

import interfacees.Visualizer;

public class ChartVisualizer implements Visualizer {
    @Override
    public void visualize() {
        System.out.println("Executing Visualizer...");
    }

    @Override
    public void execute() {
        System.out.println("Visualizing data...");
    }
}
