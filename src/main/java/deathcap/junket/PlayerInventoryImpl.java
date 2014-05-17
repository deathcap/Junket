package deathcap.junket;

import org.bukkit.entity.HumanEntity;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

@SuppressWarnings("deprecation")
public class PlayerInventoryImpl extends InventoryImpl implements PlayerInventory {
    @Override
    public ItemStack[] getArmorContents() {
        return new ItemStack[4];  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ItemStack getHelmet() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ItemStack getChestplate() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ItemStack getLeggings() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ItemStack getBoots() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setArmorContents(ItemStack[] items) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setHelmet(ItemStack helmet) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setChestplate(ItemStack chestplate) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setLeggings(ItemStack leggings) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setBoots(ItemStack boots) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ItemStack getItemInHand() {
        // TODO: voxel-carry / voxel-inventory-hotbar getHeld()
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setItemInHand(ItemStack stack) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getHeldItemSlot() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setHeldItemSlot(int slot) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int clear(int id, int data) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }


    @Override // overrides InventoryHolder getHolder() from Inventory
    public HumanEntity getHolder()
    {
        return null;
    }
}
