package ca.pvpcraft.pvppets;

import java.awt.Color;

import net.md_5.bungee.api.ChatColor;

import org.bukkit.Bukkit;
import org.bukkit.entity.AnimalTamer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTameEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author macdja38
 *
 */
public class PvPPets extends JavaPlugin implements Listener{

	/**
	 * 
	 */
	public void onDisable() {
		// TODO Release all resources
		getLogger().info(ChatColor.DARK_GREEN + "PvPPets Disabled.");
		getLogger().info(ChatColor.RED + "PvPPet's will no longer function");
	}

	/**
	 * @param args
	 */
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this,this);
	}
	
	@EventHandler(priority = EventPriority.NORMAL)
	public void entityTameEvent (final EntityTameEvent event) {
		Player p = (Player) event.getOwner();
		p.sendMessage(Color.GREEN + "Congradulations, you tamed your first pet.");
	}

}
