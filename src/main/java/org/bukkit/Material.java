package org.bukkit;

import org.bukkit.material.MaterialData;

import java.lang.reflect.Field;
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

    public Material(String bukkitName, int bukkitIndex) {
        super(bukkitName, bukkitIndex);

        this.bukkitName = bukkitName;
        this.bukkitIndex = bukkitIndex;

        if (Material.name2id.containsKey(bukkitName)) {
            throw new RuntimeException("duplicate material registration, name="+bukkitName+", index="+bukkitIndex+" already exists at index="+name2id.get(bukkitName));
        }

        if (bukkitIndex < Material.ENUM$VALUES.length && Material.ENUM$VALUES[bukkitIndex] != null) {
            throw new RuntimeException("duplicate material registration, index="+bukkitIndex+", name="+bukkitName+" already exists with name="+Material.ENUM$VALUES[bukkitIndex].bukkitName);
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

        // populate the API fields, if they exist for this material
        try {
            Field field = this.getClass().getDeclaredField(bukkitName);

            field.set(null, this);
        } catch (NoSuchFieldException ex) {
            // that's ok - material outside of the API
        } catch (IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }
    }
    // TODO: constructor to add materials _without_ an explicit index (for new materials not part of Bukkit)

    // array ordinal -> Material
    public static Material ENUM$VALUES[] = new Material[] { };

    private static Map<String, Integer> name2id = new HashMap<String, Integer>();

    // value materials are set to before registered (or might not be registered at all)
    public static Material UNSUPPORTED = new Material("UNSUPPORTED", 255);


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

    public short getMaxDurability() {
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


    // well-known material fields part of the Bukkit API
    // set to Material instances when the materials are loaded
    // must match the org.bukkit.Material fields javap -cp target/bukkit-1.7.9-R0.2-SNAPSHOT.jar org.bukkit.Material|fgrep 'public static final org.bukkit.Material'|perl -pe's/final org.bukkit.//g'|perl -pe's/;/ = UNSUPPORTED;/g'|pbcopy

    public static Material AIR = UNSUPPORTED;
    public static Material STONE = UNSUPPORTED;
    public static Material GRASS = UNSUPPORTED;
    public static Material DIRT = UNSUPPORTED;
    public static Material COBBLESTONE = UNSUPPORTED;
    public static Material WOOD = UNSUPPORTED;
    public static Material SAPLING = UNSUPPORTED;
    public static Material BEDROCK = UNSUPPORTED;
    public static Material WATER = UNSUPPORTED;
    public static Material STATIONARY_WATER = UNSUPPORTED;
    public static Material LAVA = UNSUPPORTED;
    public static Material STATIONARY_LAVA = UNSUPPORTED;
    public static Material SAND = UNSUPPORTED;
    public static Material GRAVEL = UNSUPPORTED;
    public static Material GOLD_ORE = UNSUPPORTED;
    public static Material IRON_ORE = UNSUPPORTED;
    public static Material COAL_ORE = UNSUPPORTED;
    public static Material LOG = UNSUPPORTED;
    public static Material LEAVES = UNSUPPORTED;
    public static Material SPONGE = UNSUPPORTED;
    public static Material GLASS = UNSUPPORTED;
    public static Material LAPIS_ORE = UNSUPPORTED;
    public static Material LAPIS_BLOCK = UNSUPPORTED;
    public static Material DISPENSER = UNSUPPORTED;
    public static Material SANDSTONE = UNSUPPORTED;
    public static Material NOTE_BLOCK = UNSUPPORTED;
    public static Material BED_BLOCK = UNSUPPORTED;
    public static Material POWERED_RAIL = UNSUPPORTED;
    public static Material DETECTOR_RAIL = UNSUPPORTED;
    public static Material PISTON_STICKY_BASE = UNSUPPORTED;
    public static Material WEB = UNSUPPORTED;
    public static Material LONG_GRASS = UNSUPPORTED;
    public static Material DEAD_BUSH = UNSUPPORTED;
    public static Material PISTON_BASE = UNSUPPORTED;
    public static Material PISTON_EXTENSION = UNSUPPORTED;
    public static Material WOOL = UNSUPPORTED;
    public static Material PISTON_MOVING_PIECE = UNSUPPORTED;
    public static Material YELLOW_FLOWER = UNSUPPORTED;
    public static Material RED_ROSE = UNSUPPORTED;
    public static Material BROWN_MUSHROOM = UNSUPPORTED;
    public static Material RED_MUSHROOM = UNSUPPORTED;
    public static Material GOLD_BLOCK = UNSUPPORTED;
    public static Material IRON_BLOCK = UNSUPPORTED;
    public static Material DOUBLE_STEP = UNSUPPORTED;
    public static Material STEP = UNSUPPORTED;
    public static Material BRICK = UNSUPPORTED;
    public static Material TNT = UNSUPPORTED;
    public static Material BOOKSHELF = UNSUPPORTED;
    public static Material MOSSY_COBBLESTONE = UNSUPPORTED;
    public static Material OBSIDIAN = UNSUPPORTED;
    public static Material TORCH = UNSUPPORTED;
    public static Material FIRE = UNSUPPORTED;
    public static Material MOB_SPAWNER = UNSUPPORTED;
    public static Material WOOD_STAIRS = UNSUPPORTED;
    public static Material CHEST = UNSUPPORTED;
    public static Material REDSTONE_WIRE = UNSUPPORTED;
    public static Material DIAMOND_ORE = UNSUPPORTED;
    public static Material DIAMOND_BLOCK = UNSUPPORTED;
    public static Material WORKBENCH = UNSUPPORTED;
    public static Material CROPS = UNSUPPORTED;
    public static Material SOIL = UNSUPPORTED;
    public static Material FURNACE = UNSUPPORTED;
    public static Material BURNING_FURNACE = UNSUPPORTED;
    public static Material SIGN_POST = UNSUPPORTED;
    public static Material WOODEN_DOOR = UNSUPPORTED;
    public static Material LADDER = UNSUPPORTED;
    public static Material RAILS = UNSUPPORTED;
    public static Material COBBLESTONE_STAIRS = UNSUPPORTED;
    public static Material WALL_SIGN = UNSUPPORTED;
    public static Material LEVER = UNSUPPORTED;
    public static Material STONE_PLATE = UNSUPPORTED;
    public static Material IRON_DOOR_BLOCK = UNSUPPORTED;
    public static Material WOOD_PLATE = UNSUPPORTED;
    public static Material REDSTONE_ORE = UNSUPPORTED;
    public static Material GLOWING_REDSTONE_ORE = UNSUPPORTED;
    public static Material REDSTONE_TORCH_OFF = UNSUPPORTED;
    public static Material REDSTONE_TORCH_ON = UNSUPPORTED;
    public static Material STONE_BUTTON = UNSUPPORTED;
    public static Material SNOW = UNSUPPORTED;
    public static Material ICE = UNSUPPORTED;
    public static Material SNOW_BLOCK = UNSUPPORTED;
    public static Material CACTUS = UNSUPPORTED;
    public static Material CLAY = UNSUPPORTED;
    public static Material SUGAR_CANE_BLOCK = UNSUPPORTED;
    public static Material JUKEBOX = UNSUPPORTED;
    public static Material FENCE = UNSUPPORTED;
    public static Material PUMPKIN = UNSUPPORTED;
    public static Material NETHERRACK = UNSUPPORTED;
    public static Material SOUL_SAND = UNSUPPORTED;
    public static Material GLOWSTONE = UNSUPPORTED;
    public static Material PORTAL = UNSUPPORTED;
    public static Material JACK_O_LANTERN = UNSUPPORTED;
    public static Material CAKE_BLOCK = UNSUPPORTED;
    public static Material DIODE_BLOCK_OFF = UNSUPPORTED;
    public static Material DIODE_BLOCK_ON = UNSUPPORTED;
    public static Material LOCKED_CHEST = UNSUPPORTED;
    public static Material STAINED_GLASS = UNSUPPORTED;
    public static Material TRAP_DOOR = UNSUPPORTED;
    public static Material MONSTER_EGGS = UNSUPPORTED;
    public static Material SMOOTH_BRICK = UNSUPPORTED;
    public static Material HUGE_MUSHROOM_1 = UNSUPPORTED;
    public static Material HUGE_MUSHROOM_2 = UNSUPPORTED;
    public static Material IRON_FENCE = UNSUPPORTED;
    public static Material THIN_GLASS = UNSUPPORTED;
    public static Material MELON_BLOCK = UNSUPPORTED;
    public static Material PUMPKIN_STEM = UNSUPPORTED;
    public static Material MELON_STEM = UNSUPPORTED;
    public static Material VINE = UNSUPPORTED;
    public static Material FENCE_GATE = UNSUPPORTED;
    public static Material BRICK_STAIRS = UNSUPPORTED;
    public static Material SMOOTH_STAIRS = UNSUPPORTED;
    public static Material MYCEL = UNSUPPORTED;
    public static Material WATER_LILY = UNSUPPORTED;
    public static Material NETHER_BRICK = UNSUPPORTED;
    public static Material NETHER_FENCE = UNSUPPORTED;
    public static Material NETHER_BRICK_STAIRS = UNSUPPORTED;
    public static Material NETHER_WARTS = UNSUPPORTED;
    public static Material ENCHANTMENT_TABLE = UNSUPPORTED;
    public static Material BREWING_STAND = UNSUPPORTED;
    public static Material CAULDRON = UNSUPPORTED;
    public static Material ENDER_PORTAL = UNSUPPORTED;
    public static Material ENDER_PORTAL_FRAME = UNSUPPORTED;
    public static Material ENDER_STONE = UNSUPPORTED;
    public static Material DRAGON_EGG = UNSUPPORTED;
    public static Material REDSTONE_LAMP_OFF = UNSUPPORTED;
    public static Material REDSTONE_LAMP_ON = UNSUPPORTED;
    public static Material WOOD_DOUBLE_STEP = UNSUPPORTED;
    public static Material WOOD_STEP = UNSUPPORTED;
    public static Material COCOA = UNSUPPORTED;
    public static Material SANDSTONE_STAIRS = UNSUPPORTED;
    public static Material EMERALD_ORE = UNSUPPORTED;
    public static Material ENDER_CHEST = UNSUPPORTED;
    public static Material TRIPWIRE_HOOK = UNSUPPORTED;
    public static Material TRIPWIRE = UNSUPPORTED;
    public static Material EMERALD_BLOCK = UNSUPPORTED;
    public static Material SPRUCE_WOOD_STAIRS = UNSUPPORTED;
    public static Material BIRCH_WOOD_STAIRS = UNSUPPORTED;
    public static Material JUNGLE_WOOD_STAIRS = UNSUPPORTED;
    public static Material COMMAND = UNSUPPORTED;
    public static Material BEACON = UNSUPPORTED;
    public static Material COBBLE_WALL = UNSUPPORTED;
    public static Material FLOWER_POT = UNSUPPORTED;
    public static Material CARROT = UNSUPPORTED;
    public static Material POTATO = UNSUPPORTED;
    public static Material WOOD_BUTTON = UNSUPPORTED;
    public static Material SKULL = UNSUPPORTED;
    public static Material ANVIL = UNSUPPORTED;
    public static Material TRAPPED_CHEST = UNSUPPORTED;
    public static Material GOLD_PLATE = UNSUPPORTED;
    public static Material IRON_PLATE = UNSUPPORTED;
    public static Material REDSTONE_COMPARATOR_OFF = UNSUPPORTED;
    public static Material REDSTONE_COMPARATOR_ON = UNSUPPORTED;
    public static Material DAYLIGHT_DETECTOR = UNSUPPORTED;
    public static Material REDSTONE_BLOCK = UNSUPPORTED;
    public static Material QUARTZ_ORE = UNSUPPORTED;
    public static Material HOPPER = UNSUPPORTED;
    public static Material QUARTZ_BLOCK = UNSUPPORTED;
    public static Material QUARTZ_STAIRS = UNSUPPORTED;
    public static Material ACTIVATOR_RAIL = UNSUPPORTED;
    public static Material DROPPER = UNSUPPORTED;
    public static Material STAINED_CLAY = UNSUPPORTED;
    public static Material STAINED_GLASS_PANE = UNSUPPORTED;
    public static Material LEAVES_2 = UNSUPPORTED;
    public static Material LOG_2 = UNSUPPORTED;
    public static Material ACACIA_STAIRS = UNSUPPORTED;
    public static Material DARK_OAK_STAIRS = UNSUPPORTED;
    public static Material HAY_BLOCK = UNSUPPORTED;
    public static Material CARPET = UNSUPPORTED;
    public static Material HARD_CLAY = UNSUPPORTED;
    public static Material COAL_BLOCK = UNSUPPORTED;
    public static Material PACKED_ICE = UNSUPPORTED;
    public static Material DOUBLE_PLANT = UNSUPPORTED;
    public static Material IRON_SPADE = UNSUPPORTED;
    public static Material IRON_PICKAXE = UNSUPPORTED;
    public static Material IRON_AXE = UNSUPPORTED;
    public static Material FLINT_AND_STEEL = UNSUPPORTED;
    public static Material APPLE = UNSUPPORTED;
    public static Material BOW = UNSUPPORTED;
    public static Material ARROW = UNSUPPORTED;
    public static Material COAL = UNSUPPORTED;
    public static Material DIAMOND = UNSUPPORTED;
    public static Material IRON_INGOT = UNSUPPORTED;
    public static Material GOLD_INGOT = UNSUPPORTED;
    public static Material IRON_SWORD = UNSUPPORTED;
    public static Material WOOD_SWORD = UNSUPPORTED;
    public static Material WOOD_SPADE = UNSUPPORTED;
    public static Material WOOD_PICKAXE = UNSUPPORTED;
    public static Material WOOD_AXE = UNSUPPORTED;
    public static Material STONE_SWORD = UNSUPPORTED;
    public static Material STONE_SPADE = UNSUPPORTED;
    public static Material STONE_PICKAXE = UNSUPPORTED;
    public static Material STONE_AXE = UNSUPPORTED;
    public static Material DIAMOND_SWORD = UNSUPPORTED;
    public static Material DIAMOND_SPADE = UNSUPPORTED;
    public static Material DIAMOND_PICKAXE = UNSUPPORTED;
    public static Material DIAMOND_AXE = UNSUPPORTED;
    public static Material STICK = UNSUPPORTED;
    public static Material BOWL = UNSUPPORTED;
    public static Material MUSHROOM_SOUP = UNSUPPORTED;
    public static Material GOLD_SWORD = UNSUPPORTED;
    public static Material GOLD_SPADE = UNSUPPORTED;
    public static Material GOLD_PICKAXE = UNSUPPORTED;
    public static Material GOLD_AXE = UNSUPPORTED;
    public static Material STRING = UNSUPPORTED;
    public static Material FEATHER = UNSUPPORTED;
    public static Material SULPHUR = UNSUPPORTED;
    public static Material WOOD_HOE = UNSUPPORTED;
    public static Material STONE_HOE = UNSUPPORTED;
    public static Material IRON_HOE = UNSUPPORTED;
    public static Material DIAMOND_HOE = UNSUPPORTED;
    public static Material GOLD_HOE = UNSUPPORTED;
    public static Material SEEDS = UNSUPPORTED;
    public static Material WHEAT = UNSUPPORTED;
    public static Material BREAD = UNSUPPORTED;
    public static Material LEATHER_HELMET = UNSUPPORTED;
    public static Material LEATHER_CHESTPLATE = UNSUPPORTED;
    public static Material LEATHER_LEGGINGS = UNSUPPORTED;
    public static Material LEATHER_BOOTS = UNSUPPORTED;
    public static Material CHAINMAIL_HELMET = UNSUPPORTED;
    public static Material CHAINMAIL_CHESTPLATE = UNSUPPORTED;
    public static Material CHAINMAIL_LEGGINGS = UNSUPPORTED;
    public static Material CHAINMAIL_BOOTS = UNSUPPORTED;
    public static Material IRON_HELMET = UNSUPPORTED;
    public static Material IRON_CHESTPLATE = UNSUPPORTED;
    public static Material IRON_LEGGINGS = UNSUPPORTED;
    public static Material IRON_BOOTS = UNSUPPORTED;
    public static Material DIAMOND_HELMET = UNSUPPORTED;
    public static Material DIAMOND_CHESTPLATE = UNSUPPORTED;
    public static Material DIAMOND_LEGGINGS = UNSUPPORTED;
    public static Material DIAMOND_BOOTS = UNSUPPORTED;
    public static Material GOLD_HELMET = UNSUPPORTED;
    public static Material GOLD_CHESTPLATE = UNSUPPORTED;
    public static Material GOLD_LEGGINGS = UNSUPPORTED;
    public static Material GOLD_BOOTS = UNSUPPORTED;
    public static Material FLINT = UNSUPPORTED;
    public static Material PORK = UNSUPPORTED;
    public static Material GRILLED_PORK = UNSUPPORTED;
    public static Material PAINTING = UNSUPPORTED;
    public static Material GOLDEN_APPLE = UNSUPPORTED;
    public static Material SIGN = UNSUPPORTED;
    public static Material WOOD_DOOR = UNSUPPORTED;
    public static Material BUCKET = UNSUPPORTED;
    public static Material WATER_BUCKET = UNSUPPORTED;
    public static Material LAVA_BUCKET = UNSUPPORTED;
    public static Material MINECART = UNSUPPORTED;
    public static Material SADDLE = UNSUPPORTED;
    public static Material IRON_DOOR = UNSUPPORTED;
    public static Material REDSTONE = UNSUPPORTED;
    public static Material SNOW_BALL = UNSUPPORTED;
    public static Material BOAT = UNSUPPORTED;
    public static Material LEATHER = UNSUPPORTED;
    public static Material MILK_BUCKET = UNSUPPORTED;
    public static Material CLAY_BRICK = UNSUPPORTED;
    public static Material CLAY_BALL = UNSUPPORTED;
    public static Material SUGAR_CANE = UNSUPPORTED;
    public static Material PAPER = UNSUPPORTED;
    public static Material BOOK = UNSUPPORTED;
    public static Material SLIME_BALL = UNSUPPORTED;
    public static Material STORAGE_MINECART = UNSUPPORTED;
    public static Material POWERED_MINECART = UNSUPPORTED;
    public static Material EGG = UNSUPPORTED;
    public static Material COMPASS = UNSUPPORTED;
    public static Material FISHING_ROD = UNSUPPORTED;
    public static Material WATCH = UNSUPPORTED;
    public static Material GLOWSTONE_DUST = UNSUPPORTED;
    public static Material RAW_FISH = UNSUPPORTED;
    public static Material COOKED_FISH = UNSUPPORTED;
    public static Material INK_SACK = UNSUPPORTED;
    public static Material BONE = UNSUPPORTED;
    public static Material SUGAR = UNSUPPORTED;
    public static Material CAKE = UNSUPPORTED;
    public static Material BED = UNSUPPORTED;
    public static Material DIODE = UNSUPPORTED;
    public static Material COOKIE = UNSUPPORTED;
    public static Material MAP = UNSUPPORTED;
    public static Material SHEARS = UNSUPPORTED;
    public static Material MELON = UNSUPPORTED;
    public static Material PUMPKIN_SEEDS = UNSUPPORTED;
    public static Material MELON_SEEDS = UNSUPPORTED;
    public static Material RAW_BEEF = UNSUPPORTED;
    public static Material COOKED_BEEF = UNSUPPORTED;
    public static Material RAW_CHICKEN = UNSUPPORTED;
    public static Material COOKED_CHICKEN = UNSUPPORTED;
    public static Material ROTTEN_FLESH = UNSUPPORTED;
    public static Material ENDER_PEARL = UNSUPPORTED;
    public static Material BLAZE_ROD = UNSUPPORTED;
    public static Material GHAST_TEAR = UNSUPPORTED;
    public static Material GOLD_NUGGET = UNSUPPORTED;
    public static Material NETHER_STALK = UNSUPPORTED;
    public static Material POTION = UNSUPPORTED;
    public static Material GLASS_BOTTLE = UNSUPPORTED;
    public static Material SPIDER_EYE = UNSUPPORTED;
    public static Material FERMENTED_SPIDER_EYE = UNSUPPORTED;
    public static Material BLAZE_POWDER = UNSUPPORTED;
    public static Material MAGMA_CREAM = UNSUPPORTED;
    public static Material BREWING_STAND_ITEM = UNSUPPORTED;
    public static Material CAULDRON_ITEM = UNSUPPORTED;
    public static Material EYE_OF_ENDER = UNSUPPORTED;
    public static Material SPECKLED_MELON = UNSUPPORTED;
    public static Material MONSTER_EGG = UNSUPPORTED;
    public static Material EXP_BOTTLE = UNSUPPORTED;
    public static Material FIREBALL = UNSUPPORTED;
    public static Material BOOK_AND_QUILL = UNSUPPORTED;
    public static Material WRITTEN_BOOK = UNSUPPORTED;
    public static Material EMERALD = UNSUPPORTED;
    public static Material ITEM_FRAME = UNSUPPORTED;
    public static Material FLOWER_POT_ITEM = UNSUPPORTED;
    public static Material CARROT_ITEM = UNSUPPORTED;
    public static Material POTATO_ITEM = UNSUPPORTED;
    public static Material BAKED_POTATO = UNSUPPORTED;
    public static Material POISONOUS_POTATO = UNSUPPORTED;
    public static Material EMPTY_MAP = UNSUPPORTED;
    public static Material GOLDEN_CARROT = UNSUPPORTED;
    public static Material SKULL_ITEM = UNSUPPORTED;
    public static Material CARROT_STICK = UNSUPPORTED;
    public static Material NETHER_STAR = UNSUPPORTED;
    public static Material PUMPKIN_PIE = UNSUPPORTED;
    public static Material FIREWORK = UNSUPPORTED;
    public static Material FIREWORK_CHARGE = UNSUPPORTED;
    public static Material ENCHANTED_BOOK = UNSUPPORTED;
    public static Material REDSTONE_COMPARATOR = UNSUPPORTED;
    public static Material NETHER_BRICK_ITEM = UNSUPPORTED;
    public static Material QUARTZ = UNSUPPORTED;
    public static Material EXPLOSIVE_MINECART = UNSUPPORTED;
    public static Material HOPPER_MINECART = UNSUPPORTED;
    public static Material IRON_BARDING = UNSUPPORTED;
    public static Material GOLD_BARDING = UNSUPPORTED;
    public static Material DIAMOND_BARDING = UNSUPPORTED;
    public static Material LEASH = UNSUPPORTED;
    public static Material NAME_TAG = UNSUPPORTED;
    public static Material COMMAND_MINECART = UNSUPPORTED;
    public static Material GOLD_RECORD = UNSUPPORTED;
    public static Material GREEN_RECORD = UNSUPPORTED;
    public static Material RECORD_3 = UNSUPPORTED;
    public static Material RECORD_4 = UNSUPPORTED;
    public static Material RECORD_5 = UNSUPPORTED;
    public static Material RECORD_6 = UNSUPPORTED;
    public static Material RECORD_7 = UNSUPPORTED;
    public static Material RECORD_8 = UNSUPPORTED;
    public static Material RECORD_9 = UNSUPPORTED;
    public static Material RECORD_10 = UNSUPPORTED;
    public static Material RECORD_11 = UNSUPPORTED;
    public static Material RECORD_12 = UNSUPPORTED;
}
