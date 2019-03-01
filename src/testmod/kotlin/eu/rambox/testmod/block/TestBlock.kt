package eu.rambox.testmod.block

import com.google.common.collect.Sets
import eu.rambox.needleapi.block.BaseBlock
import net.fabricmc.fabric.api.block.FabricBlockSettings
import net.minecraft.block.Material
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.world.biome.Biomes
import net.minecraft.world.gen.decorator.RangeDecoratorConfig

class TestBlock : BaseBlock (
        FabricBlockSettings.of(Material.ANVIL).build(),
        "testmod",
        "testblock",
        Item.Settings().stackSize(64).itemGroup(ItemGroup.BUILDING_BLOCKS)
) {
    init {
        this.generateAsOre(Sets.newHashSet(Biomes.PLAINS), 16, RangeDecoratorConfig(20,0,0,128))
    }
}