package eu.rambox.testmod.block

import eu.rambox.needleapi.block.BaseBlock
import eu.rambox.testmod.TestMod
import net.fabricmc.fabric.api.block.FabricBlockSettings
import net.minecraft.block.Material
import net.minecraft.item.ItemGroup

class TestBlock() : BaseBlock (
        FabricBlockSettings.of(Material.AIR).build(),
        "testmod",
        "TestBlock"
) {
    override fun onRegistered() {
        TestMod.logger.debug("Registered block ${this.name}")
    }

    init {
        this.blockItemGroup = ItemGroup.BREWING
        this.stackSize = 128
    }
}