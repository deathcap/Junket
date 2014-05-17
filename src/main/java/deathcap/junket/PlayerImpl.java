package deathcap.junket;

import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.conversations.Conversation;
import org.bukkit.conversations.ConversationAbandonedEvent;
import org.bukkit.entity.*;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.inventory.*;
import org.bukkit.map.MapView;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.util.Vector;

import java.net.InetSocketAddress;
import java.util.*;

public class PlayerImpl implements Player {

    private WorldImpl world;

    public PlayerImpl(WorldImpl world) {
        this.world = world;
    }

    @Override
    public String getDisplayName() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setDisplayName(String name) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getPlayerListName() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setPlayerListName(String name) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setCompassTarget(Location loc) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Location getCompassTarget() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public InetSocketAddress getAddress() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isConversing() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void acceptConversationInput(String input) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean beginConversation(Conversation conversation) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void abandonConversation(Conversation conversation) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void abandonConversation(Conversation conversation, ConversationAbandonedEvent details) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void sendRawMessage(String message) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void kickPlayer(String message) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void chat(String msg) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean performCommand(String command) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isSneaking() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setSneaking(boolean sneak) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isSprinting() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setSprinting(boolean sprinting) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void saveData() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void loadData() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setSleepingIgnored(boolean isSleeping) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isSleepingIgnored() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void playNote(Location loc, byte instrument, byte note) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void playNote(Location loc, Instrument instrument, Note note) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void playSound(Location location, Sound sound, float volume, float pitch) {
        // TODO: voxel-sfx
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void playSound(Location location, String sound, float volume, float pitch) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void playEffect(Location loc, Effect effect, int data) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public <T> void playEffect(Location loc, Effect effect, T data) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void sendBlockChange(Location loc, Material material, byte data) {
        // TODO: should be same as setMaterial for now (single-player)
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean sendChunkChange(Location loc, int sx, int sy, int sz, byte[] data) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void sendBlockChange(Location loc, int material, byte data) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void sendSignChange(Location loc, String[] lines) throws IllegalArgumentException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void sendMap(MapView map) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void updateInventory() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void awardAchievement(Achievement achievement) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void removeAchievement(Achievement achievement) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean hasAchievement(Achievement achievement) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void incrementStatistic(Statistic statistic) throws IllegalArgumentException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void decrementStatistic(Statistic statistic) throws IllegalArgumentException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void incrementStatistic(Statistic statistic, int amount) throws IllegalArgumentException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void decrementStatistic(Statistic statistic, int amount) throws IllegalArgumentException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setStatistic(Statistic statistic, int newValue) throws IllegalArgumentException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getStatistic(Statistic statistic) throws IllegalArgumentException {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void incrementStatistic(Statistic statistic, Material material) throws IllegalArgumentException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void decrementStatistic(Statistic statistic, Material material) throws IllegalArgumentException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getStatistic(Statistic statistic, Material material) throws IllegalArgumentException {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void incrementStatistic(Statistic statistic, Material material, int amount) throws IllegalArgumentException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void decrementStatistic(Statistic statistic, Material material, int amount) throws IllegalArgumentException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setStatistic(Statistic statistic, Material material, int newValue) throws IllegalArgumentException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void incrementStatistic(Statistic statistic, EntityType entityType) throws IllegalArgumentException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void decrementStatistic(Statistic statistic, EntityType entityType) throws IllegalArgumentException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getStatistic(Statistic statistic, EntityType entityType) throws IllegalArgumentException {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void incrementStatistic(Statistic statistic, EntityType entityType, int amount) throws IllegalArgumentException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void decrementStatistic(Statistic statistic, EntityType entityType, int amount) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setStatistic(Statistic statistic, EntityType entityType, int newValue) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setPlayerTime(long time, boolean relative) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public long getPlayerTime() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public long getPlayerTimeOffset() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isPlayerTimeRelative() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void resetPlayerTime() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setPlayerWeather(WeatherType type) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public WeatherType getPlayerWeather() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void resetPlayerWeather() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void giveExp(int amount) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void giveExpLevels(int amount) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public float getExp() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setExp(float exp) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getLevel() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setLevel(int level) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getTotalExperience() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setTotalExperience(int exp) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public float getExhaustion() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setExhaustion(float value) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public float getSaturation() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setSaturation(float value) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getFoodLevel() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setFoodLevel(int value) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Location getBedSpawnLocation() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setBedSpawnLocation(Location location) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setBedSpawnLocation(Location location, boolean force) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean getAllowFlight() {
        // TODO: voxel-fly
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setAllowFlight(boolean flight) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void hidePlayer(Player player) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void showPlayer(Player player) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean canSee(Player player) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Location getLocation() {
        // TODO: voxel-player or avatar
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Location getLocation(Location loc) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setVelocity(Vector velocity) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Vector getVelocity() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isOnGround() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public World getWorld() {
        return this.world;
    }

    @Override
    public boolean teleport(Location location) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean teleport(Location location, PlayerTeleportEvent.TeleportCause cause) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean teleport(Entity destination) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean teleport(Entity destination, PlayerTeleportEvent.TeleportCause cause) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Entity> getNearbyEntities(double x, double y, double z) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getEntityId() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getFireTicks() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getMaxFireTicks() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setFireTicks(int ticks) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void remove() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isDead() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public Server getServer() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Entity getPassenger() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean setPassenger(Entity passenger) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isEmpty() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean eject() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public float getFallDistance() {
        // TODO: voxel-physical fallDistance
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setFallDistance(float distance) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setLastDamageCause(EntityDamageEvent event) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public EntityDamageEvent getLastDamageCause() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public UUID getUniqueId() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isBanned() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setBanned(boolean banned) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isWhitelisted() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setWhitelisted(boolean value) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Player getPlayer() {
        return this; // funny, but this is from OfflinePlayer (could be null if wasn't online)
    }

    @Override
    public long getFirstPlayed() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public long getLastPlayed() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean hasPlayedBefore() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getTicksLived() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setTicksLived(int value) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void playEffect(EntityEffect type) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public EntityType getType() {
        return EntityType.PLAYER;
    }

    @Override
    public boolean isInsideVehicle() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean leaveVehicle() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Entity getVehicle() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isFlying() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setFlying(boolean value) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setFlySpeed(float value) throws IllegalArgumentException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setWalkSpeed(float value) throws IllegalArgumentException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public float getFlySpeed() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public float getWalkSpeed() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setTexturePack(String url) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setResourcePack(String url) {
        // TODO: voxel-artpacks
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Scoreboard getScoreboard() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setScoreboard(Scoreboard scoreboard) throws IllegalArgumentException, IllegalStateException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isHealthScaled() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setHealthScaled(boolean scale) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setHealthScale(double scale) throws IllegalArgumentException {
        // TODO: voxel-health
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public double getHealthScale() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void sendMessage(String message) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void sendMessage(String[] messages) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Map<String, Object> serialize() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isOnline() {
        return true;
    }

    @Override
    public String getName() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public PlayerInventory getInventory() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Inventory getEnderChest() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean setWindowProperty(InventoryView.Property prop, int value) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public InventoryView getOpenInventory() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public InventoryView openInventory(Inventory inventory) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public InventoryView openWorkbench(Location location, boolean force) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public InventoryView openEnchanting(Location location, boolean force) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void openInventory(InventoryView inventory) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void closeInventory() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ItemStack getItemInHand() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setItemInHand(ItemStack item) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ItemStack getItemOnCursor() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setItemOnCursor(ItemStack item) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isSleeping() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getSleepTicks() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public GameMode getGameMode() {
        // TODO: voxel-gamemode
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setGameMode(GameMode mode) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isBlocking() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getExpToLevel() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public double getEyeHeight() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public double getEyeHeight(boolean ignoreSneaking) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Location getEyeLocation() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Block> getLineOfSight(HashSet<Byte> transparent, int maxDistance) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Block getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent, int maxDistance) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Egg throwEgg() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Snowball throwSnowball() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Arrow shootArrow() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getRemainingAir() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setRemainingAir(int ticks) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getMaximumAir() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setMaximumAir(int ticks) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getMaximumNoDamageTicks() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setMaximumNoDamageTicks(int ticks) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public double getLastDamage() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int _INVALID_getLastDamage() {
        return (int)this.getLastDamage();
    }

    @Override
    public void setLastDamage(double damage) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void _INVALID_setLastDamage(int damage) {
        this.setLastDamage(damage);
    }

    @Override
    public int getNoDamageTicks() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setNoDamageTicks(int ticks) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Player getKiller() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean addPotionEffect(PotionEffect effect) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean addPotionEffect(PotionEffect effect, boolean force) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean addPotionEffects(Collection<PotionEffect> effects) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean hasPotionEffect(PotionEffectType type) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void removePotionEffect(PotionEffectType type) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Collection<PotionEffect> getActivePotionEffects() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean hasLineOfSight(Entity other) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean getRemoveWhenFarAway() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setRemoveWhenFarAway(boolean remove) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public EntityEquipment getEquipment() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setCanPickupItems(boolean pickup) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean getCanPickupItems() {
        return true;
    }

    @Override
    public void setCustomName(String name) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getCustomName() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setCustomNameVisible(boolean flag) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isCustomNameVisible() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isLeashed() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Entity getLeashHolder() throws IllegalStateException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean setLeashHolder(Entity holder) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void damage(double amount) {
        // TODO: voxel-health damage()
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void _INVALID_damage(int amount) {
        this.damage(amount);
    }

    @Override
    public void damage(double amount, Entity source) {
        this.damage(amount);
        // TODO: use source
    }

    @Override
    public void _INVALID_damage(int amount, Entity source) {
        this.damage(amount, source);
    }

    @Override
    public double getHealth() {
        // TODO: voxel-health
        //To change body of implemented methods use File | Settings | File Templates.
        return 0.0;
    }

    @Override
    public int _INVALID_getHealth() {
        return (int)this.getHealth();
    }

    @Override
    public void setHealth(double health) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void _INVALID_setHealth(int health) {
        this.setHealth(health);
    }

    @Override
    public double getMaxHealth() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int _INVALID_getMaxHealth() {
        return (int)this.getMaxHealth();
    }

    @Override
    public void setMaxHealth(double health) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void _INVALID_setMaxHealth(int health) {
        this.setMaxHealth(health);
    }

    @Override
    public void resetMaxHealth() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setMetadata(String metadataKey, MetadataValue newMetadataValue) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<MetadataValue> getMetadata(String metadataKey) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean hasMetadata(String metadataKey) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void removeMetadata(String metadataKey, Plugin owningPlugin) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isPermissionSet(String name) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isPermissionSet(Permission perm) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean hasPermission(String name) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean hasPermission(Permission perm) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public PermissionAttachment addAttachment(Plugin plugin, String name, boolean value) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public PermissionAttachment addAttachment(Plugin plugin) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public PermissionAttachment addAttachment(Plugin plugin, String name, boolean value, int ticks) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public PermissionAttachment addAttachment(Plugin plugin, int ticks) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void removeAttachment(PermissionAttachment attachment) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void recalculatePermissions() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Set<PermissionAttachmentInfo> getEffectivePermissions() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void sendPluginMessage(Plugin source, String channel, byte[] message) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Set<String> getListeningPluginChannels() {
        return Collections.emptySet();
    }

    @Override
    public <T extends Projectile> T launchProjectile(Class<? extends T> projectile) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public <T extends Projectile> T launchProjectile(Class<? extends T> projectile, Vector velocity) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isOp() {
        return true;
    }

    @Override
    public void setOp(boolean value) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
