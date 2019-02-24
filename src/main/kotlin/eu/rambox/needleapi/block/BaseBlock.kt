package eu.rambox.needleapi.block

import net.minecraft.item.Item
import net.minecraft.block.Block
import net.minecraft.item.ItemGroup
import net.minecraft.item.block.BlockItem
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

abstract class BaseBlock : Block {
    constructor(blockSettings: Settings, id: String, name: String) : super(blockSettings) {
        this.registerBlock(id = id, name = name)
    }

    constructor(blockSettings: Settings, identifier: Identifier) : super(blockSettings) {
        this.registerBlock(identifier = identifier)
    }

    constructor(blockSettings: Settings, id: String, name: String, blockItemSettings: Item.Settings) : super(blockSettings) {
        this.registerBlock(id = id, name = name, blockItemSettings = blockItemSettings)
    }

    constructor(blockSettings: Settings, identifier: Identifier, blockItemSettings: Item.Settings) : super(blockSettings) {
        this.registerBlock(identifier = identifier, blockItemSettings = blockItemSettings)
    }

    private fun registerBlock(id: String? = null, name: String? = null, identifier: Identifier? = null, blockItemSettings: Item.Settings? = null) {
        Registry.BLOCK.register(identifier ?: Identifier(id, name), this)
        Registry.ITEM.register(identifier ?: Identifier(id, name), BlockItem(this, blockItemSettings ?: Item.Settings().itemGroup(ItemGroup.MISC).stackSize(64)))
    }
}