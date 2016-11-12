package BossBarAPI.entity;

import cn.nukkit.entity.Entity;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;
import cn.nukkit.item.Item;
import cn.nukkit.network.protocol.AddEntityPacket;
import cn.nukkit.Player;

public class EntityWither extends Entity {
    public static final int NETWORK_ID = 52;
  
    @Override
    public int getNetworkId() {
        return NETWORK_ID;
    }
  
    public EntityWither(FullChunk chunk, CompoundTag nbt) {
        super(chunk, nbt);
    }
  
    @Override
    protected void initEntity() {
        this.setMaxHealth(300);
        super.initEntity();
    }
  
    @Override
    public void spawnTo(Player player) {
        AddEntityPacket pk = new AddEntityPacket();
        pk.type = this.getNetworkId();
        pk.entityUniqueId = this.getId();
        pk.entityRuntimeId = this.getId();
        pk.x = (float) this.x;
        pk.y = (float) this.y;
        pk.z = (float) this.z;
        pk.speedX = (float) this.motionX;
        pk.speedY = (float) this.motionY;
        pk.speedZ = (float) this.motionZ;
        pk.metadata = this.dataProperties;
        player.dataPacket(pk);

        super.spawnTo(player);
    }
}
