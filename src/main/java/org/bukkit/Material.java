package org.bukkit;

import org.bukkit.material.MaterialData;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Replacement class for org.bukkit.Material enum from Bukkit
 */
public class Material extends deathcap.junket.PlaceholderEnum { // => extends java.lang.Enum

    // names expected by Bukkit plugins, enum and ordinal (has to match for compiled switch() statements)
    private final String bukkitName;
    private final int bukkitIndex;

    private Material(String bukkitName, int bukkitIndex) {
        super(bukkitName, bukkitIndex);

        this.bukkitName = bukkitName;
        this.bukkitIndex = bukkitIndex;

        if (Material.name2id.containsKey(bukkitName)) {
            throw new RuntimeException("duplicate material registration, name="+bukkitName+", index="+bukkitIndex+" already exists at index="+name2id.get(bukkitName));
        }

        // extend array to fit new materials
        // requires copying, see http://www.javadb.com/extend-the-size-of-an-array/
        int maxIndex = Math.max(ENUM$VALUES.length - 1, bukkitIndex);
        Material newValues[] = new Material[maxIndex + 1];
        System.arraycopy(ENUM$VALUES, 0, newValues, 0, ENUM$VALUES.length);
        Material.ENUM$VALUES = newValues;

        // save for easy lookup
        Material.ENUM$VALUES[bukkitIndex] = this;
        Material.name2id.put(bukkitName, bukkitIndex);
    }

    // array ordinal -> Material
    public static Material ENUM$VALUES[] = new Material[] { };

    private static Map<String, Integer> name2id = new HashMap<String, Integer>();

    // well-known materials part of the API - TODO: can we add dynamically in the constructor?
    public static Material STONE = new Material("STONE", 1);
    public static Material DIRT = new Material("DIRT", 3);
    public static Material SAND = new Material("SAND", 12);

    public static Material getMaterial(String name) {
        if (!Material.name2id.containsKey(name)) {
            return null;
        }

        int id = Material.name2id.get(name);
        return Material.ENUM$VALUES[id];
    }

    @Deprecated
    public static Material getMaterial(final int id) {
        return Material.ENUM$VALUES[id];
    }

    public static Material[] values() {
        return Material.ENUM$VALUES;
    }

    public static Material matchMaterial(final String name) {
        return Material.getMaterial(name); // TODO: fuzzy match, case, whitespace
    }


    @Deprecated
    public int getId() {
        return this.bukkitIndex;
    }

    public int getMaxStackSize() {
        return 64;
    }

    public int getDurability() {
        return 1;
    }

    public Class<? extends MaterialData> getData() {
        // TODO: somehow map MaterialData to voxel-registry metablocks
        return null;
    }

    @Deprecated
    public MaterialData getNewData(final byte raw) {
        return null;
    }

    public boolean isBlock() {
        return true; // TODO: voxel-registry isBlock()
    }

    public boolean isFood() {
        return false; // TODO: voxel-food, registry foodLevel?
    }

    public boolean isRecord() {
        return false;
    }

    public boolean isSolid() {
        // TODO: property after https://github.com/deathcap/voxel-ideas/issues/3 custom block models
        return true;
    }

    public boolean isOccluding() {
        // TODO: property after https://github.com/deathcap/voxel-ideas/issues/3 custom block models
        return true;
    }

    public boolean isTransparent() {
        return false; // TODO: voxel-registry isTransparent
    }

    public boolean isFlammable() {
        return false;
    }

    public boolean isBurnable() {
        return false;
    }

    public boolean hasGravity() {
        // TODO: after https://github.com/deathcap/voxel-ideas/issues/22 gravity-affected blocks
        return false;
    }

    /* can't override final methods - these are provided by java.lang.Enum
    public int ordinal() {
        return this.bukkitIndex;
    }

    public String name() {
        return this.bukkitName;
    }

    public String toString() {
        return this.bukkitName;
    }
    */

}
