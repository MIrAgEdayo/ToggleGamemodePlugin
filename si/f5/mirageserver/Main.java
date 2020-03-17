package si.f5.mirageserver;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    static final String prefix = "§c[§5ToggleGamemode§c]§f";

    @Override
    public void onEnable() {
        getLogger().info("Enabled!");
        getCommand("togglegm").setExecutor(new Command());
    }

    @Override
    public void onDisable() {
        Bukkit.broadcastMessage(prefix + "§cDisabled!");
    }
}
