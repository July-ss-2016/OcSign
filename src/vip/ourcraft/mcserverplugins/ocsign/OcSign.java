package vip.ourcraft.mcserverplugins.ocsign;

import org.bukkit.plugin.java.JavaPlugin;

public class OcSign extends JavaPlugin {
    private static OcSign instance;

    public void onEnable() {
        instance = this;
    }

    public void loadConfig() {
        saveDefaultConfig();
        reloadConfig();

    }
}
