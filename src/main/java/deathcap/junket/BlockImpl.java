package deathcap.junket;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.*;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;

import java.util.Collection;
import java.util.List;

public class BlockImpl implements Block {
    /**
     * Gets the metadata for this block
     *
     * @return block specific metadata
     * @deprecated Magic value
     */
    @Override
    public byte getData() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Gets the block at the given offsets
     *
     * @param modX X-coordinate offset
     * @param modY Y-coordinate offset
     * @param modZ Z-coordinate offset
     * @return Block at the given offsets
     */
    @Override
    public Block getRelative(int modX, int modY, int modZ) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Gets the block at the given face
     * <p/>
     * This method is equal to getRelative(face, 1)
     *
     * @param face Face of this block to return
     * @return Block at the given face
     * @see #getRelative(org.bukkit.block.BlockFace, int)
     */
    @Override
    public Block getRelative(BlockFace face) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Gets the block at the given distance of the given face
     * <p/>
     * For example, the following method places water at 100,102,100; two
     * blocks above 100,100,100.
     * <p/>
     * <pre>
     * Block block = world.getBlockAt(100, 100, 100);
     * Block shower = block.getRelative(BlockFace.UP, 2);
     * shower.setType(Material.WATER);
     * </pre>
     *
     * @param face     Face of this block to return
     * @param distance Distance to get the block at
     * @return Block at the given face
     */
    @Override
    public Block getRelative(BlockFace face, int distance) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Gets the type of this block
     *
     * @return block type
     */
    @Override
    public Material getType() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Gets the type-id of this block
     *
     * @return block type-id
     * @deprecated Magic value
     */
    @Override
    public int getTypeId() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Gets the light level between 0-15
     *
     * @return light level
     */
    @Override
    public byte getLightLevel() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Get the amount of light at this block from the sky.
     * <p/>
     * Any light given from other sources (such as blocks like torches) will
     * be ignored.
     *
     * @return Sky light level
     */
    @Override
    public byte getLightFromSky() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Get the amount of light at this block from nearby blocks.
     * <p/>
     * Any light given from other sources (such as the sun) will be ignored.
     *
     * @return Block light level
     */
    @Override
    public byte getLightFromBlocks() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Gets the world which contains this Block
     *
     * @return World containing this block
     */
    @Override
    public World getWorld() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Gets the x-coordinate of this block
     *
     * @return x-coordinate
     */
    @Override
    public int getX() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Gets the y-coordinate of this block
     *
     * @return y-coordinate
     */
    @Override
    public int getY() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Gets the z-coordinate of this block
     *
     * @return z-coordinate
     */
    @Override
    public int getZ() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Gets the Location of the block
     *
     * @return Location of block
     */
    @Override
    public Location getLocation() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Stores the location of the block in the provided Location object.
     * <p/>
     * If the provided Location is null this method does nothing and returns
     * null.
     *
     * @return The Location object provided or null
     */
    @Override
    public Location getLocation(Location loc) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Gets the chunk which contains this block
     *
     * @return Containing Chunk
     */
    @Override
    public Chunk getChunk() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Sets the metadata for this block
     *
     * @param data New block specific metadata
     * @deprecated Magic value
     */
    @Override
    public void setData(byte data) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Sets the metadata for this block
     *
     * @param data         New block specific metadata
     * @param applyPhysics False to cancel physics from the changed block.
     * @deprecated Magic value
     */
    @Override
    public void setData(byte data, boolean applyPhysics) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Sets the type of this block
     *
     * @param type Material to change this block to
     */
    @Override
    public void setType(Material type) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Sets the type-id of this block
     *
     * @param type Type-Id to change this block to
     * @return whether the block was changed
     * @deprecated Magic value
     */
    @Override
    public boolean setTypeId(int type) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Sets the type-id of this block
     *
     * @param type         Type-Id to change this block to
     * @param applyPhysics False to cancel physics on the changed block.
     * @return whether the block was changed
     * @deprecated Magic value
     */
    @Override
    public boolean setTypeId(int type, boolean applyPhysics) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Sets the type-id of this block
     *
     * @param type         Type-Id to change this block to
     * @param data         The data value to change this block to
     * @param applyPhysics False to cancel physics on the changed block
     * @return whether the block was changed
     * @deprecated Magic value
     */
    @Override
    public boolean setTypeIdAndData(int type, byte data, boolean applyPhysics) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Gets the face relation of this block compared to the given block
     * <p/>
     * For example:
     * <pre>
     * Block current = world.getBlockAt(100, 100, 100);
     * Block target = world.getBlockAt(100, 101, 100);
     *
     * current.getFace(target) == BlockFace.Up;
     * </pre>
     * <br />
     * If the given block is not connected to this block, null may be returned
     *
     * @param block Block to compare against this block
     * @return BlockFace of this block which has the requested block, or null
     */
    @Override
    public BlockFace getFace(Block block) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Captures the current state of this block. You may then cast that state
     * into any accepted type, such as Furnace or Sign.
     * <p/>
     * The returned object will never be updated, and you are not guaranteed
     * that (for example) a sign is still a sign after you capture its state.
     *
     * @return BlockState with the current state of this block.
     */
    @Override
    public BlockState getState() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Returns the biome that this block resides in
     *
     * @return Biome type containing this block
     */
    @Override
    public Biome getBiome() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Sets the biome that this block resides in
     *
     * @param bio new Biome type for this block
     */
    @Override
    public void setBiome(Biome bio) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Returns true if the block is being powered by Redstone.
     *
     * @return True if the block is powered.
     */
    @Override
    public boolean isBlockPowered() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Returns true if the block is being indirectly powered by Redstone.
     *
     * @return True if the block is indirectly powered.
     */
    @Override
    public boolean isBlockIndirectlyPowered() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Returns true if the block face is being powered by Redstone.
     *
     * @param face The block face
     * @return True if the block face is powered.
     */
    @Override
    public boolean isBlockFacePowered(BlockFace face) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Returns true if the block face is being indirectly powered by Redstone.
     *
     * @param face The block face
     * @return True if the block face is indirectly powered.
     */
    @Override
    public boolean isBlockFaceIndirectlyPowered(BlockFace face) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Returns the redstone power being provided to this block face
     *
     * @param face the face of the block to query or BlockFace.SELF for the
     *             block itself
     * @return The power level.
     */
    @Override
    public int getBlockPower(BlockFace face) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Returns the redstone power being provided to this block
     *
     * @return The power level.
     */
    @Override
    public int getBlockPower() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Checks if this block is empty.
     * <p/>
     * A block is considered empty when {@link #getType()} returns {@link
     * org.bukkit.Material#AIR}.
     *
     * @return true if this block is empty
     */
    @Override
    public boolean isEmpty() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Checks if this block is liquid.
     * <p/>
     * A block is considered liquid when {@link #getType()} returns {@link
     * org.bukkit.Material#WATER}, {@link org.bukkit.Material#STATIONARY_WATER}, {@link
     * org.bukkit.Material#LAVA} or {@link org.bukkit.Material#STATIONARY_LAVA}.
     *
     * @return true if this block is liquid
     */
    @Override
    public boolean isLiquid() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Gets the temperature of the biome of this block
     *
     * @return Temperature of this block
     */
    @Override
    public double getTemperature() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Gets the humidity of the biome of this block
     *
     * @return Humidity of this block
     */
    @Override
    public double getHumidity() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Returns the reaction of the block when moved by a piston
     *
     * @return reaction
     */
    @Override
    public PistonMoveReaction getPistonMoveReaction() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Breaks the block and spawns items as if a player had digged it
     *
     * @return true if the block was destroyed
     */
    @Override
    public boolean breakNaturally() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Breaks the block and spawns items as if a player had digged it with a
     * specific tool
     *
     * @param tool The tool or item in hand used for digging
     * @return true if the block was destroyed
     */
    @Override
    public boolean breakNaturally(ItemStack tool) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Returns a list of items which would drop by destroying this block
     *
     * @return a list of dropped items for this type of block
     */
    @Override
    public Collection<ItemStack> getDrops() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Returns a list of items which would drop by destroying this block with
     * a specific tool
     *
     * @param tool The tool or item in hand used for digging
     * @return a list of dropped items for this type of block
     */
    @Override
    public Collection<ItemStack> getDrops(ItemStack tool) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Sets a metadata value in the implementing object's metadata store.
     *
     * @param metadataKey      A unique key to identify this metadata.
     * @param newMetadataValue The metadata value to apply.
     * @throws IllegalArgumentException If value is null, or the owning plugin
     *                                  is null
     */
    @Override
    public void setMetadata(String metadataKey, MetadataValue newMetadataValue) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Returns a list of previously set metadata values from the implementing
     * object's metadata store.
     *
     * @param metadataKey the unique metadata key being sought.
     * @return A list of values, one for each plugin that has set the
     *         requested value.
     */
    @Override
    public List<MetadataValue> getMetadata(String metadataKey) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Tests to see whether the implementing object contains the given
     * metadata value in its metadata store.
     *
     * @param metadataKey the unique metadata key being queried.
     * @return the existence of the metadataKey within subject.
     */
    @Override
    public boolean hasMetadata(String metadataKey) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Removes the given metadata value from the implementing object's
     * metadata store.
     *
     * @param metadataKey  the unique metadata key identifying the metadata to
     *                     remove.
     * @param owningPlugin This plugin's metadata value will be removed. All
     *                     other values will be left untouched.
     * @throws IllegalArgumentException If plugin is null
     */
    @Override
    public void removeMetadata(String metadataKey, Plugin owningPlugin) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
