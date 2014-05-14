
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
            server.getLogger().info("Creating plugins directory");
            if (!pluginsDir.mkdir()) {
                server.getLogger().severe("Failed to create plugins directory");
                System.exit(-1);
            }
        }

        pluginManager.registerInterface(JavaPluginLoader.class);

        pluginManager.loadPlugins(pluginsDir);
        server.getLogger().info("Loaded "+pluginManager.getPlugins().length+" plugins");
        for (Plugin plugin : pluginManager.getPlugins()) {
            server.getLogger().info("Enabling plugin " + plugin);
            pluginManager.enablePlugin(plugin);
        }
    }
}
