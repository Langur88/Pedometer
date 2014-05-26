package me.Langur.Pedometer;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Pedometer extends JavaPlugin {
	
	
    public void onEnable() {
    		Bukkit.getServer().getPluginManager().registerEvents(StepsScoreboardManager.getInstance(), this);
    		
    		StepsScoreboardManager.getInstance().setupScoreboard(this);
    }
   
    public void onDisable() {
    	StepsScoreboardManager.getInstance().scoreboardSave(this);
    }
}