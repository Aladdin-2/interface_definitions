package management_classes;

import concret_classes.AdvancedPlugin;
import concret_classes.ChartVisualizer;
import concret_classes.DataAnalyzer;
import concret_classes.PDFExporter;
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
        pluginList.add(new PDFExporter());
        pluginList.add(new ChartVisualizer());
    }

    public void loadPlugin(Plugin plugin) {
        pluginList.add(plugin);
    }

    public void runPlugins() {
        for (Plugin plugin : pluginList) {
            plugin.execute();
            if (plugin instanceof DataAnalyzer) {
                DataAnalyzer dataAnalyzer = (DataAnalyzer) plugin;
                dataAnalyzer.processData("New data");
                System.out.println("==========");
            }
            if (plugin instanceof AdvancedPlugin) {
                AdvancedPlugin advancedPlugin = (AdvancedPlugin) plugin;
                advancedPlugin.processData("Advanced data processor!");
                advancedPlugin.export("XML");
                System.out.println("==========");
            }
            if (plugin instanceof Visualizer) {
                Visualizer visualizer = (Visualizer) plugin;
                visualizer.visualize();
                System.out.println("==========");
            }
            if (plugin instanceof Exporter) {
                Exporter exporter = new AdvancedPlugin();
                exporter.export("JavaScript");
                System.out.println("==========");
            }
        }
    }
}
