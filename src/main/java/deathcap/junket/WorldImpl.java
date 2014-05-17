package deathcap.junket;

import org.bukkit.*;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.entity.*;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.Vector;

import java.io.File;
import java.util.*;

public class WorldImpl implements org.bukkit.World {
    @Override
    public Block getBlockAt(int x, int y, int z) {
        // TODO: call voxel-engine getBlock()
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Block getBlockAt(Location location) {
        return this.getBlockAt(location.getBlockX(), location.getBlockY(), location.getBlockZ());
    }

    /**
     * @deprecated
     */
    @Override
    public int getBlockTypeIdAt(int i, int i2, int i3) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * @deprecated
     */
    @Override
    public int getBlockTypeIdAt(Location location) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getHighestBlockYAt(int i, int i2) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getHighestBlockYAt(Location location) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Block getHighestBlockAt(int i, int i2) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Block getHighestBlockAt(Location location) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Chunk getChunkAt(int x, int z) {
        // TODO: this is sort of a problem with cubic chunks..
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Chunk getChunkAt(Location location) {
        return this.getChunkAt(location.getBlockX(), location.getBlockZ());
    }

    @Override
    public Chunk getChunkAt(Block block) {
        return this.getChunkAt(block.getLocation());
    }

    @Override
    public boolean isChunkLoaded(Chunk chunk) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Chunk[] getLoadedChunks() {
        return new Chunk[0];  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void loadChunk(Chunk chunk) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isChunkLoaded(int i, int i2) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isChunkInUse(int i, int i2) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void loadChunk(int i, int i2) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean loadChunk(int i, int i2, boolean b) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean unloadChunk(Chunk chunk) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean unloadChunk(int i, int i2) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean unloadChunk(int i, int i2, boolean b) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean unloadChunk(int i, int i2, boolean b, boolean b2) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean unloadChunkRequest(int i, int i2) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean unloadChunkRequest(int i, int i2, boolean b) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean regenerateChunk(int i, int i2) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean refreshChunk(int i, int i2) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Item dropItem(Location location, ItemStack itemStack) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Item dropItemNaturally(Location location, ItemStack itemStack) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Arrow spawnArrow(Location location, Vector vector, float v, float v2) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean generateTree(Location location, TreeType treeType) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean generateTree(Location location, TreeType treeType, BlockChangeDelegate blockChangeDelegate) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Entity spawnEntity(Location location, EntityType entityType) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * @deprecated
     */
    @Override
    public LivingEntity spawnCreature(Location location, EntityType entityType) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * @deprecated
     */
    @Override
    public LivingEntity spawnCreature(Location location, CreatureType creatureType) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public LightningStrike strikeLightning(Location location) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public LightningStrike strikeLightningEffect(Location location) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Entity> getEntities() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<LivingEntity> getLivingEntities() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * @deprecated
     */
    @Override
    public <T extends Entity> Collection<T> getEntitiesByClass(Class<T>... classes) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public <T extends Entity> Collection<T> getEntitiesByClass(Class<T> tClass) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Collection<Entity> getEntitiesByClasses(Class<?>... classes) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Player> getPlayers() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getName() {
        return "theWorld";
    }

    @Override
    public UUID getUID() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Location getSpawnLocation() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean setSpawnLocation(int i, int i2, int i3) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public long getTime() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setTime(long l) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public long getFullTime() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setFullTime(long l) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean hasStorm() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setStorm(boolean b) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getWeatherDuration() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setWeatherDuration(int i) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isThundering() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setThundering(boolean b) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getThunderDuration() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setThunderDuration(int i) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean createExplosion(double v, double v2, double v3, float v4) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean createExplosion(double v, double v2, double v3, float v4, boolean b) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean createExplosion(double v, double v2, double v3, float v4, boolean b, boolean b2) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean createExplosion(Location location, float v) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean createExplosion(Location location, float v, boolean b) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Environment getEnvironment() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public long getSeed() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean getPVP() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setPVP(boolean b) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ChunkGenerator getGenerator() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void save() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<BlockPopulator> getPopulators() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public <T extends Entity> T spawn(Location location, Class<T> tClass) throws IllegalArgumentException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * @deprecated
     */
    @Override
    public FallingBlock spawnFallingBlock(Location location, Material material, byte b) throws IllegalArgumentException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * @deprecated
     */
    @Override
    public FallingBlock spawnFallingBlock(Location location, int i, byte b) throws IllegalArgumentException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void playEffect(Location location, Effect effect, int data) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void playEffect(Location location, Effect effect, int data, int radius) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public <T> void playEffect(Location location, Effect effect, T t) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public <T> void playEffect(Location location, Effect effect, T t, int i) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ChunkSnapshot getEmptyChunkSnapshot(int i, int i2, boolean b, boolean b2) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setSpawnFlags(boolean allowMonsters, boolean allowFlags) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean getAllowAnimals() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean getAllowMonsters() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Biome getBiome(int x, int z) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setBiome(int x, int z, Biome biome) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public double getTemperature(int x, int z) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public double getHumidity(int x, int z) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getMaxHeight() {
        return Integer.MAX_VALUE;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getSeaLevel() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean getKeepSpawnInMemory() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setKeepSpawnInMemory(boolean b) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isAutoSave() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setAutoSave(boolean b) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setDifficulty(Difficulty difficulty) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Difficulty getDifficulty() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public File getWorldFolder() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public WorldType getWorldType() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean canGenerateStructures() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public long getTicksPerAnimalSpawns() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setTicksPerAnimalSpawns(int i) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public long getTicksPerMonsterSpawns() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setTicksPerMonsterSpawns(int i) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getMonsterSpawnLimit() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setMonsterSpawnLimit(int i) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getAnimalSpawnLimit() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setAnimalSpawnLimit(int i) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getWaterAnimalSpawnLimit() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setWaterAnimalSpawnLimit(int i) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getAmbientSpawnLimit() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setAmbientSpawnLimit(int i) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void playSound(Location location, Sound sound, float volume, float pitch) {
        // TODO: voxel-sfx
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String[] getGameRules() {
        return new String[0];  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getGameRuleValue(String s) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean setGameRuleValue(String s, String s2) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isGameRule(String s) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setMetadata(String s, MetadataValue metadataValue) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<MetadataValue> getMetadata(String s) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean hasMetadata(String s) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void removeMetadata(String s, Plugin plugin) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void sendPluginMessage(Plugin plugin, String s, byte[] bytes) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Set<String> getListeningPluginChannels() {
        return Collections.emptySet();
    }
}
