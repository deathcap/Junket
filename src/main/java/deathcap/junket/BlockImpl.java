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

    // location coordinates (wish these could be long, but interface requires int)
    private final WorldImpl w;
    private final int x;
    private final int y;
    private final int z;

    public BlockImpl(WorldImpl w, int x, int y, int z) {
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    @Deprecated
    public byte getData() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Block getRelative(int modX, int modY, int modZ) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Block getRelative(BlockFace face) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Block getRelative(BlockFace face, int distance) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Material getType() {
        // TODO: voxel-engine getBlock()
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Deprecated
    @Override
    public int getTypeId() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public byte getLightLevel() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public byte getLightFromSky() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public byte getLightFromBlocks() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public World getWorld() {
        return this.w;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getZ() {
        return z;
    }

    @Override
    public Location getLocation() {
        return new Location(w, x, y, z);
    }

    @Override
    public Location getLocation(Location loc) {
        if (loc != null) {
            loc.setWorld(w);
            loc.setX(x);
            loc.setY(y);
            loc.setZ(z);
        }

        return loc;
    }

    @Override
    public Chunk getChunk() {
        // TODO: voxel-engine .voxels.getChunkAtPosition()
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setData(byte data) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setData(byte data, boolean applyPhysics) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setType(Material type) {
        // TODO: voxel-engine setBlock()
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Deprecated
    @Override
    public boolean setTypeId(int type) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Deprecated
    @Override
    public boolean setTypeId(int type, boolean applyPhysics) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Deprecated
    @Override
    public boolean setTypeIdAndData(int type, byte data, boolean applyPhysics) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public BlockFace getFace(Block block) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public BlockState getState() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Biome getBiome() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setBiome(Biome bio) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isBlockPowered() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isBlockIndirectlyPowered() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isBlockFacePowered(BlockFace face) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isBlockFaceIndirectlyPowered(BlockFace face) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getBlockPower(BlockFace face) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getBlockPower() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isEmpty() {
        return this.getType() != Material.AIR; // TODO: also support non-air empty blocks?
    }

    @Override
    public boolean isLiquid() {
        // TODO: voxel-registry .fluid
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public double getTemperature() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public double getHumidity() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public PistonMoveReaction getPistonMoveReaction() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean breakNaturally() {
        // TODO: voxel-mine
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean breakNaturally(ItemStack tool) {
        // TODO: voxel-harvest block2ItemPile
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Collection<ItemStack> getDrops() {
        // TODO: voxel-registry getProp(block, 'itemDrop')
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Collection<ItemStack> getDrops(ItemStack tool) {
        // TODO: voxel-registry check requiredTool, tool class, if matches return drop
        return null;  //To change body of implemented methods use File | Settings | File Templates.
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
}
