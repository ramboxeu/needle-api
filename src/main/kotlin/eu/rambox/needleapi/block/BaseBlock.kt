package eu.rambox.needleapi.block

import net.minecraft.item.Item
import net.minecraft.block.Block
import net.minecraft.item.ItemGroup
import net.minecraft.item.block.BlockItem
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

abstract class BaseBlock : Block {
    constructor(blockSettings: Settings, id: String, name: String) : super(blockSettings) {
        Registry.BLOCK.register(Identifier(id, name), this)
        Registry.ITEM.register(Identifier(id, name), BlockItem(this, Item.Settings().stackSize(64).itemGroup(ItemGroup.MISC)))
    }

    constructor(blockSettings: Settings, identifier: Identifier) : super(blockSettings) {
        Registry.BLOCK.register(identifier, this)
        Registry.ITEM.register(identifier, BlockItem(this, Item.Settings().stackSize(64).itemGroup(ItemGroup.MISC)))
    }

    constructor(blockSettings: Settings, id: String, name: String, blockItemSettings: Item.Settings) : super(blockSettings) {
        Registry.BLOCK.register(Identifier(id, name), this)
        Registry.ITEM.register(Identifier(id, name), BlockItem(this, blockItemSettings))
    }

    constructor(blockSettings: Settings, identifier: Identifier, blockItemSettings: Item.Settings) : super(blockSettings) {
        Registry.BLOCK.register(identifier, this)
        Registry.ITEM.register(identifier, BlockItem(this, blockItemSettings))
    }
}