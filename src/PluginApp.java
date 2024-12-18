import concret_classes.AdvancedPlugin;
import concret_classes.ChartVisualizer;
import concret_classes.DataAnalyzer;
import concret_classes.PDFExporter;
import management_classes.PluginManager;

public class PluginApp {
    public static void main(String[] args) {
        PluginManager pluginManager = new PluginManager();

        // Объекты создаются внутри
        pluginManager.loadPlugin();


        pluginManager.loadPlugin(new AdvancedPlugin());
        pluginManager.loadPlugin(new ChartVisualizer());
        pluginManager.loadPlugin(new DataAnalyzer());
        pluginManager.loadPlugin(new PDFExporter());


        pluginManager.runPlugins();
    }

}
