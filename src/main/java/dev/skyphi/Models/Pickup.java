package dev.skyphi.Models;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public abstract class Pickup {
    
    protected ItemStack itemStack;
    protected String name, description;
    protected Player owner;

    protected Item spawnedItem;

    protected void init() {
        itemStack = new ItemStack(Material.FEATHER);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(name);
        itemMeta.setLore(Arrays.asList(description));
        itemStack.setItemMeta(itemMeta);
    }

    public abstract void activate();

    // GETTERS/SETTERS

    public ItemStack getItemStack() { return itemStack; }

    public Player getOwner() { return owner; }
    public void setOwner(Player owner) { this.owner = owner; }

    public Item getSpawnedItem() { return spawnedItem; }
    public void setSpawnedItem(Item spawnedItem) { this.spawnedItem = spawnedItem; }

}
