package BossBarAPI;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;
import cn.nukkit.network.protocol.BossEventPacket;

import java.util.Map;

import cn.nukkit.Server;
import cn.nukkit.Player;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent;

public class BossBarAPI extends PluginBase {

    @Override
    public void onLoad() {
        this.getLogger().info(TextFormat.WHITE + "BossBarAPI loaded!");
    }

    @Override
    public void onEnable() {
        this.getLogger().info(TextFormat.DARK_GREEN + "BossBarAPI enabled!");
    }

    @Override
    public void onDisable() {
        this.getLogger().info(TextFormat.DARK_RED + "BossBarAPI disabled!");
    }
    
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) 
        BossEventPacket pk = new BossEventPacket();
        new TextFormat("Hi " + player.getName() + "!");
        pk.eid = entity.getId();
        this.getServer().broadcastPacket(entity.getViewers(), pk);
}
