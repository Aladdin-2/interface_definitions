package management_classes;

import concret_classes.AdvancedPlugin;
import concret_classes.ChartVisualizer;
import concret_classes.DataAnalyzer;
import concret_classes.PDFExporter;
import interfacees.DataProcessor;
import interfacees.Exporter;
import interfacees.Plugin;
import interfacees.Visualizer;

import java.util.ArrayList;
import java.util.List;

public class PluginManager {
    private List<Plugin> pluginList = new ArrayList<>();


    public void loadPlugin() {
        pluginList.add(new DataAnalyzer());
        pluginList.add(new AdvancedPlugin());
        pluginList.add(new ChartVisualizer());
        pluginList.add(new PDFExporter());
    }

    public void loadPlugin(Plugin plugin) {
        pluginList.add(plugin);
    }

    public void runPlugins() {
        for (Plugin plugin : pluginList) {
            plugin.execute();
            if (plugin instanceof DataProcessor) {
                DataProcessor dataProcessor = (DataProcessor) plugin;
                dataProcessor.processData("New data");
            }
            if (plugin instanceof AdvancedPlugin) {
                AdvancedPlugin advancedPlugin = (AdvancedPlugin) plugin;
                advancedPlugin.processData("Advanced data processor!");
                advancedPlugin.export("XML");
            }
            if (plugin instanceof Visualizer) {
                Visualizer visualizer = (Visualizer) plugin;
                visualizer.visualize();
            }
            if (plugin instanceof Exporter) {
                Exporter exporter = new AdvancedPlugin();
                exporter.export("JavaScript");
            }
        }
    }
}
