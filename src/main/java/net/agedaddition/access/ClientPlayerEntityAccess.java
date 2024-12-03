package net.agedaddition.access;

import net.minecraft.util.Identifier;

import java.util.List;

public interface ClientPlayerEntityAccess {

    void setProspectorBlocks(List<Identifier> blockIds);

    List<Identifier> getProspectorBlocks();
}
