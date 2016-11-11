package BossBarAPI;

import cn.nukkit.scheduler.PluginTask;

public class BossBarAPITask extends PluginTask<BossBarAPI> {

    public BossBarAPITask(BossBarAPI owner) {
        super(owner);
    }

    @Override
    public void onRun(int currentTick) {
        this.plugin.getServer().getScheduler().scheduleRepeatingTask(), 10);
    }
}
