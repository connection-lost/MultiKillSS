package me.crafter.mc.multikills;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class KillWeapon {
	
	public static Map<Material,String> itemList = new HashMap<Material, String>();
	public static Map<String,String> itemSpecialList = new HashMap<String, String>();
	
	public KillWeapon(File folder) {
		File fi = new File(folder, "items.txt");
		List<String> item = new ArrayList<String>();
		item = scan(fi);
		String[] splitted;
		for (String x : item){
			if (x.contains(":")){
				splitted = x.split(":",2);
				if (splitted[0].equals("JINKELA")){
					itemSpecialList.put("JINKELA", splitted[1]);
				}
				else if (splitted[0].equals("FIST")){
					itemSpecialList.put("FIST", splitted[1]);
				}
				else {
					itemList.put(Material.getMaterial(splitted[0]), splitted[1]);
				}
			}
		}
	}

	public static String gethisweapon(Player killer) {
		if (killer.getItemInHand().hasItemMeta() && killer.getItemInHand().getItemMeta().getDisplayName()!=null) return killer.getItemInHand().getItemMeta().getDisplayName();
		if ((killer.getItemInHand().getType().equals(Material.INK_SACK)) && ((killer.getItemInHand().getDurability() == 15))) return itemSpecialList.get("JINKELA");;
		if (getTweakName(killer.getItemInHand()) != null) return getTweakName(killer.getItemInHand());
		return killer.getItemInHand().getType().name().toLowerCase().replaceAll("_", " ");
	}
	
	

	private static String getTweakName(ItemStack itemInHand) {
		Material item = itemInHand.getType();
	    return itemList.get(item);
	}

	public static String getTweakNameAlternate(ItemStack items){
		Material item = items.getType();
		if (item.equals(Material.IRON_SWORD)) return "����"; 
		if (item.equals(Material.DIAMOND_SWORD)) return "��ʯ��"; 
		if (item.equals(Material.STONE_SWORD)) return "ʯ��";
		if (item.equals(Material.WOOD_SWORD)) return "��ľ��";
		if (item.equals(Material.GOLD_SWORD)) return "������"; 
		if (item.equals(Material.ACTIVATOR_RAIL)) return "��������";
		if (item.equals(Material.ANVIL)) return "����";
		if (item.equals(Material.APPLE)) return "��";
		if (item.equals(Material.ARROW)) return "��";
		if (item.equals(Material.BAKED_POTATO)) return "������������";
		if (item.equals(Material.BEACON)) return "������";
		if (item.equals(Material.BED)) return "����";
		if (item.equals(Material.BED_BLOCK)) return "����";
		if (item.equals(Material.BEDROCK)) return "�ػ�ʯ";
		if (item.equals(Material.BIRCH_WOOD_STAIRS)) return "Ҫ��¥��"; 
		if (item.equals(Material.BLAZE_POWDER)) return "ȼ�������"; 
		if (item.equals(Material.BLAZE_ROD)) return "������"; 
		if (item.equals(Material.BOAT)) return "̩̹���"; 
		if (item.equals(Material.BONE)) return "��״�����"; 
		if (item.equals(Material.BOOK)) return "�ֵ�"; 
		if (item.equals(Material.BOOK_AND_QUILL)) return "����"; 
		if (item.equals(Material.BOOKSHELF)) return "���Ӽ�"; 
		if (item.equals(Material.BOW)) return "����"; 
		if (item.equals(Material.BOWL)) return "����"; 
		if (item.equals(Material.BREAD)) return "��������"; 
		if (item.equals(Material.BREWING_STAND)) return "��ҩ̨"; 
		if (item.equals(Material.BREWING_STAND_ITEM)) return "��ҩ̨"; 
		if (item.equals(Material.BRICK)) return "��ש"; 
		if (item.equals(Material.BRICK_STAIRS)) return "���ʯ"; 
		if (item.equals(Material.BROWN_MUSHROOM)) return "�񶯰�"; 
		if (item.equals(Material.BUCKET)) return "Ͱ��"; ////////////////
		if (item.equals(Material.BURNING_FURNACE)) return "¯��"; 
		if (item.equals(Material.CACTUS)) return "������"; 
		if (item.equals(Material.CAKE)) return "�и�"; 
		if (item.equals(Material.CAKE_BLOCK)) return "�и�"; 
		if (item.equals(Material.CARPET)) return "��̺"; 
		if (item.equals(Material.CARROT)) return "�ܡᲷ"; 
		if (item.equals(Material.CARROT_ITEM)) return "�ܡᲷ"; 
		if (item.equals(Material.CARROT_STICK)) return "����"; 
		if (item.equals(Material.CAULDRON)) return "��Ͱ"; 
		if (item.equals(Material.CAULDRON_ITEM)) return "��Ͱ"; 
		if (item.equals(Material.CHAINMAIL_BOOTS)) return "���˿��"; 
		if (item.equals(Material.CHAINMAIL_CHESTPLATE)) return "�������"; 
		if (item.equals(Material.CHAINMAIL_HELMET)) return "���ñ"; 
		if (item.equals(Material.CHAINMAIL_LEGGINGS)) return "��ն�ȹ"; 
		if (item.equals(Material.CHEST)) return "�۱���"; 
		if (item.equals(Material.CLAY)) return "������"; 
		if (item.equals(Material.CLAY_BALL)) return "ճ���ְ�"; 
		if (item.equals(Material.CLAY_BRICK)) return "��"; 
		if (item.equals(Material.COAL)) return "����"; 
		if (item.equals(Material.COAL_BLOCK)) return "����"; 
		if (item.equals(Material.COAL_ORE)) return "ú��";//////////////////// 
		if (item.equals(Material.COBBLE_WALL)) return "ʯͷ����"; 
		if (item.equals(Material.COBBLESTONE)) return "����ʯ��";//////////////// 
		if (item.equals(Material.COBBLESTONE_STAIRS)) return "���¥��"; 
		if (item.equals(Material.COCOA)) return "���ȶ�"; 
		if (item.equals(Material.COMMAND)) return "ָ���"; 
		if (item.equals(Material.COMPASS)) return "ָ������"; 
		if (item.equals(Material.COOKED_BEEF)) return "���ް�"; 
		if (item.equals(Material.COOKED_CHICKEN)) return "��У����"; 
		if (item.equals(Material.COOKED_FISH)) return "������"; 
		if (item.equals(Material.COOKIE)) return "Ȥ���"; 
		if (item.equals(Material.CROPS)) return "Ķ��һǧ��"; 
		if (item.equals(Material.DAYLIGHT_DETECTOR)) return "����̽����"; 
		if (item.equals(Material.DEAD_BUSH)) return "����"; 
		if (item.equals(Material.DETECTOR_RAIL)) return "̽������";///////////////////// 
		if (item.equals(Material.DIAMOND)) return "һ�ž��Ʋ�����ʯ"; 
		if (item.equals(Material.DIAMOND_AXE)) return "��ʯ��"; 
		if (item.equals(Material.DIAMOND_BARDING)) return "��ʯ��"; 
		if (item.equals(Material.DIAMOND_BLOCK)) return "�Ʋ��Ŵε���ʯ��"; 
		if (item.equals(Material.DIAMOND_BOOTS)) return "��ʯѥ"; 
		if (item.equals(Material.DIAMOND_CHESTPLATE)) return "��ʯ�ؼ�"; 
		if (item.equals(Material.DIAMOND_HELMET)) return "��ʯͷ��"; 
		if (item.equals(Material.DIAMOND_HOE)) return "��������֮ŭ"; 
		if (item.equals(Material.DIAMOND_LEGGINGS)) return "��ʯ����"; 
		if (item.equals(Material.DIAMOND_ORE)) return "���Ͼ��Ʋ�����ʯ��"; 
		if (item.equals(Material.DIAMOND_PICKAXE)) return "��ʯ��"; 
		if (item.equals(Material.DIAMOND_SPADE)) return "��ʯ��"; 
		if (item.equals(Material.DIODE)) return "�����װ��"; 
		if (item.equals(Material.DIODE_BLOCK_OFF)) return "�����װ��"; 
		if (item.equals(Material.DIODE_BLOCK_ON)) return "�����װ��"; 
		if (item.equals(Material.DIRT)) return "�������е��׼ص���"; 
		if (item.equals(Material.DISPENSER)) return "���˻���"; 
		if (item.equals(Material.DOUBLE_STEP)) return "������"; 
		if (item.equals(Material.DRAGON_EGG)) return "���ε���"; 
		if (item.equals(Material.DROPPER)) return "�Զ��ۻ���"; 
		if (item.equals(Material.EGG)) return "����"; 
		if (item.equals(Material.EMERALD)) return "ͨ�û���"; 
		if (item.equals(Material.EMERALD_BLOCK)) return "���ͨ�û���"; 
		if (item.equals(Material.EMERALD_ORE)) return "ͨ�û��Ҳ���"; 
		if (item.equals(Material.EMPTY_MAP)) return "��ֽ"; 
		if (item.equals(Material.ENCHANTED_BOOK)) return "ħ����"; 
		if (item.equals(Material.ENCHANTMENT_TABLE)) return "����̨"; 
		if (item.equals(Material.ENDER_CHEST)) return "������"; 
		if (item.equals(Material.ENDER_PEARL)) return "��������"; 
		if (item.equals(Material.ENDER_PORTAL)) return "��������֮��"; 
		if (item.equals(Material.ENDER_PORTAL_FRAME)) return "��������֮��"; 
		if (item.equals(Material.ENDER_STONE)) return "����ʯ"; 
		if (item.equals(Material.EXP_BOTTLE)) return "�ڲ�ƿ"; 
		if (item.equals(Material.EXPLOSIVE_MINECART)) return "��������"; 
		if (item.equals(Material.EYE_OF_ENDER)) return "������"; 
		if (item.equals(Material.FEATHER)) return "ë"; 
		if (item.equals(Material.FENCE)) return "���뻤��"; 
		if (item.equals(Material.FENCE_GATE)) return "������"; 
		if (item.equals(Material.FERMENTED_SPIDER_EYE)) return "֩��������"; 
		if (item.equals(Material.FIRE)) return "����"; 
		if (item.equals(Material.FIREBALL)) return "FFF��ҩ"; 
		if (item.equals(Material.FIREWORK_CHARGE)) return "�񻨵�"; 
		if (item.equals(Material.FIREWORK)) return "������"; 
		if (item.equals(Material.FISHING_ROD)) return "�ƾɵ���"; 
		if (item.equals(Material.FLINT)) return "���ʯ"; 
		if (item.equals(Material.FLINT_AND_STEEL)) return "����"; 
		if (item.equals(Material.FLOWER_POT)) return "����"; 
		if (item.equals(Material.FLOWER_POT_ITEM)) return "����"; 
		if (item.equals(Material.FURNACE)) return "¯��"; 
		if (item.equals(Material.GHAST_TEAR)) return "��ʹ֮�I"; 
		if (item.equals(Material.GLASS)) return "����ʯ"; 
		if (item.equals(Material.GLASS_BOTTLE)) return "��ƿ"; 
		if (item.equals(Material.GLOWING_REDSTONE_ORE)) return "�����ʯ��"; 
		if (item.equals(Material.GLOWSTONE)) return "����ʯ";  
		if (item.equals(Material.GLOWSTONE_DUST)) return "��֬"; 
		if (item.equals(Material.GOLD_AXE)) return "������"; 
		if (item.equals(Material.GOLD_BARDING)) return "�������"; 
		if (item.equals(Material.GOLD_BLOCK)) return "����������"; 
		if (item.equals(Material.GOLD_BOOTS)) return "����˿��"; 
		if (item.equals(Material.GOLD_CHESTPLATE)) return "��������"; 
		if (item.equals(Material.GOLD_HELMET)) return "��ɴñ";  
		if (item.equals(Material.GOLD_HOE)) return "��������֮��"; 
		if (item.equals(Material.GOLD_INGOT)) return "��������"; 
		if (item.equals(Material.GOLD_LEGGINGS)) return "������ȹ"; 
		if (item.equals(Material.GOLD_NUGGET)) return "������"; 
		if (item.equals(Material.GOLD_ORE)) return "������ʯ"; 
		if (item.equals(Material.GOLD_PICKAXE)) return "������"; 
		if (item.equals(Material.GOLD_PLATE)) return "�����ذ�"; 
		if (item.equals(Material.GOLD_RECORD)) return "��"; 
		if (item.equals(Material.RECORD_3)) return "��";
		if (item.equals(Material.RECORD_4)) return "��";
		if (item.equals(Material.RECORD_5)) return "��";
		if (item.equals(Material.RECORD_6)) return "��";
		if (item.equals(Material.RECORD_7)) return "��";
		if (item.equals(Material.RECORD_8)) return "��";
		if (item.equals(Material.RECORD_9)) return "��";
		if (item.equals(Material.RECORD_10)) return "��";
		if (item.equals(Material.RECORD_11)) return "��";
		if (item.equals(Material.RECORD_12)) return "��";
		if (item.equals(Material.GOLD_SPADE)) return "������"; 
		if (item.equals(Material.GOLDEN_APPLE)) return "����ƻ��"; 
		if (item.equals(Material.GOLDEN_CARROT)) return "�����ܲ�"; 
		if (item.equals(Material.GRASS)) return "ܳ"; 
		if (item.equals(Material.GRAVEL)) return "��ʯɳ"; 
		if (item.equals(Material.GREEN_RECORD)) return "��"; 
		if (item.equals(Material.GRILLED_PORK)) return "������"; 
		if (item.equals(Material.HARD_CLAY)) return "��Ӳ����"; 
		if (item.equals(Material.HAY_BLOCK)) return "�ǻҸ�"; 
		if (item.equals(Material.HOPPER)) return "Բ׶��"; 
		if (item.equals(Material.HOPPER_MINECART)) return "Բ׶������"; 
		if (item.equals(Material.HUGE_MUSHROOM_1)) return "��Ģ��"; 
		if (item.equals(Material.HUGE_MUSHROOM_2)) return "��Ģ��"; 
		if (item.equals(Material.ICE)) return "����֮��"; 
		if (item.equals(Material.INK_SACK)) return "����";
		if ((item.equals(Material.INK_SACK)) && (items.getDurability() == 15)) return "�����";
		if (item.equals(Material.IRON_AXE)) return "����"; 
		if (item.equals(Material.IRON_BARDING)) return "�����"; 
		if (item.equals(Material.IRON_BLOCK)) return "����"; 
		if (item.equals(Material.IRON_BOOTS)) return "��Ь"; 
		if (item.equals(Material.IRON_DOOR)) return "����"; 
		if (item.equals(Material.IRON_FENCE)) return "����"; 
		if (item.equals(Material.IRON_HELMET)) return "��ͷ��"; 
		if (item.equals(Material.IRON_HOE)) return "��������֮��"; 
		if (item.equals(Material.IRON_INGOT)) return "����"; 
		if (item.equals(Material.IRON_ORE)) return "����"; 
		if (item.equals(Material.IRON_PICKAXE)) return "����"; 
		if (item.equals(Material.IRON_PLATE)) return "���ذ�"; 
		if (item.equals(Material.ITEM_FRAME)) return "����"; 
		if (item.equals(Material.JACK_O_LANTERN)) return "��ʥ����"; 
		if (item.equals(Material.JUKEBOX)) return "������"; 
		if (item.equals(Material.JUNGLE_WOOD_STAIRS)) return "��ү¥��"; 
		if (item.equals(Material.LADDER)) return "����"; 
		if (item.equals(Material.LAPIS_BLOCK)) return "����ʯ"; 
		if (item.equals(Material.LAPIS_ORE)) return "����ʯ��"; 
		if (item.equals(Material.LAVA)) return "�ҽ�"; 
		if (item.equals(Material.LAVA_BUCKET)) return "һͰ��ˮ"; 
		if (item.equals(Material.LEASH)) return "����"; 
		if (item.equals(Material.LEATHER)) return "��Ƥ"; 
		if (item.equals(Material.LEATHER_BOOTS)) return "ƤЬ"; 
		if (item.equals(Material.LEATHER_CHESTPLATE)) return "Ƥ��"; 
		if (item.equals(Material.LEATHER_HELMET)) return "Ƥñ"; 
		if (item.equals(Material.LEATHER_LEGGINGS)) return "Ƥ��"; 
		if (item.equals(Material.LEAVES)) return "��Ҷ"; 
		if (item.equals(Material.LEVER)) return "�ܸ�"; 
		//if (item.equals(Material.LOCKED_CHEST)) return "����"; 
		if (item.equals(Material.LOG)) return "����ľͷ"; 
		if (item.equals(Material.LONG_GRASS)) return "ܳ"; 
		if (item.equals(Material.MAGMA_CREAM)) return "����ʷ��ķ��"; 
		if (item.equals(Material.MAP)) return "������ͼ"; 
		if (item.equals(Material.MELON)) return "����"; 
		if (item.equals(Material.MELON_BLOCK)) return "������"; 
		if (item.equals(Material.MELON_SEEDS)) return "����"; 
		if (item.equals(Material.MELON_STEM)) return "����"; 
		if (item.equals(Material.MILK_BUCKET)) return "�����谷"; 
		if (item.equals(Material.MINECART)) return "��ɽ��"; 
		//if (item.equals(Material.MOB_SPAWNER)) return "ˢ����"; 
		if (item.equals(Material.MONSTER_EGG)) return "���ﵰ��"; 
		if (item.equals(Material.MONSTER_EGGS)) return "���ﵰ��"; 
		if (item.equals(Material.MOSSY_COBBLESTONE)) return "��ë��ʯͷ"; 
		if (item.equals(Material.MUSHROOM_SOUP)) return "��Ģ����"; 
		if (item.equals(Material.MYCEL)) return "��ʴ֮��"; 
		if (item.equals(Material.NAME_TAG)) return "����"; 
		if (item.equals(Material.NETHER_BRICK)) return "�½�שͷ"; 
		if (item.equals(Material.NETHER_BRICK_ITEM)) return "�½��ש"; 
		if (item.equals(Material.NETHER_BRICK_STAIRS)) return "������"; 
		if (item.equals(Material.NETHER_FENCE)) return "��������"; 
		if (item.equals(Material.NETHER_STALK)) return "������Ģ��"; 
		if (item.equals(Material.NETHER_STAR)) return "ʷʫ������"; 
		if (item.equals(Material.NETHER_WARTS)) return "������Ģ��"; 
		if (item.equals(Material.NETHERRACK)) return "��������"; 
		if (item.equals(Material.NOTE_BLOCK)) return "������"; 
		if (item.equals(Material.OBSIDIAN)) return "��ɽ��"; 
		if (item.equals(Material.PAINTING)) return "��ѧ�һ�"; 
		if (item.equals(Material.PAPER)) return "��ֽһ��"; 
		if (item.equals(Material.PISTON_BASE)) return "������"; 
		if (item.equals(Material.PISTON_EXTENSION)) return "������"; 
		if (item.equals(Material.PISTON_MOVING_PIECE)) return "������"; 
		if (item.equals(Material.PISTON_STICKY_BASE)) return "ճ��������"; 
		if (item.equals(Material.POISONOUS_POTATO)) return "��ѿ��������"; 
		if (item.equals(Material.PORK)) return "����"; 
		if (item.equals(Material.PORTAL)) return "������"; 
		if (item.equals(Material.POTATO)) return "������������"; 
		if (item.equals(Material.POTATO_ITEM)) return "������������"; 
		if (item.equals(Material.POTION)) return "ˮ��"; 
		if (item.equals(Material.POWERED_MINECART)) return "������"; 
		if (item.equals(Material.POWERED_RAIL)) return "��������"; 
		if (item.equals(Material.PUMPKIN)) return "�Ϲ�ͷ"; 
		if (item.equals(Material.PUMPKIN_PIE)) return "�Ϲϱ�"; 
		if (item.equals(Material.PUMPKIN_SEEDS)) return "�Ϲ���"; 
		if (item.equals(Material.PUMPKIN_STEM)) return "�Ϲ���";
		if (item.equals(Material.QUARTZ)) return "��������"; 
		if (item.equals(Material.QUARTZ_BLOCK)) return "��Ŷ�������"; 
		if (item.equals(Material.QUARTZ_ORE)) return "���"; 
		if (item.equals(Material.QUARTZ_STAIRS)) return "�轺¥��"; 
		if (item.equals(Material.RAILS)) return "������"; 
		if (item.equals(Material.RAW_BEEF)) return "����"; 
		if (item.equals(Material.RAW_CHICKEN)) return "����"; 
		if (item.equals(Material.RAW_FISH)) return "����"; 
		if (item.equals(Material.RED_MUSHROOM)) return "��Ģ��"; 
		if (item.equals(Material.RED_ROSE)) return "����õ��"; 
		if (item.equals(Material.REDSTONE)) return "��˪"; 
		if (item.equals(Material.REDSTONE_BLOCK)) return "��˪����"; 
		if (item.equals(Material.REDSTONE_COMPARATOR)) return "��˪������"; 
		if (item.equals(Material.REDSTONE_COMPARATOR_OFF)) return "��˪������"; 
		if (item.equals(Material.REDSTONE_COMPARATOR_ON)) return "��˪������"; 
		if (item.equals(Material.REDSTONE_LAMP_OFF)) return "������֮��"; 
		if (item.equals(Material.REDSTONE_LAMP_ON)) return "������֮��"; 
		if (item.equals(Material.REDSTONE_ORE)) return "��˪ԭ����"; 
		if (item.equals(Material.REDSTONE_TORCH_OFF)) return "��˪���"; 
		if (item.equals(Material.REDSTONE_TORCH_ON)) return "��˪���"; 
		if (item.equals(Material.REDSTONE_WIRE)) return "��˪��·"; 
		if (item.equals(Material.ROTTEN_FLESH)) return "��ù����"; 
		if (item.equals(Material.SADDLE)) return "Ƥ���"; 
		if (item.equals(Material.SAND)) return "��ɳ"; 
		if (item.equals(Material.SANDSTONE)) return "ɳʯ"; //////////////////
		if (item.equals(Material.SANDSTONE_STAIRS)) return "ɳʯ¥��"; /////////////
		if (item.equals(Material.SAPLING)) return "������"; 
		if (item.equals(Material.SEEDS)) return "BT����"; 
		if (item.equals(Material.SHEARS)) return "���ᵶ"; 
		if (item.equals(Material.SIGN)) return "���ֱ�"; 
		if (item.equals(Material.SIGN_POST)) return "���ֱ�"; 
		if (item.equals(Material.SKULL)) return "ͷ­"; 
		if (item.equals(Material.SKULL_ITEM)) return "ͷ­"; 
		if (item.equals(Material.SLIME_BALL)) return "��й��"; 
		if (item.equals(Material.SMOOTH_BRICK)) return "Բ��ש"; 
		if (item.equals(Material.SMOOTH_STAIRS)) return "Բ��¥��"; 
		if (item.equals(Material.SNOW)) return "Ѫ"; 
		if (item.equals(Material.SNOW_BALL)) return "Ѫ��"; 
		if (item.equals(Material.SNOW_BLOCK)) return "Ѫ����"; 
		if (item.equals(Material.SOIL)) return "����"; 
		if (item.equals(Material.SOUL_SAND)) return "�ж�ɳ"; 
		if (item.equals(Material.SPECKLED_MELON)) return "��������"; 
		if (item.equals(Material.SPIDER_EYE)) return "֩������"; 
		if (item.equals(Material.SPONGE)) return "���౦��"; 
		if (item.equals(Material.SPRUCE_WOOD_STAIRS)) return "С¥��"; 
		if (item.equals(Material.STAINED_CLAY)) return "�ɿ�"; 
		if (item.equals(Material.STATIONARY_LAVA)) return "�ҽ�"; 
		if (item.equals(Material.STATIONARY_WATER)) return "ˮ"; 
		if (item.equals(Material.STEP)) return "Сʯͷ"; 
		if (item.equals(Material.STICK)) return "������"; 
		if (item.equals(Material.STONE)) return "����յ�ԭ��"; 
		if (item.equals(Material.STONE_AXE)) return "ʯ��"; 
		if (item.equals(Material.STONE_HOE)) return "��������֮ϣ��"; 
		if (item.equals(Material.STONE_PICKAXE)) return "ʯ��"; 
		if (item.equals(Material.STONE_PLATE)) return "ʯ�ذ�"; 
		if (item.equals(Material.STONE_SPADE)) return "ʯ��";  
		if (item.equals(Material.STORAGE_MINECART)) return "����"; 
		if (item.equals(Material.STRING)) return "ë��"; 
		if (item.equals(Material.SUGAR)) return "����"; 
		if (item.equals(Material.SUGAR_CANE_BLOCK)) return "����"; 
		if (item.equals(Material.SULPHUR)) return "���"; 
		if (item.equals(Material.THIN_GLASS)) return "�ٽ��ʯƬ"; 
		if (item.equals(Material.TNT)) return "��ë��"; 
		if (item.equals(Material.TORCH)) return "���"; 
		if (item.equals(Material.TRAP_DOOR)) return "������"; 
		if (item.equals(Material.TRAPPED_CHEST)) return "�پ۱���"; 
		if (item.equals(Material.TRIPWIRE)) return "����"; 
		if (item.equals(Material.TRIPWIRE_HOOK)) return "������"; 
		if (item.equals(Material.VINE)) return "����"; 
		if (item.equals(Material.WALL_SIGN)) return "���ֱ�"; 
		if (item.equals(Material.WATCH)) return "ʱ��"; 
		if (item.equals(Material.WATER)) return "ˮ"; 
		if (item.equals(Material.WATER_BUCKET)) return "Ͱװˮ"; 
		if (item.equals(Material.WATER_LILY)) return "�����"; 
		if (item.equals(Material.WEB)) return "������"; 
		if (item.equals(Material.WHEAT)) return "Ķ��һǧ��"; 
		if (item.equals(Material.WOOD)) return "����ľͷ"; 
		if (item.equals(Material.WOOD_AXE)) return "ľ��"; 
		if (item.equals(Material.WOOD_BUTTON)) return "ľ�ʰ�ť"; 
		if (item.equals(Material.WOOD_DOOR)) return "������"; 
		if (item.equals(Material.WOOD_DOUBLE_STEP)) return "ľͷ��"; 
		if (item.equals(Material.WOOD_HOE)) return "��������֮��ѿ"; 
		if (item.equals(Material.WOOD_PICKAXE)) return "ľ��"; 
		if (item.equals(Material.WOOD_PLATE)) return "ľ�ذ�"; 
		if (item.equals(Material.WOOD_SPADE)) return "ľ��"; 
		if (item.equals(Material.WOOD_STAIRS)) return "ľ��"; 
		if (item.equals(Material.WOOD_STEP)) return "Сľ��";  
		if (item.equals(Material.WOODEN_DOOR)) return "ľ��"; 
		if (item.equals(Material.WOOL)) return "����"; 
		if (item.equals(Material.WORKBENCH)) return "����̨"; 
		if (item.equals(Material.WRITTEN_BOOK)) return "���ڱ�";
		if (item.equals(Material.YELLOW_FLOWER)) return "�ѹ�Ӣ"; 
		return null;
	}
	
	public List<String> scan(File file){
		List<String> ret = new ArrayList<String>();
		try {
			Scanner scanner = new Scanner(new FileReader(file));
			while (scanner.hasNextLine()) {
				ret.add(scanner.nextLine());
			}
			scanner.close();
		} catch (Exception e){
			}
		return ret;
	}
	
}
