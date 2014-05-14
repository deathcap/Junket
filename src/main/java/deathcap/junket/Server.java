package deathcap.junket;

import com.avaje.ebean.config.ServerConfig;
import org.bukkit.*;
import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.help.HelpMap;
import org.bukkit.inventory.*;
import org.bukkit.map.MapView;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.ServicesManager;
import org.bukkit.plugin.messaging.Messenger;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.util.CachedServerIcon;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.*;
import java.util.logging.Logger;

public class Server implements org.bukkit.Server {

    private final Logger logger;

    public Server() {
        logger = Logger.getLogger("Junket");
    }

    @Override
    public String getName() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getVersion() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getBukkitVersion() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Player[] getOnlinePlayers() {
        return new Player[0];  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getMaxPlayers() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getPort() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getViewDistance() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getIp() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getServerName() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getServerId() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getWorldType() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean getGenerateStructures() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean getAllowEnd() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean getAllowNether() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean hasWhitelist() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setWhitelist(boolean b) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Set<OfflinePlayer> getWhitelistedPlayers() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void reloadWhitelist() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int broadcastMessage(String s) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getUpdateFolder() {
        // not set, but must not be null
        return "";
    }

    @Override
    public File getUpdateFolderFile() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public long getConnectionThrottle() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getTicksPerAnimalSpawns() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getTicksPerMonsterSpawns() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    @SuppressWarnings("deprecated")
    public Player getPlayer(String s) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    @SuppressWarnings("deprecated")
    public Player getPlayerExact(String s) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    @SuppressWarnings("deprecated")
    public List<Player> matchPlayer(String s) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Player getPlayer(UUID uuid) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public PluginManager getPluginManager() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public BukkitScheduler getScheduler() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServicesManager getServicesManager() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<World> getWorlds() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public World createWorld(WorldCreator worldCreator) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean unloadWorld(String s, boolean b) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean unloadWorld(World world, boolean b) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public World getWorld(String s) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public World getWorld(UUID uuid) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    @SuppressWarnings("deprecated")
    public MapView getMap(short i) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public MapView createMap(World world) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void reload() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Logger getLogger() {
        return logger;
    }

    @Override
    public PluginCommand getPluginCommand(String s) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void savePlayers() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean dispatchCommand(CommandSender commandSender, String s) throws CommandException {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void configureDbConfig(ServerConfig serverConfig) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean addRecipe(Recipe recipe) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Recipe> getRecipesFor(ItemStack itemStack) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Iterator<Recipe> recipeIterator() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void clearRecipes() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void resetRecipes() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Map<String, String[]> getCommandAliases() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getSpawnRadius() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setSpawnRadius(int i) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean getOnlineMode() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean getAllowFlight() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isHardcore() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean useExactLoginLocation() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void shutdown() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int broadcast(String s, String s2) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    @SuppressWarnings("deprecated")
    public OfflinePlayer getOfflinePlayer(String s) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public OfflinePlayer getOfflinePlayer(UUID uuid) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Set<String> getIPBans() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void banIP(String s) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void unbanIP(String s) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Set<OfflinePlayer> getBannedPlayers() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public BanList getBanList(BanList.Type type) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Set<OfflinePlayer> getOperators() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public GameMode getDefaultGameMode() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setDefaultGameMode(GameMode gameMode) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ConsoleCommandSender getConsoleSender() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public File getWorldContainer() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public OfflinePlayer[] getOfflinePlayers() {
        return new OfflinePlayer[0];  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Messenger getMessenger() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public HelpMap getHelpMap() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Inventory createInventory(InventoryHolder inventoryHolder, InventoryType inventoryType) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Inventory createInventory(InventoryHolder inventoryHolder, InventoryType inventoryType, String s) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Inventory createInventory(InventoryHolder inventoryHolder, int i) throws IllegalArgumentException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Inventory createInventory(InventoryHolder inventoryHolder, int i, String s) throws IllegalArgumentException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getMonsterSpawnLimit() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getAnimalSpawnLimit() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getWaterAnimalSpawnLimit() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getAmbientSpawnLimit() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isPrimaryThread() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getMotd() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getShutdownMessage() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Warning.WarningState getWarningState() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ItemFactory getItemFactory() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ScoreboardManager getScoreboardManager() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public CachedServerIcon getServerIcon() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public CachedServerIcon loadServerIcon(File file) throws IllegalArgumentException, Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public CachedServerIcon loadServerIcon(BufferedImage bufferedImage) throws IllegalArgumentException, Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setIdleTimeout(int i) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    @SuppressWarnings("deprecated")
    public int getIdleTimeout() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    @SuppressWarnings("deprecated")
    public UnsafeValues getUnsafe() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void sendPluginMessage(Plugin plugin, String s, byte[] bytes) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Set<String> getListeningPluginChannels() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
