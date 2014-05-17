package deathcap.junket;

import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

public class InventoryImpl implements Inventory {
    @Override
    public int getSize() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getMaxStackSize() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setMaxStackSize(int size) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getName() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ItemStack getItem(int index) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setItem(int index, ItemStack item) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public HashMap<Integer, ItemStack> addItem(ItemStack... items) throws IllegalArgumentException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public HashMap<Integer, ItemStack> removeItem(ItemStack... items) throws IllegalArgumentException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ItemStack[] getContents() {
        return new ItemStack[0];  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setContents(ItemStack[] items) throws IllegalArgumentException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean contains(int materialId) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean contains(Material material) throws IllegalArgumentException {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean contains(ItemStack item) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean contains(int materialId, int amount) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean contains(Material material, int amount) throws IllegalArgumentException {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean contains(ItemStack item, int amount) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean containsAtLeast(ItemStack item, int amount) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public HashMap<Integer, ? extends ItemStack> all(int materialId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public HashMap<Integer, ? extends ItemStack> all(Material material) throws IllegalArgumentException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public HashMap<Integer, ? extends ItemStack> all(ItemStack item) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int first(int materialId) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int first(Material material) throws IllegalArgumentException {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int first(ItemStack item) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int firstEmpty() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void remove(int materialId) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void remove(Material material) throws IllegalArgumentException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void remove(ItemStack item) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void clear(int index) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void clear() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<HumanEntity> getViewers() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getTitle() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public InventoryType getType() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public InventoryHolder getHolder() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ListIterator<ItemStack> iterator() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ListIterator<ItemStack> iterator(int index) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

}
