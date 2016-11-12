package BossBarAPI;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;
import cn.nukkit.network.protocol.BossEventPacket;

import BiomeMaster.entity.EntityWither;

import java.util.Map;

import cn.nukkit.event.player.PlayerJoinEvent;

import cn.nukkit.plugin.Plugin;

public class BossBarAPI extends PluginBase {

    @Override
    public void onLoad() {
        this.getLogger().info(TextFormat.WHITE + "BossBarAPI loaded!");
    }

    @Override
    public void onEnable() {
        this.getLogger().info(TextFormat.DARK_GREEN + "BossBarAPI enabled!");
        this.getServer().getScheduler().scheduleRepeatingTask(new BossBarAPITask(this), 1);
    }

    @Override
    public void onDisable() {
        this.getLogger().info(TextFormat.DARK_RED + "BossBarAPI disabled!");
    }
    
    public void onPlayerJoin(PlayerJoinEvent e) {
        BossEventPacket pk = new BossEventPacket();
        e.getPlayer().setNameTag("BossBarAPI NameTag");
        e.getPlayer().dataPacket(pk);
    }
}
