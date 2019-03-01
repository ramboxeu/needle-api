package eu.rambox.needleapi.block

import net.minecraft.item.Item
import net.minecraft.block.Block
import net.minecraft.item.ItemGroup
import net.minecraft.item.block.BlockItem
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import net.minecraft.world.biome.Biome
import net.minecraft.world.gen.GenerationStep
import net.minecraft.world.gen.decorator.Decorator
import net.minecraft.world.gen.decorator.RangeDecoratorConfig
import net.minecraft.world.gen.feature.Feature
import net.minecraft.world.gen.feature.OreFeatureConfig

open class BaseBlock : Block {
    constructor(blockSettings: Settings, id: String, name: String, blockItemSettings: Item.Settings?) : super(blockSettings) {
        registerBlock(id = id, name = name, blockItemSettings = blockItemSettings)
    }

    constructor(blockSettings: Settings, identifier: Identifier, blockItemSettings: Item.Settings?) : super(blockSettings) {
        registerBlock(identifier = identifier, blockItemSettings = blockItemSettings)
    }

    // May change its name
    fun generateAsOre(biomes: Set<Biome>? = Biome.BIOMES, size: Int, rangeDecoratorConfig: RangeDecoratorConfig) {
        biomes?.forEach { biome -> biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Biome.configureFeature(Feature.ORE, OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, this.defaultState, size), Decorator.COUNT_RANGE, rangeDecoratorConfig)) }
    }

    private fun registerBlock(id: String? = null, name: String? = null, identifier: Identifier? = null, blockItemSettings: Item.Settings? = null) {
        Registry.BLOCK.register(identifier ?: Identifier(id, name), this)
        Registry.ITEM.register(identifier ?: Identifier(id, name), BlockItem(this, blockItemSettings ?: Item.Settings().itemGroup(ItemGroup.MISC).stackSize(64)))
    }
}