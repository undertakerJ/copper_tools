package net.undertaker.basiccopper.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.undertaker.basiccopper.BasicCopper;

public class ModItems {
  public static final DeferredRegister<Item> ITEMS =
      DeferredRegister.create(ForgeRegistries.ITEMS, BasicCopper.MODID);
  public static final RegistryObject<Item> COPPER_SWORD =
      ITEMS.register(
          "copper_sword",
          () ->
              new SwordItem(
                  ModToolTiers.COPPER,
                  4,
                  -2.4f,
                  new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).stacksTo(1)));
  public static final RegistryObject<Item> COPPER_PICKAXE =
      ITEMS.register(
          "copper_pickaxe",
          () ->
              new PickaxeItem(
                  ModToolTiers.COPPER,
                  2,
                  -3f,
                  new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(1)));
  public static final RegistryObject<Item> COPPER_AXE =
      ITEMS.register(
          "copper_axe",
          () ->
              new AxeItem(
                  ModToolTiers.COPPER,
                  7.5f,
                  -3.1f,
                  new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(1)));
  public static final RegistryObject<Item> COPPER_SHOVEL =
      ITEMS.register(
          "copper_shovel",
          () ->
              new ShovelItem(
                  ModToolTiers.COPPER,
                  3f,
                  -3f,
                  new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(1)));
  public static final RegistryObject<Item> COPPER_HOE =
      ITEMS.register(
          "copper_hoe",
          () ->
              new HoeItem(
                  ModToolTiers.COPPER,
                  -1,
                  -1f,
                  new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(1)));

  public static final RegistryObject<Item> COPPER_HELMET =
      ITEMS.register(
          "copper_helmet",
          () ->
              new ArmorItem(
                  ModArmorMaterial.COPPER,
                  EquipmentSlot.HEAD,
                  new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).defaultDurability(99)));
  public static final RegistryObject<Item> COPPER_CHESTPLATE =
      ITEMS.register(
          "copper_chestplate",
          () ->
              new ArmorItem(
                  ModArmorMaterial.COPPER,
                  EquipmentSlot.CHEST,
                  new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).defaultDurability(140)));
  public static final RegistryObject<Item> COPPER_LEGGINGS =
      ITEMS.register(
          "copper_leggings",
          () ->
              new ArmorItem(
                  ModArmorMaterial.COPPER,
                  EquipmentSlot.LEGS,
                  new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).defaultDurability(135)));
  public static final RegistryObject<Item> COPPER_BOOTS =
      ITEMS.register(
          "copper_boots",
          () ->
              new ArmorItem(
                  ModArmorMaterial.COPPER,
                  EquipmentSlot.FEET,
                  new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).defaultDurability(115)));

  public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
  }
}
