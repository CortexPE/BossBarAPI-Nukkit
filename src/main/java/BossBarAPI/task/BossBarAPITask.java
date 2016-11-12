package BossBarAPI.task;

import cn.nukkit.scheduler.PluginTask;
import cn.nukkit.network.protocol.UpdateAttributesPacket;

import BossBarAPI.attribute.FakeAttribute;
import BossBarAPI.BossBarAPI;

public class BossBarAPITask extends PluginTask<BossBarAPI> {

    public BossBarAPITask(BossBarAPI owner) {
        super(owner);
    }

    @Override
    public void onRun(int currentTick) {
        pk = new UpdateAttributesPacket();
        pk.entries[] = new FakeAttribute(00, this.plugin.timeouttick[strtolower($player->getName())]) - 1, "minecraft:health");
        pk.entityId = this.plugin.wither[strtolower(player.getName())].getId();
        player.dataPacket(pk);
    }
}
