package BossBarAPI;

import cn.nukkit.scheduler.PluginTask;

public class BossBarAPITask extends PluginTask<MainClass> {

    public BossBarAPITask(BossBarAPI owner) {
        super(owner);
    }

    @Override
    public void onRun(int currentTick) {
        this.getOwner().getLogger().info("I've run on tick " + currentTick);
    }
}
