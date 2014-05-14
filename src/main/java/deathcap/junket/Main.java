
package deathcap.junket;

import org.bukkit.command.SimpleCommandMap;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.SimplePluginManager;
import org.bukkit.plugin.java.JavaPluginLoader;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Server server = new Server();

        SimpleCommandMap commandMap = new SimpleCommandMap(server);
        SimplePluginManager pluginManager = new SimplePluginManager(server, commandMap);

        File pluginsDir = new File("plugins");
        if (!pluginsDir.isDirectory()) {
            System.out.println("Creating plugins directory");
            if (!pluginsDir.mkdir()) {
                System.out.println("Failed to create plugins directory");
                System.exit(-1);
            }
        }

        pluginManager.registerInterface(JavaPluginLoader.class);

        pluginManager.loadPlugins(pluginsDir);
        System.out.println("Loaded "+pluginManager.getPlugins().length+" plugins");
        for (Plugin plugin : pluginManager.getPlugins()) {
            System.out.println(plugin);
        }
    }
}
