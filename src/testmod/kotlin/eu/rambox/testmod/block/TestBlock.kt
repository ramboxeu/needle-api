package eu.rambox.testmod.block

import eu.rambox.needleapi.block.BaseBlock
import net.fabricmc.fabric.api.block.FabricBlockSettings
import net.minecraft.block.Material
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup

class TestBlock : BaseBlock (
        FabricBlockSettings.of(Material.AIR).build(),
        "testmod",
        "testblock",
        Item.Settings().stackSize(64).itemGroup(ItemGroup.BUILDING_BLOCKS)
) {

}