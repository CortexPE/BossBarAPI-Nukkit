package nycuro;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;

public class BossBarAPI extends PluginBase {

    @Override
    public void onLoad() {
        registerGenerator();
        this.getLogger().info(TextFormat.WHITE + "BossBarAPI loaded!");
    }

    @Override
    public void onEnable() {
        this.getLogger().info(TextFormat.DARK_GREEN + "BossBarAPI enabled!");
        getServer().getPluginManager().registerEvents(listener, this);
    }

    @Override
    public void onDisable() {
        this.getLogger().info(TextFormat.DARK_RED + "BossBarAPI disabled!");
    }
}
